package listaDuplamenteEncadeada;

public class duplaEncadeada {
	protected int size; //qtd elementos
	protected noDuplamente primeiro; //sentinelas
	protected noDuplamente ultimo;
	
	public duplaEncadeada(){
		size = 0;
		//criando os sentinelas
		noDuplamente primeiro = new noDuplamente(null,null,null);
		noDuplamente ultimo = new noDuplamente(null,null,null);
		//apontando o primeiro para o ultimo
		primeiro.setProximo(ultimo);		
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public noDuplamente getPrimeiro() {
		//pega primeiro no da lista
		if(isEmpty()) {
			System.out.println("A lista está vazia");
		}
		return primeiro.getProximo();
	}
	
	public noDuplamente getUltimo() {
		//pega o ultimo no da lista
		if(isEmpty()) {
			System.out.println("A lista está vazia");
		}
		return ultimo.getAnterior();
	}
	
	//vai pegar o no anterior do no que foi passado por parametro
	public noDuplamente getAnterior(noDuplamente noDesejado){
		if(noDesejado == primeiro) {
			System.out.println("não existe um no anterior do primeiro");
		}
		return noDesejado.getAnterior();
	}
	
	public noDuplamente getProximo(noDuplamente noDesejado) {
		if(noDesejado == ultimo) {
			System.out.println("Nao existe no proximo do ultimo");
		}
		return noDesejado.getProximo();
	}
	
	
	
	
	
	
}
