package TADsequencia;

import listaDuplamenteEncadeada.duplaEncadeada;
import listaDuplamenteEncadeada.noDuplamente;

public class TADsequencia {
	private int tamanho;
	private duplaEncadeada lista;
	private noDuplamente primeiro;
	private noDuplamente ultimo;
	
	public TADsequencia(){
		this.lista = new duplaEncadeada();
		this.primeiro = new noDuplamente(null);
		this.ultimo = new noDuplamente(null);
		
		primeiro.setProximo(ultimo);
		ultimo.setAnterior(primeiro);
		this.tamanho=0;
	}
	
	public noDuplamente AtRank(int rank) {
		noDuplamente novoNo;
		if(rank<=size()/2) {
			novoNo = primeiro.getProximo();
			for(int i=0;i< rank;i++) {
				novoNo = novoNo.getProximo();
			}
		}else {
			novoNo = ultimo.getAnterior();
			for(int i=0;i<size()-rank-1;i++) {
				novoNo = novoNo.getAnterior();
			}
		}
		return novoNo;
	}
	
	public int rankOf(noDuplamente noDesejado) {
		noDuplamente no = primeiro.getProximo();
		int novoNum = 0;
		while(novoNum != no && no!=ultimo) {
			no = no.getProximo();
			novoNum++;
		}
		return novoNum;
	}
				
	public int size() {
		return this.tamanho;
	}
	
	public boolean isEmpty() {
		return primeiro.getProximo()==ultimo;
	}
	
	public Object elemAtRank(noDuplamente noIndice) {		
		return noIndice.getElemento();
	}

	
	public Object replaceAtRank(noDuplamente noIndice, Object elemento) {
	
		noIndice.setElemento(elemento);
		return noIndice.getElemento();
	}

	
	public Object insertAtRank(noDuplamente noIndice, Object elemento) {
		noIndice.setElemento(elemento);
		tamanho++;
		return noIndice.getElemento();
		
		
	}

	
	public Object removeAtRank(noDuplamente noIndice) {
		noDuplamente remove = noIndice;
		lista.remove(noIndice);
		tamanho--;
		
		return remove.getElemento();
	}

	
	public boolean isFirst(noDuplamente no) {
		if(no == lista.getPrimeiro()) {
			return true;
		}
		return false;
	}

	
	public boolean isLast(noDuplamente no) {
		if(no == lista.getUltimo()) {
			return true;
		}
		return false;
	}

	
	public noDuplamente first() {
		return this.primeiro;
	}

	
	public noDuplamente last() {
		return this.ultimo;
	}

	
	public void before(noDuplamente no) {
		no.getAnterior();
		
	}

	
	public void after(noDuplamente no) {
		no.getProximo();
		
	}

	
	public void replaceElement(noDuplamente no, Object elemento) {
		noDuplamente noRepassado = new noDuplamente(elemento);
		no.setElemento(noRepassado);
		
	}

	
	public void swapElements(noDuplamente noAtual, noDuplamente noDesejado) {
		Object elementoAtual = noAtual.getElemento();
		noAtual.setElemento(noDesejado.getElemento());
		noDesejado.setElemento(elementoAtual);
		
								
	}
			
	
	public noDuplamente insertBefore(noDuplamente no, Object elemento) {
		//BEFORE = ANTES
		noDuplamente novoNo = new noDuplamente(elemento);
		novoNo.setElemento(elemento);
		
		noDuplamente noAnterior = no.getAnterior();
		noDuplamente noProximo = no.getProximo();
		
		novoNo.setAnterior(noAnterior);
		novoNo.setProximo(no);
		
		no.setAnterior(novoNo);
		noAnterior.setProximo(novoNo);
		
		tamanho++;
		
		return novoNo;
		
	}

	
	public noDuplamente insertAfter(noDuplamente no, Object elemento) {
		//AFTER = DEPOIS
		noDuplamente novoNo = new noDuplamente(elemento);
		novoNo.setElemento(elemento);
		
		novoNo.setAnterior(no);
		novoNo.setProximo(no.getProximo());
		
		(no.getProximo()).setAnterior(novoNo);
		no.setProximo(novoNo);
		
		tamanho++;
		return novoNo;
		
	}

	
	public noDuplamente insertFirst(Object elemento) {
		noDuplamente novoNo = new noDuplamente(elemento);
		noDuplamente proximoPrimeiro = primeiro.getProximo();
		
		novoNo.setAnterior(primeiro);
		novoNo.setProximo(primeiro.getProximo());
		
		proximoPrimeiro.setAnterior(novoNo);
		
		
		primeiro.setProximo(novoNo);		
		
		tamanho++;
		
		return novoNo;
		
	}

	
	public noDuplamente insertLast(Object elemento) {
		noDuplamente novoNo = new noDuplamente(elemento);
		noDuplamente anteriorUltimo = ultimo.getAnterior();
		
		novoNo.setProximo(ultimo);
		novoNo.setAnterior(anteriorUltimo);
		
		anteriorUltimo.setProximo(novoNo);
		ultimo.setAnterior(novoNo);
		
		tamanho++;
		
		return novoNo;
		
	}

	
	public Object remove(noDuplamente no) {
		Object temp = no.getElemento();
		
		noDuplamente anteriorNo = no.getAnterior();
		noDuplamente proximoNo = no.getProximo();
		
		anteriorNo.setProximo(proximoNo);
		proximoNo.setAnterior(anteriorNo);
		
		tamanho--;
		
		return temp;
		
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
