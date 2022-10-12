package PilhaBlackRed;


public class PilhaBlackRed implements PilhaBR {
	private Object PilhaBlackRed[];
	private int posicaoTopoRed = -1; 
	private int posicaoTopoBlack;
	
	public PilhaBlackRed(int tamanho) {
		this.PilhaBlackRed = new Object[tamanho];
		this.posicaoTopoBlack = tamanho;
		//criando uma pilha com o tamanho que foi passado
	}
	
	/* ==========================================================
	 * PILHA BLACK
	 * ==========================================================
	 */

	@Override
	public int sizeBlack() {
		//quantos elementos tem dentro da pilha
		return posicaoTopoBlack - 1;
		
	}
	
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
			
	public Object popBlack() throws PilhaBlackEnception {
		//Remove um elemento da pilha
		if(this.isEmptyBlack()) {
			throw new PilhaBlackEnception("Pilha Vazia");
		}else {
			Object Temporario = PilhaBlackRed[posicaoTopoBlack];
			this.PilhaBlackRed[this.posicaoTopoBlack] = null;
			this.posicaoTopoBlack = this.posicaoTopoBlack + 1;
			
					
			return Temporario;
			
		}
	}
	
	/*============================================================
	 * PILHA RED
	 * ===========================================================
	*/
	
	@Override
	public int sizeRed() {
		//quantos elementos tem dentro da pilha
		return posicaoTopoRed + 1;
	}

	@Override
	public boolean isEmptyRed() {
		if(this.posicaoTopoRed == -1) {
			return true;
		}
		return false;
	}
	
	
	public Object posicaoTopRed() throws PilhaRedException {
		return this.posicaoTopoRed;
	}
	
	@Override
	public void pushRed(Object elementoRed) {
		//Adiciona um elemento na pilhaRed
		if(this.posicaoTopoRed + 1 == this.posicaoTopoBlack) {
			throw new PilhaBlackEnception("Pilha Cheia");
		} else {
			this.posicaoTopoRed = this.posicaoTopoRed + 1;
			this.PilhaBlackRed[posicaoTopoRed] = elementoRed;
		}
		
	}
	
	public Object popRed() throws PilhaRedException {
		//Remove um elemento da pilha
			if(this.isEmptyRed()) {
				throw new PilhaRedException("Pilha Vazia");
			}else {
				Object Temporario = PilhaBlackRed[posicaoTopoRed];
				this.PilhaBlackRed[this.posicaoTopoRed] = null;
				this.posicaoTopoRed = this.posicaoTopoRed - 1;
								
				return Temporario;
			}
		}

	public int size() {
		return posicaoTopoRed + posicaoTopoBlack;
	}
	
	public void AumentarTamanho() {				
		if(posicaoTopoRed == posicaoTopoBlack) {
			//essa condicao verifica se esta cheia?
			
			int NovoTamanho = PilhaBlackRed.length*2;
			Object NovaPilhaBlackRed[]= new Object[NovoTamanho];
			
			for(int i=0;i<PilhaBlackRed.length;i++) {
				NovaPilhaBlackRed[i] = PilhaBlackRed[i];
				PilhaBlackRed = NovaPilhaBlackRed;				
			}
			
		}
	}
	
	
	
	
	
	public void showPilha() {
		
		for(int i=0;i< this.PilhaBlackRed.length;i++) {
			
			System.out.println("["+PilhaBlackRed[i]+"]");
			
		}
	}
}
