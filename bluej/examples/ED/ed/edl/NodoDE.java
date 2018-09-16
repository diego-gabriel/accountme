package ed.edl;


/**
 * Write a description of class NodoDE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodoDE<T>
{
    private NodoDE<T> ant;
    private T dato;
    private NodoDE<T> sig;
    
    public NodoDE(T d)
    {
        dato = d;
        ant = sig = null;
    }
    public void setSig(NodoDE<T> n)
    {
        sig = n;
    }
    public void setAnt(NodoDE<T> n)
    {
        ant = n;
    }
    public void setDato(T d)
    {
        dato = d;
    }
    public NodoDE<T> getAnt()
    {
        return ant;
    }
    public NodoDE<T> getSig()
    {
        return sig;
    }
    public T getDato()
    {
        return dato;
    }
}
