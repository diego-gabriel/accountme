import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ArrayListTest
{
    /**
     * Default constructor for test class ArrayListTest
     */
    public ArrayListTest()
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
        ArrayList<Integer> lis = new ArrayList<Integer>();
        lis.add(1);
        lis.add(2);
        lis.add(3);
        assertEquals(3, lis.size());
    }
    
    @Test
    public void tgetI()
    {
        ArrayList<Integer> lis = new ArrayList<Integer>();
        lis.add(1);
        lis.add(2);
        lis.add(3);
        int res = lis.get(2);
        assertEquals(3, res);
    }
    
    @Test
    public void tInsert()
    {
        ArrayList<Integer> lis = new ArrayList<Integer>();
        lis.add(1);
        lis.insert(1, 3);
        lis.add(2);
        lis.insert(2, 5);
        lis.add(4);
        
        int res = lis.get(1);
        assertEquals(3, res);
        
        res = lis.get(3);
        assertEquals(2, res);
        
        res = lis.get(4);
        assertEquals(4, res);
        
        assertEquals(5, lis.size());
    }
    
    @Test
    public void tErase()
    {
        ArrayList<Integer> lis = new ArrayList<Integer>();
        lis.add(1);
        lis.insert(1, 3);
        lis.add(2);
        lis.insert(2, 5);
        lis.add(4);
        
        lis.erase(0);
        int res = lis.get(1);
        assertEquals(5, res);
        
        assertEquals(4, lis.size());
        
        lis.erase(0);
        res = lis.get(2);
        assertEquals(4, res);
        
        res = lis.get(0);
        assertEquals(5, res);
        
        assertEquals(3, lis.size());
    }
    
    @Test
    public void tEmpty()
    {
        ArrayList<Integer> lis = new ArrayList<Integer>();
        lis.add(1);
        lis.insert(1, 3);
        lis.add(2);
        lis.insert(2, 5);
        
        lis.erase(0);
        
        assertEquals(false, lis.isEmpty());
        
        lis.erase(0);
        lis.erase(0);
        lis.erase(0);
        
        assertEquals(true, lis.isEmpty());
    }
    
    
}