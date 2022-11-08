package listaEncadeada;

public class ListaEncadeadaTeste {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		lista.adicionar("ac");
		lista.adicionar("BA");
		lista.adicionar("CE");
		System.out.println("Tamanho: "+lista.getTamanho());
		System.out.println("Primeiro: "+lista.getPrimeiro().getElement());
		System.out.println("Ultimo: "+lista.getUltimo().getElement());
		
		System.out.println(lista.get(0).getElement());
		System.out.println(lista.get(1).getElement());
		System.out.println(lista.get(2).getElement());
		

	}

}
