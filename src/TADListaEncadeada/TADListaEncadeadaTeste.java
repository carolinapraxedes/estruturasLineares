package TADListaEncadeada;

import listaDuplamenteEncadeada.noDuplamente;

public class TADListaEncadeadaTeste {

	public static void main(String[] args) {
		TADListaEncadeada lista = new TADListaEncadeada();
		noDuplamente no1 = lista.insertFirst("BORA");
		noDuplamente no2 = lista.insertFirst("BRASIL");
		noDuplamente no3 = lista.insertLast("HEXA");
		noDuplamente no4 = lista.insertLast("2022");
		
		System.out.println(lista);
		//lista.insertBefore(no3, "ANTES DO HEXA");
		lista.insertBefore(no1, "ANTES DO BORA");
		//lista.insertAfter(no3,"teste");
		
		
		System.out.println(lista);
		


	}

}
