package ed.ednl;


/**
 * Write a description of class ArbolBin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArbolBin<T>
{
    private T raiz;
    private ArbolBin<T> izq, der;
    /**
     * Construye un arbol binario vacio
     */
    public ArbolBin()
    {
        raiz = null;
        izq = der = null;
    }
    /**
     * Construye un arbol binario no vacio
     * @param nr que es la raiz del arbol no puede ser null
     * @param ni es la desc izq del arbol no puede ser null
     * @param nd es la desc der del arbol no puede ser null
     */
    public ArbolBin(T nr, ArbolBin<T> ni, ArbolBin<T> nd)
    {
        raiz = nr;
        izq  = ni;
        der  = nd;
    }
    public boolean vacia()
    {
        return raiz == null;
    }
    /**
     * Permite buscar un dato en el arbol, y devuelve
     * el dato si lo ha encontrado
     * @param dato es el dato a buscar
     * @return el dato encontrado, null si no existe
     */
    public T buscar(T dato)
    {
        T res;
        if(vacia()) res = null;
        else if(raiz.equals(dato)) res = raiz;
             else{
                 res = izq.buscar(dato);
                 if(res == null) res = der.buscar(dato);
                }
        return res;
    }
    public int  nroHojas()
    {
        int res;
        if(vacia()) res = 0;
        else if(izq.vacia() && der.vacia()) res = 1;
             else res = izq.nroHojas() + der.nroHojas();
        return res;
    }
    public int nroNodos()
    {
        int res;
        if(vacia()) res = 0;
        else res = 1 + izq.nroNodos() + der.nroNodos();
        return res;
    }
    public int altura()
    {
        int res;
        if(vacia()) res = 0;
        else res = 1 + Math.max(izq.altura(), der.altura());
        return res;
    }
    public int nivelDe(T dato)
    {
        int res;
        if(vacia()) res = -1;
        else if(raiz.equals(dato)) res = 0;
             else{
                 res = izq.nivelDe(dato);
                 if(res != -1) res++;
                 else{
                     res = der.nivelDe(dato);
                     if(res != -1) res++;
                    } 
                }
        return res;
    }
}









