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

	
	public Object posicaotTopBlack() throws PilhaBlackEnception {
		return this.posicaoTopoBlack;
		
	}

	
	public void pushBlack(Object elementoBlack) {
		//Adiciona um elemento na pilhaBlack

		if(this.posicaoTopoBlack - 1 == this.posicaoTopoRed) {
			this.AumentarTamanho();
		}
		this.posicaoTopoBlack = this.posicaoTopoBlack - 1;
		this.PilhaBlackRed[posicaoTopoBlack] = elementoBlack;
	
		
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
	
	
	public int sizeRed() {
		//quantos elementos tem dentro da pilha
		return posicaoTopoRed + 1;
	}

	
	public boolean isEmptyRed() {
		if(this.posicaoTopoRed == -1) {
			return true;
		}
		return false;
	}
	
	
	public Object posicaoTopRed() throws PilhaRedException {
		return this.posicaoTopoRed;
	}
	
	
	public void pushRed(Object elementoRed) {
		//Adiciona um elemento na pilhaRed
		if(this.posicaoTopoRed + 1 == this.posicaoTopoBlack) {
			this.AumentarTamanho();
		} 
			this.posicaoTopoRed = this.posicaoTopoRed + 1;
			this.PilhaBlackRed[posicaoTopoRed] = elementoRed;
		
		
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
					
			int NovoTamanho = this.PilhaBlackRed.length*2;
			Object NovaPilhaBlackRed[]= new Object[NovoTamanho];
			
			for(int i=0;i<=this.posicaoTopoRed;i++) {
				NovaPilhaBlackRed[i] = this.PilhaBlackRed[i];
			}
			
			//pega a ultima posicao do topo para fazer a copia da pilha preta
			NovoTamanho = NovoTamanho - 1;
			
			//copia a pilha preta para o novo array
			for(int i=this.PilhaBlackRed.length - 1;i >= this.posicaoTopoBlack;i--) {
				NovaPilhaBlackRed[NovoTamanho--] = this.PilhaBlackRed[i];
			}
			//substituindo o array antigo pelo array novo e reinicia o topo do preto
			this.PilhaBlackRed = NovaPilhaBlackRed;				
			this.posicaoTopoBlack = NovoTamanho +1;
		
	}
	
	
	
	
	
	public void showPilha() {
		
		for(int i=0;i< this.PilhaBlackRed.length;i++) {
			
			System.out.println("["+PilhaBlackRed[i]+"]");
			
		}
	}
}
