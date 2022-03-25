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
public class UnsortedListPriorityQueueTest {
    
    public UnsortedListPriorityQueueTest() {
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
     * Test of head method, of class UnsortedListPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        UnsortedListPriorityQueue instance = new UnsortedListPriorityQueue();
        instance.add("Tom",6);
        Object expResult = "Tom";
        Object result = instance.head();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of add method, of class UnsortedListPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object item = null;
        int priority = 0;
        UnsortedListPriorityQueue instance = new UnsortedListPriorityQueue();
        instance.add(item, priority);
       
    }

    /**
     * Test of remove method, of class UnsortedListPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        UnsortedListPriorityQueue instance = new UnsortedListPriorityQueue();
        instance.add("Tom",6);
        instance.remove();
       
    }

    /**
     * Test of isEmpty method, of class UnsortedListPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        UnsortedListPriorityQueue instance = new UnsortedListPriorityQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of toString method, of class UnsortedListPriorityQueue.
     */
    @Test
    public void testToString() throws QueueOverflowException {
        System.out.println("toString");
        UnsortedListPriorityQueue instance = new UnsortedListPriorityQueue();
        instance.add("Tom",6);
        String expResult = "(Tom, 6)";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
