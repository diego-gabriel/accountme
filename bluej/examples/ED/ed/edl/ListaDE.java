package ed.edl;


/**
 * Write a description of class ListaDE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaDE<T> implements ListaE<T>
{
    private NodoDE<T> ini;
    
    public void insertar(T dato)
    {
        NodoDE<T> p = new NodoDE<T>(dato);
        if(vacia())
        {
            ini = p;
        }
        else
        {
            ini.setAnt(p);
            p.setSig(ini);
            ini = p;
        }
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
        return ini == null;
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
