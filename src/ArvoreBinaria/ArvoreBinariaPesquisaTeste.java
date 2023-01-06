package ArvoreBinaria;

public class ArvoreBinariaPesquisaTeste {

	public static void main(String[] args) throws Exception {
		ArvoreBinariaPesquisa arvore = new ArvoreBinariaPesquisa(50);
		NoBinario n14 =arvore.insert(7);
		NoBinario n15 =arvore.insert(8);
		NoBinario n16 =arvore.insert(45);
		//NoBinario n17 =arvore.insert(66);
		//NoBinario n18 =arvore.insert(69);


		
		arvore.show();
	}

}
