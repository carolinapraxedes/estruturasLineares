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
		return vetorArray[indice+1];
	}

	@Override
	public Object replaceAtRank(Integer indice, Object elemento) {
		//substitui o elemento na posição 'R' por object 'O' e retorna o antigo elemento
		return vetorArray[indice]=elemento;
	}

	@Override
	public void insertAtRank(Integer indice, Object elemento) {
		//insere um novo elemento 'o' na posicao r	
		if(vetorArray[indice]==null) {
			this.vetorArray[indice]=elemento;			
		}else {
			System.arraycopy(vetorArray, indice, vetorArray, indice+1, tamanho-indice);
			//o tamanho-indice significa que o array sera copiado apartir do indice passado
			this.vetorArray[indice]=elemento;
		}		
		tamanho++;
		
				

	}

	@Override
	public Object removeAtRank(Integer indice) {
		//remove o elemento da posicao R e retorna oq estava nessa posição
		Object Remover = vetorArray[indice];
		vetorArray[indice]=null;
				
		 System.arraycopy(this.vetorArray, indice+1, vetorArray, indice, tamanho-(indice+1));
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
