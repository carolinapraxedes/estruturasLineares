package listaEncadeada;

public class ListaEncadeada {
	private No primeiro;
	private No ultimo;
	private int tamanho;
	
	public ListaEncadeada() {
		
		this.tamanho=0;
	}
	
	public No getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}
	public No getUltimo() {
		return ultimo;
	}
	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionar(Object novoElemento) {
		//para criar um novo é preciso criar um novo novo
		No novoNo = new No(novoElemento);
		//pasando o valor para o no
		if(this.primeiro==null && this.ultimo==null) {
			this.primeiro = novoNo;
			this.ultimo = novoNo;
		
		}else {
			this.ultimo.setNext(novoNo);
			//estou dizendo que o proximo elemento vai ser o ultimo
			this.ultimo=novoNo;
			//colocando o elemento como ultimo 
			
		}
		this.tamanho++;
	}
	public void remover(Object novoElemento) {
		
	}
	public No get(int posicao) {
		//é um metodo para visualizar todos da lista e encontrar o elemento que foi repassado
		No atual = this.primeiro;
		for(int i=0;i<posicao;i++) {
			if(atual.getNext() != null) {
				//verifico se o atual tem proximo
				atual = atual.getNext();
				//assim eu avanço na lista 
			}
		}
		
		return atual;
	}
	
	@Override
	public String toString() {
		return this.primeiro.toString();
	}
}
