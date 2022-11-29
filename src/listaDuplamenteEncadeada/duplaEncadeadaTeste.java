package listaDuplamenteEncadeada;



public class duplaEncadeadaTeste {

	public static void main(String[] args) {
		duplaEncadeada a = new duplaEncadeada();
				
		noDuplamente no1 = a.addFirst("PRIMEIRO");
		noDuplamente no2 = a.addFirst("NOVOPRIMEIRO");
		noDuplamente no3 = a.addFirst("BLAUBLAU");
		noDuplamente no4 = a.addLast("NOVO ULTIMO");
		
		System.out.println(a);
		
		System.out.println(a.hasProximo(no4));
		System.out.println(a);

		
		//noDuplamente no5="ALGO";
		/*System.out.println(a.getUltimo());
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
		System.out.println(a.size());*/



	}

}
