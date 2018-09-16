package ed.edl;


/**
 * Write a description of class Cola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cola<T>
{
    protected NodoDE<T> frente, fin;
    public Cola()
    {
        frente = fin = null;
    }
    public boolean vacia()
    {
        return frente == null;
    }
    /**
     * Metodo que permite ingresar un dato al final de la cola
     * @param dato dato a ingresar en la cola
     * @return cambio de estado en la cola
     */
    public void encolar(T dato)
    {
        NodoDE<T> p = new NodoDE<T>(dato);
        if(vacia())
        {
            frente = p;
            fin    = p;
        }
        else
        {
            fin.setSig(p);
            p.setAnt(fin);
            fin = p;
        }
    }
    /**
     * Metodo que permite eliminar un elemento de la cola
     * por defecto lo hace de la referencia frente
     * @param nada
     * @return el dato del frente de la cola
     */
    public T decolar()
    {
        T res;
        if(vacia()) res = null;
        else 
        {
            res = frente.getDato();
            frente = frente.getSig();
            if(frente == null) fin = null;
            else frente.setAnt(null);
        }
        return  res;
    }
    /**
     * Metodo me ermite acceder al elemento del frente de la cola
     * @param nada
     * @return el dato del frente de la cola
     */
    public T ver()
    {
        T res;
        if(vacia()) res = null;
        else res = frente.getDato();
        return res;
    }
}
