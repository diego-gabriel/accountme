package ed.edl;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PruebaCola.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PruebaCola
{
    /**
     * Default constructor for test class PruebaCola
     */
    public PruebaCola()
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
    public void testCola()
    {
        Cola<Integer> cola;
        cola = new Cola<Integer>(); // frente --> / <-- fin
        cola.encolar(1); // frente --> 1 <-- fin
        cola.encolar(2); // frente --> 1, 2 <-- fin
        cola.encolar(3); // frente --> 1, 2, 3 <-- fin
        assertEquals(1, cola.decolar().intValue()); // frente --> 2, 3 <-- fin
        assertEquals(2, cola.ver().intValue()); // frente --> 2, 3 <-- fin
        
        
        
    }
}
