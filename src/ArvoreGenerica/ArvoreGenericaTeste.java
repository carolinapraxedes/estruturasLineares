package ArvoreGenerica;

public class ArvoreGenericaTeste {

	public static void main(String[] args) {
		TADArvoreGenerica arvore = new TADArvoreGenerica("A");
		arvore.addChild(arvore.root(), "B");
		No algo = arvore.addChild(arvore.root(), "C");
		arvore.addChild(arvore.root(), "D");
		System.out.println(arvore.size);
		System.out.println(arvore.parent(algo));
	}

}
