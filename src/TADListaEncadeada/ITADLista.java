package TADListaEncadeada;

import listaDuplamenteEncadeada.noDuplamente;

public interface ITADLista {
	
	public int size();
	
	public boolean isEmpty();
	
	public boolean isFirst(noDuplamente no);
	
	public boolean isLast(noDuplamente no);
	
	public noDuplamente first();
	public noDuplamente last();
	
	public void before(noDuplamente no);
	public void after(noDuplamente no);
	
	public void replaceElement(noDuplamente no,Object elemento);
	//troca de elemento
	
	public void swapElements(noDuplamente noAtual,noDuplamente noDesejado);
	//troca posição
	
	public noDuplamente insertBefore(noDuplamente no,Object elemento);
	
	public noDuplamente insertAfter(noDuplamente no,Object elemento);
	
	public noDuplamente insertFirst(Object elemento);
	
	public noDuplamente insertLast(Object elemento);
	public Object remove(noDuplamente no);
}
