package ArvoreBinaria;

public class ArvoreBinariaPesquisaTeste {

	public static void main(String[] args) throws Exception {
		ArvoreBinariaPesquisa arvore = new ArvoreBinariaPesquisa(50);
			arvore.insert(7);
			arvore.insert(8);
			arvore.insert(45);
			arvore.insert(66);
			arvore.insert(71);
			arvore.insert(85);
			arvore.insert(41);
			arvore.insert(65);
	
		//System.out.println(arvore.search(8,arvore.root));


		
		arvore.show();
	}

}
