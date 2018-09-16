

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LinkedListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LinkedListTest
{
    /**
     * Default constructor for test class LinkedListTest
     */
    public LinkedListTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void tAdd()
    {
        LinkedList<Integer> lis = new LinkedList<Integer>();
        lis.add(5);
        lis.add(1);
        lis.add(3);
        
        assertEquals(3, lis.size());
    }
    
    @Test
    public void tGet()
    {
        LinkedList<Integer> lis = new LinkedList<Integer>();
        lis.add(5);
        lis.add(1);
        lis.add(3);
        
        int res = lis.get(0);
        assertEquals(5, res);
        
        res = lis.get(1);
        assertEquals(1, res);
    }
    
    @Test
    public void tInsert()
    {
        LinkedList<Integer> lis = new LinkedList<Integer>();
        lis.add(5);
        lis.insert(0, 2);
        lis.add(1);
        lis.insert(1, 4);
        lis.add(3);
        
        int res = lis.get(0);
        assertEquals(2, res);
        
        res = lis.get(1);
        assertEquals(4, res);
        
        assertEquals(5, lis.size());
    }
    
    @Test
    public void tErase()
    {
        LinkedList<Integer> lis = new LinkedList<Integer>();
        lis.add(5);
        lis.insert(0, 2);
        lis.add(1);
        lis.insert(1, 4);
        lis.add(3);
        
        
        lis.erase(0);
        int res = lis.get(0);
        assertEquals(4, res);
        
        assertEquals(4, lis.size());
        
        lis.erase(2);
        res = lis.get(2);
        assertEquals(3, res);
        
        assertEquals(3, lis.size());
    }
}