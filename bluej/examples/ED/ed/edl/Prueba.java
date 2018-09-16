package ed.edl;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Prueba.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Prueba
{
    /**
     * Default constructor for test class Prueba
     */
    public Prueba()
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
    public void testEliminarLSE()
    {
        // probar la eliminacion de una posicion que existe
        ListaSE<Integer> lista = new ListaSE<Integer>();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);
        lista.insertar(6);
        lista.insertar(7);
        lista.insertar(8);
        lista.insertar(9);
        lista.insertar(10);
        Integer res;
        res = lista.eliminar(5);//
        System.out.println(res); // 6
        res = lista.eliminar(5);//
        System.out.println(res); // 7
    }
    @Test
    public void testEliminarLSE2()
    {
        // probar la eliminacion de una posicion 
        // que no existe
        ListaSE<Integer> lista = new ListaSE<Integer>();
        Integer res;
        res = lista.eliminar(5);//
        System.out.println(res); // null

        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);
        lista.insertar(6);
        lista.insertar(7);
        lista.insertar(8);
        lista.insertar(9);
        lista.insertar(10);
        res = lista.eliminar(10);//
        System.out.println(res); // null
    }
    @Test
    public void testEliminarLSE3()
    {
        // probar la eliminacion de una posicion 
        // que no existe
        ListaSE<Integer> lista = new ListaSE<Integer>();
        Integer res;
        lista.insertar(1);
        res = lista.eliminar(0);//
        System.out.println(res); // 1
        res = lista.eliminar(0);//
        System.out.println(res); // null
    }
    @Test
    public void testAccederLSE()
    {
        // probar el acceso de una posicion 
        // que no existe
        ListaSE<Integer> lista = new ListaSE<Integer>();
        Integer res;
        lista.insertar(1);
        res = lista.acceder(0);//
        System.out.println(res); // 1
        res = lista.acceder(1);//
        System.out.println(res); // null
    }
    
    @Test
    public void testEliminarLCDE()
    {
        // probar la eliminacion de una posicion que existe
        ListaCDE<Integer> lista = new ListaCDE<Integer>();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);
        lista.insertar(6);
        lista.insertar(7);
        lista.insertar(8);
        lista.insertar(9);
        lista.insertar(10);
        Integer res;
        res = lista.eliminar(5);//
        System.out.println(res); // 6
        res = lista.eliminar(5);//
        System.out.println(res); // 7
    }
    @Test
    public void testEliminarLCDE2()
    {
        // probar la eliminacion de una posicion 
        // que no existe de manera plana
        ListaCDE<Integer> lista = new ListaCDE<Integer>();
        Integer res;
        res = lista.eliminar(5);//
        System.out.println(res); // null

        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);
        lista.insertar(6);
        lista.insertar(7);
        lista.insertar(8);
        lista.insertar(9);
        lista.insertar(10);
        res = lista.eliminar(10);
        System.out.println(res); // 1
        res = lista.eliminar(15);
        System.out.println(res); // 8
        
    }
    @Test
    public void testEliminarLCDE3()
    {
        // probar la eliminacion de una posicion 
        // que no existe
        ListaCDE<Integer> lista = new ListaCDE<Integer>();
        Integer res;
        lista.insertar(1);
        res = lista.eliminar(0);//
        System.out.println(res); // 1
        res = lista.eliminar(0);//
        System.out.println(res); // null
    }
    @Test
    public void testLongitudLSE()
    {
        ListaSE<Integer> lista;
        lista = new ListaSE<Integer>();
        assertEquals(0, lista.longitud());
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);
        assertEquals(5, lista.longitud());
        lista.eliminar(0);
        assertEquals(4, lista.longitud());
        lista.eliminar(10);
        assertEquals(4, lista.longitud());
        
    }
    @Test
    public void insertarLDE()
    {
        ListaDE<Integer> lista;
        lista = new ListaDE<Integer>();
        assertEquals(true, lista.vacia());
        lista.insertar(1);
        assertEquals(false, lista.vacia());
        lista.insertar(3);
        //assertEquals(3, lista.acceder(0));
    }
}
