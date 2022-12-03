package TADListaEncadeada;

import listaDuplamenteEncadeada.noDuplamente;

public class TADListaEncadeadaTeste {

	public static void main(String[] args) {
		TADListaEncadeada lista = new TADListaEncadeada();
		noDuplamente no1 = lista.insertFirst("BORA");
		noDuplamente no2 = lista.insertFirst("BRASIL");
		lista.insertLast("HEXA");
		lista.insertLast("2022");
		
		System.out.println(lista);
		
		lista.swapElements(no2, no1);
		System.out.println(lista);

	}

}
