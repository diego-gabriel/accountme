package ed.edl;


/**
 * Write a description of class BiCola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BiCola<T> extends Cola<T>
{
    /**
     * metodo que permite sacar un elemento del
     * final de la cola
     * @param nada
     * @return el dato que se ha sacado del fin de la cola
     */
    public T salir()
    {
        T res;
        if(vacia()) res = null;
        else
        {
            res = fin.getDato();
            fin = fin.getAnt();
            if(fin == null) frente = null;
            else fin.setSig(null);
        }
        return res;
    }
    /**
     * Metodo que permite ingresar un dato al frente de la coal
     * @param dato el dato a ingresar
     * @return cambiar el estado de la cola
     */
    public void meter(T dato)
    {
        NodoDE<T> p = new NodoDE<T>(dato);
        if(vacia())
        {
            frente = p;
            fin = p;
        }
        else
        {
            frente.setAnt(p);
            p.setSig(frente);
            frente = p;
        }
    }
}
