package PilhaBlackRed;

public class PilhaBlackRedTest {

	public static void main(String[] args) {
		PilhaBlackRed pilha = new PilhaBlackRed(6);
		
		pilha.pushBlack("test");
		pilha.pushRed("testered");
		
		pilha.pushBlack("penultimo");
		
		pilha.pushRed("blala");
		


		pilha.showPilha();

	}

}
