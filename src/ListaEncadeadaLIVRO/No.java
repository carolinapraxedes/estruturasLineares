package ListaEncadeadaLIVRO;

public class No {
	private Object elemento;
	private No proximo;
	
	//cria um no com um conteudo 
	public No(Object conteudo) {
		elemento=conteudo;
		this.proximo = null;
		
	}
	
	//retorna elementoo deste no
	public Object getElemento() {
		return elemento;
	}
	
	//retorna o proximo elementoo deste no
	public No getProximo() {
		return proximo;
	}
	
	//define o elementoo desse no
	public void setElemento(Object novoElemento) {
		elemento = novoElemento;
	}
	
	//define o proximo elementoo desse no
	public void setProximo(No novoProximo) {
		proximo = novoProximo;
	}
}
