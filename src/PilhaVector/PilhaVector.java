package PilhaVector;
import java.util.Vector;

import Pilha.PilhaVaziaExcecao;

public class PilhaVector implements IPilhaVector{
	Vector <Object> pilhaVector;
	
	public PilhaVector() {
		pilhaVector = new Vector<>();
	
		
	}
		
	public int size() {
		return this.pilhaVector.size();
	}

	public Object top() throws PilhaVaziaException {
		if(pilhaVector.size() == 0) {
			throw new PilhaVaziaExcecao("Pilha Vazia");
		}else {			
			return pilhaVector.get(pilhaVector.size() - 1);
		}
	}

	public void push(Object item) {
		//adiciona elemento
		
			this.pilhaVector.add(item);

				
	}


	public Object pop() throws PilhaVaziaException {
		if(pilhaVector.size() == 0) {
			throw new PilhaVaziaExcecao("Pilha Vazia");
		}else {			
			return this.pilhaVector.remove(pilhaVector.size()-1);
		}
		
	}
	
	public void showPilha() {
		
		for(int i=0;i< this.pilhaVector.size();i++) {
			
			System.out.println("["+ pilhaVector +"]");
			
		}
	}


}
