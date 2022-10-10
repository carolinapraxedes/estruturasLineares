package Pilha;


public class PilhaArray implements Pilha {
	private Object PilhaPikachu[];
	private int posicaoTopo= -1;
	
	public PilhaArray(int tamanho) {
		this.PilhaPikachu = new Object[tamanho];
		
		//criando uma pilha com o tamanho que foi passado
	}
		
	@Override
	public int size() {
		//quantos elementos tem dentro da pilha
		return posicaoTopo + 1;
	}

	@Override
	public boolean isEmpty() {
		//verifica se há elementos dentro da pilha
		if(this.posicaoTopo == -1) {
			return true;
		}
		return false;
	}

	@Override
	public Object top() throws PilhaVaziaExcecao {
		//Vai mostrar o último elemento da pilha
		if(this.isEmpty()) {
			return null;
		}
		return this.PilhaPikachu[this.posicaoTopo];
	}

	@Override
	public void push(Object elemento) {
		//Adiciona um elemento na pilha
		if(this.posicaoTopo == this.PilhaPikachu.length - 1) {
			throw new PilhaVaziaExcecao("Pilha Vazia");
		} else {
			this.posicaoTopo = this.posicaoTopo + 1;
			this.PilhaPikachu[posicaoTopo] = elemento;
		}
		
	}

	@Override
	public Object pop() throws PilhaVaziaExcecao {
		//Remove um elemento da pilha
		if(this.isEmpty()) {
			throw new PilhaVaziaExcecao("Pilha Vazia");
		}else {
			this.posicaoTopo = this.posicaoTopo - 1;
			return this.PilhaPikachu[this.posicaoTopo + 1];
		}
	}

}
