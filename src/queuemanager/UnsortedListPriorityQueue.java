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
public class UnsortedListPriorityQueue<T> implements PriorityQueue<T> {
    
        private PriorityItem<T> head;
         private PriorityItem<T> tail;
         private int size = 0;
         
         //for saveing the Index of the highest priority node, used in removal of head
         private PriorityItem<T>  headQueue;
      
       
  
  
    public UnsortedListPriorityQueue() {
        head = null;
        tail = null;
               
    }

    @Override
    public T head() throws QueueUnderflowException {
        
        int priority = 0;    
       
        PriorityItem<T> current = head;
        
        PriorityItem<T> previous = null; 
        
        
        if (isEmpty()) {
            
            throw new QueueUnderflowException();
            
        }else if (head.next == null){
            
            
            return head.getItem();
        
        
        
        
        } else{
            
              for(int i = 0; i < size; i++){
               
                if( priority < current.getPriority()){
                    
                    priority = current.getPriority();
                    
                    headQueue = current;
                    
                    previous = current;
                    
                    if (current.next != null){
                        
                    current = current.next;  
                    
                    }
                
                } else {
                    
                    headQueue = previous;
                
                    return previous.getItem();
                
                }
                     
              }  
         
            
        }
        return current.getItem();
           
    }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
       
        //create a new node and save the head as current for looping
         PriorityItem<T> newNode = new PriorityItem<T>(item, priority);
 
    if(isEmpty()){
        
      head = newNode;
      
      size++;
    } else if(tail == null) {
    
    head.next = newNode;
    tail = newNode;
    size++;
    
    }
    
    else {
        
        tail.next = newNode;
        tail = newNode;
        size++;
        
        
    }
  
    }

    @Override
    public void remove() throws QueueUnderflowException {
        
         PriorityItem<T> current = head;
        
         PriorityItem<T> previous = null; 
        
        
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else if (head.next == null){
            
            head = null;
            
        } else if (headQueue == tail){
            
            head.next = null;
            tail = null;
        
        
       
        } else {
            
           
        
        for(int i = 0; i < size; i++){
            
            if (current.next == headQueue ){
            
              previous = current.next;
          
              
              current.next = previous.next;
              previous.next = null;
              size--;
         
            }
            
            
            
        }
        
        
        
        
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
