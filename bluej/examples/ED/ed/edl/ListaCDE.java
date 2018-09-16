package ed.edl;


/**
 * Write a description of class ListaCDE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaCDE<T> implements ListaE<T>
{
    private NodoDE<T> ini;
    
    public ListaCDE()
    {
        ini = null;
    }
    
    public void insertar(T dato)
    {
        NodoDE<T> p = new NodoDE<T>(dato);
        if(vacia())
        {
            ini = p;
            ini.setSig(ini);
            ini.setAnt(ini);
        }
        else
        {
            NodoDE<T> q = ini.getAnt();
            q.setSig(p);
            p.setAnt(q);
            p.setSig(ini);
            ini.setAnt(p);
        }
    }
    public T eliminar(int pos)
    {
        T res;
        if(vacia()) 
            res = null;
        else
        {
            NodoDE<T> q = buscarNodoEn(ini, pos);
            res = q.getDato();
            NodoDE<T> r,s;
            r = q.getAnt();
            s = q.getSig();
            r.setSig(s);
            s.setAnt(r);
            if(q == ini)
                ini = s;
            if(q == s)
                ini = null;
            
        }
        return res;
    }
    private NodoDE<T> buscarNodoEn(NodoDE<T> q, int pos)
    {
        NodoDE<T> res;
        if(pos == 0) res = q;
        else res = buscarNodoEn(q.getSig(), pos-1);
        return res;
    }
    public T acceder(int pos)
    {
        T res;
        if(vacia()) res = null;
        else{
              NodoDE<T> q = buscarNodoEn(ini, pos);
              res = q.getDato();
            }
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
        else res = contarNodos(ini);
        return res;
    }
    private int contarNodos(NodoDE<T> q)
    {
        int res;
        if(q.getSig() == ini) res = 1;
        else res = 1 + contarNodos(q.getSig());
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
}
