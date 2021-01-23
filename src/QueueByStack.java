import java.util.Iterator;
import java.util.Optional;
import java.util.Stack;

public class QueueByStack<T> implements Iterable<T> {

    Stack<T> stack = new Stack<>();

    public void enqueue(T item){
        stack.push(item);
    }

    public Optional<T> dequeue() {

        if(!stack.empty()){
            T item = stack.iterator().next();
            stack.remove(0);
            return Optional.of(item);
        } else{
            return Optional.empty();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) stack.iterator();
    }
}
