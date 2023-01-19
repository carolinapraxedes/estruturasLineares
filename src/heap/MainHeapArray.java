package heap;

public class MainHeapArray {

	public static void main(String[] args) {
		HeapPrioridade teste = new HeapPrioridade(15);
		teste.insert(5);
		teste.insert(3);
		teste.insert(17);
		teste.insert(10);
		teste.insert(84);
		teste.insert(19);
		teste.insert(6);
		teste.insert(22);
		teste.insert(9);
		
		teste.print();
		
	}

}
