package PilhaVector;

import java.util.Vector;

public class PilhaVectorTest {

	public static void main(String[] args) {
		PilhaVector novaPilha = new PilhaVector();
		
		novaPilha.push("GABRIEL");
		novaPilha.push("CLAUDIO");
		novaPilha.push("CULLEN");
		novaPilha.pop();
		novaPilha.pop();
		novaPilha.pop();
		novaPilha.pop();
		novaPilha.showPilha();
		

	}

}
