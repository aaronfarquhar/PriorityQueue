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
public class SortedListPriorityQueueTest {
    
    public SortedListPriorityQueueTest() {
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
     * Test of head method, of class SortedListPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("head");
        SortedListPriorityQueue instance = new SortedListPriorityQueue();
        instance.add("tom", 3);
        Object expResult = "tom";
        Object result = instance.head();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of add method, of class SortedListPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object item = "Tom";
        int priority = 3;
        SortedListPriorityQueue instance = new SortedListPriorityQueue();
        instance.add(item, priority);
        
    }

    /**
     * Test of remove method, of class SortedListPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        SortedListPriorityQueue instance = new SortedListPriorityQueue();
        instance.add("tom", 3);
        instance.remove();
      
    }

    /**
     * Test of isEmpty method, of class SortedListPriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        SortedListPriorityQueue instance = new SortedListPriorityQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of toString method, of class SortedListPriorityQueue.
     */
    @Test
    public void testToString() throws QueueOverflowException {
        System.out.println("toString");
        SortedListPriorityQueue instance = new SortedListPriorityQueue();
        instance.add("tom", 3);
        String expResult = "(tom, 3)";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
