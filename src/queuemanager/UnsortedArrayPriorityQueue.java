package queuemanager;

/**
 * Implementation of the PriorityQueue ADT using a sorted array for storage.
 *
 * Because Java does not allow generic arrays (!), this is implemented as an
 * array of Object rather than of PriorityItem&lt;T&gt;, which would be natural.
 * Array elements accessed then have to be cast to PriorityItem&lt;T&gt; before
 * using their getItem() or getPriority() methods.
 * 
 * This is an example of Java's poor implementation getting in the way. Java
 * fanboys will no doubt explain at length why it has to be this way, but note
 * that Eiffel allows it because Eiffel generics were done right from the start,
 * rather than being tacked on as an afterthought and limited by issues of
 * backward compatibility. Humph!
 * 
 * @param <T> The type of things being stored.
 */
public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {
    
    /**
     * Where the data is actually stored.
     */
    private final Object[] storage;

    /**
     * The size of the storage array.
     */
    private final int capacity;

    /**
     * The index of the last item stored.
     *
     * This is equal to the item count minus one.
     */
    private int tailIndex;
    
    /**
     * 
     * the index of the item found by the code in the head,
     * in this case this is the item with the highest priority
     * 
     */
    private int headIndex;

    /**
     * Create a new empty queue of the given size.
     *
     * @param size
     */
    public UnsortedArrayPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }

    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            
            throw new QueueUnderflowException();
            
        } else {
            
             /**
             * use a loop to find the highest priority task and add that to the head
             *
             * code has been cannibalized from the add() function in the Sorted Array file
             */
             
             int priority= 0;
             int i = tailIndex + 1;
             
             /**
              * stores the location in the array of the Highest priority item
              */
             int id = 0;
             
            while (i > 0 ) {
                
                if (((PriorityItem<T>) storage[i - 1]).getPriority() > priority)
                {
                    
                priority = ((PriorityItem<T>) storage[i - 1]).getPriority();
                
                id = i - 1;
               
                }
                i = i - 1;
                
            }
            
            headIndex = id;
            
            return ((PriorityItem<T>) storage[id]).getItem();
            
        }
        
    }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            /* No resizing implemented, but that would be a good enhancement. */
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else {
            /* insert at the lateest valid oint in the array */
            int i = tailIndex;
            
            storage[i] = new PriorityItem<>(item, priority);
        }
    }

    @Override
    public void remove() throws QueueUnderflowException {
         if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
             
             storage[headIndex] = null;
             
                        
            for (int i = 0; i < tailIndex; i++) {
                               
                if (storage[i] == null){
                    
                    storage[i] = storage[i + 1];
                
                    storage[i + 1] = null;
                }
                
            }
            tailIndex = tailIndex - 1;
        }
         
         
    }

    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }
}
