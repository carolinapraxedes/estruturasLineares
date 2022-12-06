package listaDuplamenteEncadeada;



public class duplaEncadeada {
	protected int size; //qtd elementos
	protected noDuplamente primeiro; //sentinelas
	protected noDuplamente ultimo;
	
	public duplaEncadeada(){
		size = 0;
		//criando os sentinelas
		primeiro = new noDuplamente(null);
		ultimo = new noDuplamente(null);
		primeiro.setProximo(ultimo);
		ultimo.setAnterior(primeiro);
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	/*
	 * ========= PEGAR PRIMEIRO, ULTIMO, ANTERIOR E PROXIMO ==============
	 * */
	
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
	
	
	public noDuplamente getAnterior(noDuplamente noDesejado){
		//vai pegar o no anterior do no que foi passado por parametro
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
	
	/*
	 * ============== add e remover ================
	 * */
	
	public noDuplamente addFirst(Object elemento) {		
		/*NOVO PRIMEIRO = NP
		 *PROXIMO PRIMEIRO = X
		 *PRIMEIRO = P
		 *
		 *  P --- NP --- X
		 *	*/
		noDuplamente novoPrimeiro = new noDuplamente(elemento);
		noDuplamente proxPrimeiro = primeiro.getProximo();
		
		novoPrimeiro.setProximo(proxPrimeiro);
		//o proximo de NP vai ser X
		novoPrimeiro.setAnterior(primeiro);
		//o anterior de NP vai ser P
		
		proxPrimeiro.setAnterior(novoPrimeiro);
		//o anterior de X vai ser NP
		primeiro.setProximo(novoPrimeiro);
		//o proximo de P vai ser NP
						
		size++;
		
		return novoPrimeiro;
	}
	
	public noDuplamente addLast(Object elemento) {
		noDuplamente novoUltimo = new noDuplamente(elemento);
		noDuplamente anteriorUltimo = ultimo.getAnterior();
		
		novoUltimo.setAnterior(anteriorUltimo);
		novoUltimo.setProximo(ultimo);
		
		anteriorUltimo.setProximo(novoUltimo);
		ultimo.setAnterior(novoUltimo);
		
		size++;
		
		return novoUltimo;
	}

	public void removeFirst() {
		if(isEmpty()) {
			System.out.println("A lista está vazia");
		}
		noDuplamente removerPrimeiro = primeiro.getProximo();
		noDuplamente proxRemoverPrimeiro = removerPrimeiro.getProximo();
		
		primeiro.setProximo(proxRemoverPrimeiro);
		proxRemoverPrimeiro.setAnterior(primeiro);
		
		
		removerPrimeiro.setAnterior(null);
		removerPrimeiro.setProximo(null);
		
		size--;
	}
	
	public void removeLast() {
		if(isEmpty()) {
			System.out.println("A lista está vazia");
		}
		noDuplamente removido = ultimo.getAnterior();
		noDuplamente antesRemovido = removido.getAnterior();
		
		ultimo.setAnterior(antesRemovido);
		antesRemovido.setProximo(ultimo);
		
		removido.setAnterior(null);
		removido.setProximo(null);
		
		size--;
	}
	
	/*======== REMOVER UM NO ESPECIFICO ==============
	 * */
	public void remove(noDuplamente noRemover) {
		noDuplamente anteriorRemover = noRemover.getAnterior();
		noDuplamente proximoRemover = noRemover.getProximo();
		

		//modificando as conexões dos nos envolvidos
		proximoRemover.setAnterior(anteriorRemover);
		anteriorRemover.setProximo(proximoRemover);
		
		//removendo as conexões do no
		//noRemover.setAnterior(null);
		//noRemover.setProximo(null);
		
		
		size--;
	}
	
	/*
	 * ==================== addBefore e addAfter ================================
	 * */
	
	public noDuplamente addAfter(noDuplamente noAtual, noDuplamente noNovo) {
		//vai adicionar o noNovo depois do noAtual
		noDuplamente proxAtual = noAtual.getProximo();
		
		//conectando o novo novo
		noNovo.setAnterior(noAtual);
		noNovo.setProximo(proxAtual);
		
		//modificando as conexões dos outro nos envolvidos
		proxAtual.setAnterior(noNovo);
		noAtual.setProximo(noNovo);
		
		
		size++;
		
		return noNovo;
	}
	
	public noDuplamente addBefore(noDuplamente noAtual, noDuplamente noNovo) {
		//vai adicionar o noNovo antes do noAtual
		
		noDuplamente anteriorAtual = noAtual.getAnterior();
		//pegando o anterior do no atual
		
		//fazendo as conexões do novo No
		noNovo.setAnterior(anteriorAtual);
		noNovo.setProximo(noAtual);
		
		//Modificando as conexões dos nos envolvidos
		noAtual.setAnterior(noNovo);
		anteriorAtual.setProximo(noNovo);

		
		size++;
		return noNovo;
	}
	
	
	/*
	 * ========================== tem proximo ou anterior ===============
	 * */
	
	public boolean hasAnterior(noDuplamente noDesejado) {
		//verifica se o no passado tem anterior ou nao
		return noDesejado!=primeiro;
	}
	
	public boolean hasProximo(noDuplamente noDesejado) {
		//verifica se o no passado tem proximo ou nao
		return noDesejado!=ultimo;
	}

	
	
	/*
	 * ========= PRINT========
	 * */
	public noDuplamente procurar(Object elementoProcurado) {
		noDuplamente procurado = this.primeiro;
		while(procurado.getProximo()!=null) {
			if(procurado.getElemento()==elementoProcurado) {
				return procurado;
			}
			procurado = procurado.getProximo();
		}
		return null;
	}
	
	public String toString() {
		String imprimir = "[";
		noDuplamente primeiroNo = primeiro.getProximo();
		while(primeiroNo!=ultimo) {
			imprimir+=primeiroNo.getElemento();
			primeiroNo=primeiroNo.getProximo();
			if(primeiroNo!=ultimo) {
				imprimir+=", ";
			}
		}
		imprimir+="]";
		
		return imprimir;
	}
	
	
	
	
	
}
