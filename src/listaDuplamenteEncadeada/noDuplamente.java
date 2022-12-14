package listaDuplamenteEncadeada;

public class noDuplamente {
	private Object elemento;
	private noDuplamente proximo;
	private noDuplamente anterior;
	
	public noDuplamente(Object novoElemento) {
		elemento = novoElemento;
		this.proximo=null;
		this.anterior=null;
	}
	
	public Object getElemento() {
		return elemento;
	}
	
	public noDuplamente getAnterior() {
		return anterior;
	}
	
	public noDuplamente getProximo() {
		return proximo;
	}
	
	public void setElemento(Object novoElemento) {
		elemento = novoElemento;
	}
	
	public void setAnterior(noDuplamente novoAnterior) {
		anterior = novoAnterior;
	}
	
	public void setProximo(noDuplamente novoProximo) {
		proximo = novoProximo;
	}
	
	public String toString() {
		
		return getElemento().toString();
	}
}
