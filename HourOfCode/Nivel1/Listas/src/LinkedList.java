
public class LinkedList <T> implements Lista <T>{
	
	private Nodo<T> valor;
	
	public LinkedList()
	{
		valor = null;
	}
	
	public void add(T obj)
	{
		if (valor == null)
			valor = new Nodo<T>(obj);
		else 
			add(valor, obj);
	}

	private void add(Nodo<T> nodo, T obj)
	{
		if (nodo.getSig() == null)
		{
			Nodo<T> sig = new Nodo<T>(obj);
			nodo.setSig(sig);
			sig.setAnt(nodo);
			
		}
		else
			add(nodo.getSig(), obj);
	}
	
	public T get(int index) {
		return get(valor, index);
	}
	
	private T get(Nodo<T> nodo, int index)
	{
		T res = null;
		
		if (nodo != null)
			if (index == 0)
				res = nodo.getValor();
			else
				res = get(nodo.getSig(), index-1);
		
		return res;
	}


	public int size() {
		return size(valor);
	}
	
	private int size(Nodo<T> nodo)
	{
		return nodo == null ? 0 : 1 + size(nodo.getSig());
	}


	public void insert(int index, T obj) {

		insert(null, valor, index, obj);
	}
	
	private void insert(Nodo<T> ant, Nodo<T> nodo, int index, T obj)
	{
		if (index == 0)
		{
			if (nodo != null)
			{
				Nodo<T> newNodo = new Nodo<T>(obj);
				
				newNodo.setSig(nodo);
				newNodo.setAnt(ant);
				if (ant != null)
					ant.setSig(newNodo);
				nodo.setAnt(newNodo);
				
				if (nodo == valor)
					valor = newNodo;
			}
			else
				nodo = new Nodo<T>(obj);
		}
		else
			if (nodo != null)
				insert(nodo, nodo.getSig(), index-1, obj);
	}


	public void erase(int index) {
		
		erase(valor, index);
		
	}
	
	private void erase(Nodo<T> nodo, int index)
	{
		if(index==0)
		{
			Nodo<T> anterior= nodo.getAnt();
			Nodo<T> siguiente = nodo.getSig();
			anterior.setSig(siguiente);
			siguiente.setAnt(anterior);
		}
	}


	public boolean isEmpty() {
		
		return valor == null;
	}
	
	

}
