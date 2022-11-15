package vetorArray;



public class VetorArray implements IVetorArray {
	/* Implemente o TAD Vetor utilizando array
	 * - Seu código deve ser totalmente funcional, incluindo uma classe para testes.
	 * */
	int tamanho;
	Object vetorArray[];
	
	public VetorArray(int tamanho) {
		this.vetorArray= new Object[tamanho];
		this.tamanho = 0;
	}
	
	@Override
	public Object elemAtRank(Integer indice) {
		//retorna o elemento da posição R sem remover
		return vetorArray[indice];
	}

	@Override
	public Object replaceAtRank(Integer indice, Object elemento) {
		//substitui o elemento na posição 'R' por object 'O' e retorna o antigo elemento
		return null;
	}

	@Override
	public void insertAtRank(Integer indice, Object elemento) {
		//insere um novo elemento 'o' na posicao r	
		vetorArray[indice]=elemento;
		tamanho++;
	}

	@Override
	public Object removeAtRank(Integer indice) {
		//remove o elemento da posicao R e retorna oq estava nessa posição
		Object Remover = vetorArray[indice];
		
		Object temporario = new Object[tamanho-1];
				
		for(int i=0; i<(vetorArray.length-1);i++) {
			Object atual = vetorArray[i];
			if(atual==Remover) {

				System.out.println("achou o elemento"+atual);
			}
			System.out.println("elemento não encontrado"+i);
		}

		//vetorArray[indice]=null;
		tamanho--;
		return Remover;
	}

	@Override
	public int size() {
		return this.tamanho;
	}

	@Override
	public boolean isEmpty() {
		if(this.size() == 0) {
			return true;
		}
		return false;
		
	}
	
	public void showVetor() {
		
		for(int i=0;i< this.vetorArray.length;i++) {			
			System.out.print("["+ vetorArray[i] +"]");
			
		}
	}

}
