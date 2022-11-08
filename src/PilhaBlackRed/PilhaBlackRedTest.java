package PilhaBlackRed;

public class PilhaBlackRedTest {

	public static void main(String[] args) {
		PilhaBlackRed pilha = new PilhaBlackRed(4);
		
		pilha.pushRed("testered");	
		pilha.pushRed("testered");
		pilha.pushRed("é o vermelho");
		pilha.pushRed("é o flamengo");
		pilha.pushRed("é o flamengo");
		pilha.popRed();
		pilha.popRed();
		pilha.popRed();

		

		pilha.showPilha();

	}

}
