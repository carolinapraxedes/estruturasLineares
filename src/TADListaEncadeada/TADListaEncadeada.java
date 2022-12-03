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
		/*noDesejado.setProximo(noAtual);
		noAtual.setAnterior(noDesejado);*/
		
		
		
		
	}
	
	
	
	

	@Override
	public void insertBefore(noDuplamente no, Object elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAfter(noDuplamente no, Object elemento) {
		// TODO Auto-generated method stub
		
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
	public void insertLast(Object elemento) {
		noDuplamente novoNo = new noDuplamente(elemento);
		lista.addLast(elemento);
		novoNo.setProximo(ultimo);		
		ultimo.setAnterior(novoNo);
		
	}

	@Override
	public void remove(noDuplamente no) {
		noDuplamente noAnt = no.getAnterior();
		noDuplamente noProx = no.getProximo();
		
		noAnt.setProximo(noProx);
		noProx.setAnterior(noAnt);
		
	}
	
	public String toString(){
		return lista.toString();
		
	}

}
