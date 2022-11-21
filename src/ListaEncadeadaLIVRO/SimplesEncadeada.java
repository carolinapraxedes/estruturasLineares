package ListaEncadeadaLIVRO;


public class SimplesEncadeada {
	protected Node primeiro;// no cabeça da lista(no inicial)
	protected long tamanho;//numero de nos
	protected Node ultimo;//no do rabo da lista(no final)
	
	//cria uma lista vazia
	public SimplesEncadeada() {
		primeiro = null;
		tamanho=0;
	}
	
	
	public void addFirst(Object newElement) {
		Node newNode = new Node(newElement);
		newNode.setNext(primeiro); //aponta para o no primeiro antigo
		this.primeiro = newNode; //node primeiro aponta para novo no
		tamanho++; //incrementa o no contador
	}
	
	public void addLast(Node element) {
		element.setNext(null); //o novo no aponta para null
		ultimo.setNext(element);//no final ANTIGO aponta para o novo no
		ultimo = element;// estou dizendo que o nofinal vai receber valor/conteudo do novo no
		tamanho++;
	}
	

	
	public void showLista() {
		for(int i=0;i<tamanho;i++) {
			//System.out.println(getElement());
		}
	}
	

	
	
}
