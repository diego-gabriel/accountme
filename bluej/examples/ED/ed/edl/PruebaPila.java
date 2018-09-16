package ed.edl;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PruebaPila.
 *
 * @author  MLBC
 * @version 18.10.12
 */
public class PruebaPila
{
    /**
     * Default constructor for test class PruebaPila
     */
    public PruebaPila()
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
    public void test()
    {
        Pila<Integer> pila = new Pila<Integer>();
        assertEquals(true, pila.vacia());
        pila.push(1);
        pila.push(2);
        pila.push(3);
        assertEquals(false, pila.vacia());
        assertEquals(true, pila.pop().equals(new Integer(3)));
        assertEquals(true, pila.top().equals(new Integer(2)));
    }
    @Test
    public void testListaSEPila()
    {
        ListaSE<Integer> pila = new ListaSE<Integer>();
        assertEquals(true, pila.vacia());
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        assertEquals(false, pila.vacia());
        assertEquals(true, pila.eliminar(pila.longitud()-1).equals(new Integer(3)));
        assertEquals(true, pila.acceder(pila.longitud()-1).equals(new Integer(2)));
    }
}















