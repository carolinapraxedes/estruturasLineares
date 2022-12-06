package TADListaEncadeada;


import listaDuplamenteEncadeada.duplaEncadeada;
import listaDuplamenteEncadeada.noDuplamente;

public class TADListaEncadeada implements ITADLista {
	private int tamanho;
	private duplaEncadeada lista;
	private noDuplamente primeiro;
	private noDuplamente ultimo;
	
	public TADListaEncadeada() {
		this.lista = new duplaEncadeada();
		this.primeiro = new noDuplamente(null);
		this.ultimo = new noDuplamente(null);
		
		primeiro.setProximo(ultimo);
		ultimo.setAnterior(primeiro);
		this.tamanho=0;
	}

	@Override
	public int size() {
		return lista.size();
	}

	@Override
	public boolean isEmpty() {
		return primeiro.getProximo()==ultimo;
	}

	@Override
	public boolean isFirst(noDuplamente no) {
		if(no == lista.getPrimeiro()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isLast(noDuplamente no) {
		if(no == lista.getUltimo()) {
			return true;
		}
		return false;
	}

	@Override
	public noDuplamente first() {
		return this.primeiro;
	}

	@Override
	public noDuplamente last() {
		return this.ultimo;
	}

	@Override
	public void before(noDuplamente no) {
		no.getAnterior();
		
	}

	@Override
	public void after(noDuplamente no) {
		no.getProximo();
		
	}

	@Override
	public void replaceElement(noDuplamente no, Object elemento) {
		noDuplamente noRepassado = new noDuplamente(elemento);
		no.setElemento(noRepassado);
		
	}

	@Override
	public void swapElements(noDuplamente noAtual, noDuplamente noDesejado) {
		Object elementoAtual = noAtual.getElemento();
		noAtual.setElemento(noDesejado.getElemento());
		noDesejado.setElemento(elementoAtual);
		
								
	}
	
	
	

	@Override
	public noDuplamente insertBefore(noDuplamente no, Object elemento) {
		//BEFORE = ANTES
		noDuplamente novoNo = new noDuplamente(elemento);
		novoNo.setElemento(elemento);
		
		novoNo.setAnterior(no);
		novoNo.setProximo(no.getProximo());
		
		(no.getProximo()).setAnterior(novoNo);
		
		return novoNo;
		
	}

	@Override
	public noDuplamente insertAfter(noDuplamente no, Object elemento) {
		//AFTER = DEPOIS
		noDuplamente novoNo = new noDuplamente(elemento);
		novoNo.setElemento(elemento);
		
		novoNo.setAnterior(no);
		novoNo.setProximo(no.getProximo());
		
		(no.getProximo()).setAnterior(novoNo);
		no.setProximo(novoNo);
		
		return novoNo;
		
	}

	@Override
	public noDuplamente insertFirst(Object elemento) {
		noDuplamente novoNo = new noDuplamente(elemento);
		lista.addFirst(novoNo);
		primeiro.setProximo(novoNo);		
		novoNo.setAnterior(primeiro);
		
		return novoNo;
		
	}

	@Override
	public noDuplamente insertLast(Object elemento) {
		noDuplamente novoNo = new noDuplamente(elemento);
		lista.addLast(elemento);
		novoNo.setProximo(ultimo);		
		ultimo.setAnterior(novoNo);
		
		return novoNo;
		
	}

	@Override
	public Object remove(noDuplamente no) {
		Object temp = no.getElemento();
		
		noDuplamente anteriorRemover = no.getAnterior();
		noDuplamente proximoRemover = no.getProximo();
		

		//modificando as conexões dos nos envolvidos
		proximoRemover.setAnterior(anteriorRemover);
		anteriorRemover.setProximo(proximoRemover);
		
		no.setAnterior(null);
		no.setProximo(null);
		
		return temp;
		
	}
	
	public String toString(){
		return lista.toString();
		
	}

}
