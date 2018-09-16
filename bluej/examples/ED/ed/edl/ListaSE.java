package ed.edl;


/**
 * Write a description of class ListaSE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaSE<T> implements ListaE<T>
{
    private T          ini;
    private ListaSE<T> sig;
    public ListaSE()
    {
        ini = null;
        sig = null;
    }
    
    public void insertar(T dato)
    {
        if(vacia())
        {
            ini = dato;
            sig = new ListaSE<T>();
        }
        else
            sig.insertar(dato);
    }
    public T eliminar(int pos)
    {
        T res;
        if(vacia())
           res = null;
        else
           if(pos == 0)
           {
               res = ini;
               ini = sig.ini;
               sig = sig.sig;
           }
           else
               res = sig.eliminar(pos-1);
        return res;
    }
    public T acceder(int pos)
    {
        T res;
        if(vacia()) res = null;
        else if(pos == 0) res = ini;
             else res = sig.acceder(pos-1);
        return res;
    }
    public boolean vacia()
    {
        return ini == null;
    }
    public int longitud()
    {
        int res;
        if(vacia()) res = 0;
        else res = 1 + sig.longitud();
        return res;
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
    public String toString()
    {
        String res = "";
        if(ini != null)
        {
            if(sig.vacia())
            {
               res = "" + ini;
            }
            else
                res = "" + ini + "," + sig;
        }
        return res;
    }
}
