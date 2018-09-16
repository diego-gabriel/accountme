package ed.Ejercicios;
import ed.edl.*;

/**
 * Write a description of class Ej23 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej23
{
    private ListaSE<Integer> mayor, menor;
    
    public Ej23()
    {
        mayor = new ListaSE<Integer>();
        menor = new ListaSE<Integer>();
    }
    
    public void dividir(ListaCSE<Integer> l, Integer n)
    {
        if(! l.vacia())
        {
            Integer posible = l.acceder(0);
            if(posible > n)
            {
                mayor.insertar(posible);
            }
            else
            {
                menor.insertar(posible);
            }
        }
    }
    
    public String toString1()
    {
        String res = "" + mayor;
        return res;
    }
    public String toString2()
    {
        String res = "" + menor;
        return res;
    }
}
