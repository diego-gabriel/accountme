package ed.edl;


/**
 * Write a description of interface Lista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Lista<T>
{
    public void insertar(T dato);
    public T eliminar(int pos);
    public T acceder(int pos);
    public boolean vacia();
    public int longitud();
    public T ant(T dato);
    public T suc(T dato);
    public void unir(Lista<T> otra);
}
