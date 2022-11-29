package listaDuplamenteEncadeada;



public class duplaEncadeadaTeste {

	public static void main(String[] args) {
		duplaEncadeada a = new duplaEncadeada();
		
		
		System.out.println(a.size());
		System.out.println(a.isEmpty()); 
		a.getPrimeiro();
		a.getUltimo();
		noDuplamente n1 = a.addFirst("PRIMEIRO");
		
		a.addFirst("NOVOPRIMEIRO");
		a.addFirst("BLAUBLAU");
		
		System.out.println(a);
		//a.procurar("BLAUBLAU");
		//a.addBefore();
		System.out.println(a.getUltimo());
		a.addLast("vai ser o ultimo");
		a.addLast("NOVO ULTIMO");
		System.out.println(a);
		System.out.println(a.size());
		
		a.removeLast();
		System.out.println(a);
		System.out.println(a.size());
		
		a.removeLast();
		System.out.println(a);
		System.out.println(a.getUltimo());
		System.out.println(a.size());
		
		a.removeFirst();
		System.out.println(a);
		System.out.println(a.getPrimeiro());
		System.out.println(a.size());



	}

}
