package TADLista;

public class TADListaTeste {
	public static void main(String[] args) {
		TADLista novaLista = new TADLista(6);
		//System.out.println(novaLista);

		novaLista.insertBefore(4, "ultimo");
		System.out.println(novaLista);
		novaLista.insertBefore(5, "sasa");
		System.out.println(novaLista);
		
		
		
		//novaLista.first();
		System.out.println(novaLista.last());
		//System.out.println(novaLista);
		novaLista.insertFirst("primeiro");
		System.out.println(novaLista);
		
		novaLista.before(1);
		System.out.println("========after==========");
		novaLista.after(3);
		
		
		System.out.println("esse é o ultimo?"+novaLista.isLast(4));
		
		System.out.println(novaLista.size());
		System.out.println(novaLista.isEmpty());									
		
	}
	
	
}
