package queuemanager;

/**
 * A wrapper for bundling up an item and its integer priority.
 * 
 * @param <T>
 */
public class PriorityItem<T> {

    private final T item;
    private final int priority;
    
    //reference to the next node for the LinkedList
    PriorityItem<T> next;

    public PriorityItem(T item, int priority) {
        this.item = item;
        this.priority = priority;
        this.next = null;
    }

    public T getItem() {
        return item;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "(" + getItem() + ", " + getPriority() + ")";
    }
}
