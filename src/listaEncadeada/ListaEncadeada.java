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
	//Esse código serve para usar em pilha
	/*public void adicionarInicio(Object novoElemento) {
		//para criar um novo é preciso criar um novo novo
		No novoNo = new No(novoElemento);
		//pasando o valor para o no
		if(this.primeiro==null && this.ultimo==null) {
			this.primeiro = novoNo;
			this.ultimo = novoNo;
		
		}else {
			novoNo.setNext(primeiro);
			//estou dizendo que o proximo elemento vai ser o primeiro
			this.primeiro=novoNo;
			//colocando o valor no primeiro nó 
			
		}
		this.tamanho++;
	}*/
	
	public void remover(Object elementoProcurado) {
		
		No atual = this.primeiro;
		No anterior = null; //é necessário uma variavel para guardar o anterior
		for(int i=0;i<this.getTamanho();i++) {
			if(atual.getElement()== elementoProcurado) {//vou verificar se o valor do atual é oq estamos procurando
				if(this.getTamanho()==1) {//quando quiser zerar a lista, ele entra ai
					this.primeiro=null;
					this.ultimo=null;
				}else if(atual==primeiro) {//RETIRAR O PRIMEIRO NO
					this.primeiro= atual.getNext();//agr o primeiro vai ser o proximo do atual
					atual.setNext(null);//removendo o primeiro novo
					
				}else if(atual==ultimo){ //Retira o ultimo novo
					this.ultimo = anterior; //o ultimo vai ser o anterior do no atual
					anterior.setElement(null);
				}else { //Retira um nó entre o primeiro e o ultimo
					anterior.setNext(atual.getNext());//o proximo no do anterior vai ser o proximo no do atual
					
					atual=null;
				}
				
				this.tamanho--;
				break;
			}
			anterior = atual;//eu estou guardando o atual antes que ele ande no loop
			atual = atual.getNext();
			//o atual esta andando junto com i no loop
		}
	}
	
	/*public void removerPrimeiro() {
		No atual = primeiro;
		atual.setNext(atual);
			
	}*/
	
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
	
	public void showLista() {
		for(int i=0;i<getTamanho();i++) {
			System.out.println(get(i).getElement());
		}
	}
}
