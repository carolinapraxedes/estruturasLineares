package ListaEncadeadaLIVRO;

public class Node {
	private Object element;
	private Node next;
	
	//cria um no com um conteudo 
	public Node(Object content) {
		element=content;
		
	}
	
	//retorna elemento deste no
	public Object getElement() {
		return element;
	}
	
	//retorna o proximo elemento deste no
	public Node getNext() {
		return next;
	}
	
	//define o elemento desse no
	public void setElement(Object newElement) {
		element = newElement;
	}
	
	//define o proximo elemento desse no
	public void setNext(Node newNext) {
		next = newNext;
	}
}
