package PilhaEncadeada;
import listaEncadeada.No;
import listaEncadeada.ListaEncadeada;

public class PilhaEncadeada {
	//private Object PilhaEncadeada[];
	private ListaEncadeada Lista;
	private int topo = -1;
	/*private No primeioNo=null;
	private No ultimoNo=null;*/
	
	public PilhaEncadeada() {
		this.Lista = new ListaEncadeada();
	}
	
	public int size() {
		return Lista.getTamanho();
	}
	
	public boolean isEmpty() {
		if(Lista.getPrimeiro() == null) {
			return true;
		}
		return false;
	}
	public Object exibirTopo() {
		if(this.isEmpty()) {
			return null;
		}
		return this.Lista.getUltimo();
	}

	public void push(Object elemento) {
		
		Lista.adicionar(elemento);
	
		/*this.topo = this.topo +1;
		this.PilhaEncadeada[this.topo] = elemento;*/
	}
	
	public Object pop() throws PilhaEncadeadaException {
		if(this.isEmpty()) {
			throw new PilhaEncadeadaException("Falha ao retirar, a pilha já está vazia");
		}
		else {
			return false;
			/*this.topo = this.topo -1;
			return this.PilhaEncadeada[this.topo +1];*/
		}
	}
	
	@Override
	public String toString() {
		return Lista.toString();
	}
	
	

	
	
	
}
