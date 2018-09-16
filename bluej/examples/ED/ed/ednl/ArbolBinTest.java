package ed.ednl;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ed.edl.ListaSE;
/**
 * The test class ArbolBinTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ArbolBinTest
{
    /**
     * Default constructor for test class ArbolBinTest
     */
    private ArbolBin<Integer> arbol2 = new ArbolBin<Integer>( 1,
                     new ArbolBin<Integer>( 3,
                         new ArbolBin<Integer>( 5,
                                 new ArbolBin<Integer>(),
                                 new ArbolBin<Integer>()),
                         new ArbolBin<Integer>()) ,
                     new ArbolBin<Integer>( 2,
                         new ArbolBin<Integer>( 7,
                                 new ArbolBin<Integer>(),
                                 new ArbolBin<Integer>()),
                         new ArbolBin<Integer>()));

    public ArbolBinTest()
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
    public void testBuscar()
    {
        
        Integer res;
        res = arbol2.buscar(5);
        assertEquals(5, res.intValue());
        res = arbol2.buscar(10);
        assertNull(res);
    }
    @Test
    public void testNroHojas()
    {
        int res;
        res = arbol2.nroHojas();
        assertEquals(2, res);
    }
    @Test
    public void testNroNodos()
    {
        int res;
        res = arbol2.nroNodos();
        assertEquals(5, res);
    }
    @Test
    public void testAltura()
    {
        int res;
        res = arbol2.altura();
        assertEquals(3, res);
    }
    @Test
    public void testNivelDeNodo()
    {
        int res;
        res = arbol2.nivelDe(7);
        assertEquals(2, res);
        res = arbol2.nivelDe(10);
        assertEquals(-1, res);
    }
    @Test
    public void testHojas()
    {
        ListaSE<Integer> res;
        //res = arbol2.hojas();
        //assertEquals(2, res.longitud());
    }
    @Test
    public void testNodosDeNivel()
    {
        ListaSE<Integer> res;
        //res = arbol2.nodosDeNivel(1);
        //assertEquals(2, res.longitud());
        //assertEquals(3, res.acceder(0).intValue());
        //assertEquals(2, res.acceder(1).intValue());
    }
}
