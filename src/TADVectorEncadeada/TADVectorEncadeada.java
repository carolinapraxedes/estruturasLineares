package TADVectorEncadeada;

import listaDuplamenteEncadeada.duplaEncadeada;
import listaDuplamenteEncadeada.noDuplamente;

public class TADVectorEncadeada implements IVectorEncadeado {
	int tamanho;
	duplaEncadeada lista = new duplaEncadeada();
	
	public TADVectorEncadeada() {
		tamanho=0;
	}
	
	
	@Override
	public Object elemAtRank(noDuplamente noIndice) {		
		return noIndice.getElemento();
	}

	@Override
	public Object replaceAtRank(noDuplamente noIndice, Object elemento) {
	
		noIndice.setElemento(elemento);
		return noIndice.getElemento();
	}

	@Override
	public Object insertAtRank(noDuplamente noIndice, Object elemento) {
		noIndice.setElemento(elemento);
		tamanho++;
		return noIndice.getElemento();
		
		
	}

	@Override
	public Object removeAtRank(noDuplamente noIndice) {
		noDuplamente remove = noIndice;
		lista.remove(noIndice);
		tamanho--;
		
		return remove.getElemento();
	}

	@Override
	public int size() {
		return tamanho;
	}

	@Override
	public boolean isEmpty() {

		return tamanho==0;
	}

}
