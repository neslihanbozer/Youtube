import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private HashMap<Integer, Node> lruHashMap = new HashMap<>();

    private static final int DEFAULT_CACHE_SIZE = 5;
    private Node head, tail;

    class Node{
        int value;
        Node prev, next;

        public Node(int value){
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        public Node(int value, Node prev, Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public void addData(int value) {
        if(head == null){
            head = new Node(value);
            tail = head;
            lruHashMap.put(value, head);
            return;
        }

        if(lruHashMap.containsKey(value)){
            // Item already in the linked list
            // Delete item first

            Node deleteNode = lruHashMap.get(value);
            deleteNode.next.prev = deleteNode.prev;
            deleteNode.prev.next = deleteNode.next;
        }

        Node newNode = new Node(value, null, head);
        // Add item to head
        head.prev = newNode;
        head = head.prev;

        lruHashMap.put(value, newNode);

        checkSize();
    }

    private void checkSize() {
        if(lruHashMap.size() > DEFAULT_CACHE_SIZE){
            removeLast();
        }
    }

    private void removeLast() {
        int value = tail.value;

        tail = tail.prev;
        tail.next = null;

        lruHashMap.remove(value);
    }


    public int[] getDataFromLRUCache() {

        int[] array = new int[DEFAULT_CACHE_SIZE];
        int i = 0;

        for(Map.Entry<Integer, Node> entry : lruHashMap.entrySet()){
            array[i++] = entry.getKey();
        }
        return array;
    }
}
