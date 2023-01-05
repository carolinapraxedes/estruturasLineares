package ArvoreGenerica;

public class ArvoreGenericaTeste {

	public static void main(String[] args) throws ArvoreVaziaException {
		TADArvoreGenerica arvore = new TADArvoreGenerica("A");
		No B = arvore.addChild(arvore.root(), "B");
		No C = arvore.addChild(arvore.root(), "C");
		No D = arvore.addChild(arvore.root(), "D");
		No E = arvore.addChild(D, "E");
		
		System.out.println(arvore.size);
		System.out.println(arvore.parent(B));
		
		System.out.println(arvore.remove(B));

		System.out.println(arvore.mostraArvore());
		System.out.println(arvore.size);
		System.out.println(arvore.height(E));
		
		System.out.println(arvore.mostraArvore());
		System.out.println(arvore.nos());
		System.out.println(arvore.elements());
	}

}
