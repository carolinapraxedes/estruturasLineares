package TADLista;

public interface ITADLista {
	/*n = indice
	o = object
	q = indice desejado*/
	
	public int size();
	
	public boolean isEmpty();
	
	public boolean isFirst(int indice);
	
	public boolean isLast(int indice);
	
	public Object first();
	public Object last();
	
	public void before(int indice);
	public void after(int indice);
	
	public void replaceElement(int indice,Object elemento);
	//troca de elemento
	
	public void swapElements(int indiceAtual,int indiceDesejado);
	//troca posição
	
	public void insertBefore(int indice,Object elemento);
	
	public void insertAfter(int indice,Object elemento);
	
	public void insertFirst(Object elemento);
	
	public void insertLast(Object elemento);
	public void remove(int indice);
	
	

}
