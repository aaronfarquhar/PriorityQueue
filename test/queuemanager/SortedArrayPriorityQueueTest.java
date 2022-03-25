/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package queuemanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AJFaz
 */
public class SortedArrayPriorityQueueTest {
    
    public SortedArrayPriorityQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of head method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        instance.add("tom", 3);
        Object expResult = "tom";
        Object result = instance.head();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of add method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object item = "Tom";
        int priority = 10;
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        instance.add(item, priority);
        
    }

    /**
     * Test of remove method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        instance.add("tom", 3);
        instance.remove();
       
    }

    /**
     * Test of isEmpty method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testToString() throws QueueOverflowException {
        System.out.println("toString");
        SortedArrayPriorityQueue instance = new SortedArrayPriorityQueue(8);
        instance.add("tom", 3);
        String expResult = "(tom, 3)";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
