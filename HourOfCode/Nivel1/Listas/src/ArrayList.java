
public class ArrayList<T> implements Lista<T>{
	
	private final int D_SIZE = 1;
	private Object[] lista;
	private int actIndex;
	
	public ArrayList()
	{
		lista = new Object[D_SIZE];
		actIndex = 0;
	}
	
	
	public void add(T obj) {
		if (actIndex == lista.length)
			resize();
		
		lista[actIndex] = obj;
		actIndex++;
	}
	
	public T get(int index) {
		@SuppressWarnings("unchecked")
		T res = (T) lista[index];
		return res;
	}
	
	public int size() {
		
		return actIndex;
	}
	
	public void insert(int index, T obj)
	{
		if (actIndex == lista.length)
			resize();
		
		for (int i = actIndex-1; i >= index; i--)
			lista[i+1] = lista[i];
		
		lista[index] = obj;
		actIndex++;
	}
	
	public void erase(int index)
	{
		for (int i = index; i < actIndex-1; i++)
			lista[i] = lista[i+1];
		actIndex--;
	}
	
	public boolean isEmpty()
	{
		return actIndex == 0;
	}
	
	private void resize()
	{
		int lastSize = lista.length;
		Object[] temp = new Object[lastSize + D_SIZE];
		
		for (int i = 0; i < lastSize; i++)
			temp[i] = lista[i];
		
		lista = temp;
	}

}
