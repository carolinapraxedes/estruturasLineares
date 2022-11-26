package listaDuplamenteEncadeada;



public class duplaEncadeadaTeste {

	public static void main(String[] args) {
		duplaEncadeada a = new duplaEncadeada();
		
		
		System.out.println(a.size());
		System.out.println(a.isEmpty()); 
		a.getPrimeiro();
		a.getUltimo();
		a.addFirst("PRIMEIRO");
		a.addFirst("NOVOPRIMEIRO");
		a.addFirst("BLAUBLAU");
		System.out.println(a.procurar("BLAUBLAU"));
		a.procurar("BLAUBLAU");
		//a.addBefore();
		
		System.out.println(a);


	}

}
