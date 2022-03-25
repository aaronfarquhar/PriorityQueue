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
public class SortedListPriorityQueue<T> implements PriorityQueue<T> {
    
        private PriorityItem<T> head;
        
       
  
  
    public SortedListPriorityQueue() {
        head = null;
        
               
    }

    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            
            throw new QueueUnderflowException();
            
        } else {          
                     
            return head.getItem();
        
        }
    }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
       
        //create a new node and save the head as current for looping
         PriorityItem<T> newNode = new PriorityItem<T>(item, priority);
       
         PriorityItem<T> current = head;
         PriorityItem<T> previous = null;
     

     
    while(current != null && priority < current.getPriority()){
        
      previous = current;
      current = current.next;
    }
    
    if(isEmpty()){
        
      head = newNode;
 
    } else if (previous == null){
    
        previous = current;
        
        head = newNode;
        
        newNode.next = previous;
 
    }else {
  
      previous.next = newNode;
   
    }
    newNode.next = current;
  
    }

    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else if (head.next == null){
            
            head = null;
            
        } else{
      
        head = head.next;
       
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        
         PriorityItem<T> current = head;
          String result = "[";
          
            while(current != null){
              result = result + current.toString();
              current = current.next;
            }
        return result;
    }
}
