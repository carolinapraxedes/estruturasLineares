package ListaEncadeadaLIVRO;

public class SimplesEncadeadaTeste {

	public static void main(String[] args) {
		SimplesEncadeada lista = new SimplesEncadeada();
		lista.addPrimeiro(3);
		lista.show();
		lista.addPrimeiro(2);
		lista.show();
		lista.addUltimo(4);
		lista.show();

		lista.removePrimeiro();
		lista.show();
		lista.removeUltimo();
		lista.show();
		
		lista.addUltimo(5);
		lista.show();
		
	}

}
