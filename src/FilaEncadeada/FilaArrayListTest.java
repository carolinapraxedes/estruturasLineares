package FilaEncadeada;

public class FilaArrayListTest {

	public static void main(String[] args) {
		FilaArrayList novaFila = new FilaArrayList();
		
		novaFila.Enqueue("0");
		novaFila.Enqueue("1");
		novaFila.Enqueue("2");
		novaFila.Enqueue("3");

		System.out.println(novaFila);

	}

}
