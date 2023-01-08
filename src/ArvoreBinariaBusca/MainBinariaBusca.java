package ArvoreBinariaBusca;

public class MainBinariaBusca {

	public static void main(String[] args) {
		ArvoreBinariaBusca tree = new ArvoreBinariaBusca();
		System.out.println(tree.size());
		System.out.println(tree.isEmpty());
//		Node n1 = tree.insert(1);
		System.out.println(tree.depth(tree.root));
		System.out.println(tree);
	}
}
