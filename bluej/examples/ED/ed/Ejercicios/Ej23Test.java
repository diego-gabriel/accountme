package ed.Ejercicios;
import ed.edl.*;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Ej23Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Ej23Test
{
    
    /**
     * Default constructor for test class Ej23Test
     */
    public Ej23Test()
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
    public void test1()
    {
        ListaCSE<Integer> l = new ListaCSE<Integer>();
        Ej23 pro = new Ej23();
        l.insertar(4);
        l.insertar(5);
        l.insertar(2);
        l.insertar(1);
        l.insertar(9);
        System.out.println(l.longitud());
        pro.dividir(l, 9);
        ListaSE<Integer> ma = new ListaSE<Integer>();
        ListaSE<Integer> me = new ListaSE<Integer>();
        me.insertar(4);
        me.insertar(5);
        me.insertar(2);
        me.insertar(1);
        assertEquals(pro.toString2(), me);
    }
}
