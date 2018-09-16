package ed.edl;


/**
 * Write a description of class ListaCSE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaCSE<T> implements ListaE<T>
{
    private NodoSE<T> ini;
    
    public void insertar(T dato)
    {
    }
    public T eliminar(int pos)
    {
        return null;
    }
    public T acceder(int pos)
    {
        return null;
    }
    public boolean vacia()
    {
        return false;
    }
    public int longitud()
    {
        return 0;
    }
    public T ant(T dato)
    {
        return null;
    }
    public T suc(T dato)
    {
        return null;
    }
    public void unir(Lista<T> otra)
    {
        if(!otra.vacia())
        {
            insertar(otra.eliminar(0));
            unir(otra);
        }
    }
}
