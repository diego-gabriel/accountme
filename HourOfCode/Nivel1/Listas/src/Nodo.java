
public class Nodo <T>{
	
	private T valor;
	private Nodo <T> ant;
	private Nodo <T> sig;
	
	public Nodo(T obj)
	{
		valor = obj;
		ant = null;
		sig = null;
	}
	
	
	public T getValor()
	{
		return valor;
	}
	
	public Nodo <T> getAnt()
	{
		return ant;
	}
	
	public Nodo <T> getSig()
	{
		return sig;
	}

	public void setSig(Nodo<T> sigNodo)
	{
		sig = sigNodo;
	}
	
	public void setAnt(Nodo<T> antNodo)
	{
		ant = antNodo;
	}

}
