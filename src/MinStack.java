public class MinStack {


    class Node{

        private int data;
        private int min;
        private Node next;

        private Node(int data, int min){
            this.data = data;
            this.min = min;
        }
    }

    private Node head;

    public void push(int data){
        int min = data;

        // check for a min every time when we add a node
        if(head != null){
            min = Math.min(data, getMin());
        }

        Node newNode = new Node(data, min);
        newNode.next = head;
        head = newNode;
    }

    public int getMin(){
        return head.min;
    }

    public int pop(){
        int data = head.data;
        head = head.next;

        return data;
    }
}
