package ed.edl;


/**
 * Write a description of class Pila here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pila<T>
{
    private T       tope;
    private Pila<T> base;
    public Pila()
    {
        tope = null;
        base = null;
    }
    private Pila(Pila<T> otra)
    {
        tope = otra.tope;
        base = otra.base;
    }
    public boolean vacia()
    {
        return tope == null;
    }
    public void push(T dato)
    {
        if(vacia()){
            tope = dato;
            base = new Pila<T>();
        }
        else{
            base = new Pila<T>(this);
            tope = dato;
        }
    }
    public T pop()
    {
        T res = tope;
        if(!vacia()){
            tope = base.tope;
            base = base.base;
        }
        return res;
    }
    public T top()
    {
        return tope;
    }
}



















