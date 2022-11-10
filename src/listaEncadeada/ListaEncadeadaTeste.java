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
		System.out.println("=======================================");
		lista.showLista();
	
		//System.out.println(lista.get(3).getElement());
		System.out.println("===========================");
		lista.remover("ac");
		lista.showLista();
		lista.adicionar("SP");
		lista.showLista();
		System.out.println("Tamanho: "+lista.getTamanho());

		

	}

}
