package PilhaBlackRed;

import Pilha.PilhaVaziaExcecao;

public class PilhaBlackRed implements PilhaBR {
	private Object PilhaBlackRed[];
	private int posicaoTopoRed = -1; 
	private int posicaoTopoBlack;
	
	public PilhaBlackRed(int tamanho) {
		this.PilhaBlackRed = new Object[tamanho];
		this.posicaoTopoBlack = tamanho;
		//criando uma pilha com o tamanho que foi passado
	}

	@Override
	public int sizeBlack() {
		//quantos elementos tem dentro da pilha
		return posicaoTopoBlack - 1;
		
	}

	@Override
	public boolean isEmptyBlack() {
		//verifica se há elementos dentro da pilha
		if(this.posicaoTopoBlack == this.PilhaBlackRed.length) {
			return true;
		}
		return false;
	}

	@Override
	public Object posicaotTopBlack() throws PilhaBlackEnception {
		return this.posicaoTopoBlack;
		
	}

	@Override
	public void pushBlack(Object elementoBlack) {
		//Adiciona um elemento na pilhaBlack

		if(this.posicaoTopoBlack - 1 == this.posicaoTopoRed) {
			throw new PilhaBlackEnception("Pilha Cheia");
		} else {
			this.posicaoTopoBlack = this.posicaoTopoBlack - 1;
			this.PilhaBlackRed[posicaoTopoBlack] = elementoBlack;
		}
		
	}
		
	

	@Override
	public Object popBlack() throws PilhaBlackEnception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sizeRed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmptyRed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object posicaoTopRed() throws PilhaRedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pushRed(Object elementoRed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object popRed() throws PilhaRedException {
		// TODO Auto-generated method stub
		return null;
	}
}
