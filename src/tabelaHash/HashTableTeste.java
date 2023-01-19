package tabelaHash;

public class HashTableTeste {

	public static void main(String[] args) {
		HashTable tabela = new HashTable(4);
		tabela.insertElement(0, 0);
		tabela.insertElement(1,10);
		tabela.insertElement(2, 5);
		tabela.insertElement(3, 4);
		tabela.insertElement(4, 40);
		tabela.insertElement(5, 41);
		tabela.isEmpty();
		System.out.println(tabela.size());

		tabela.print();

	}

}
