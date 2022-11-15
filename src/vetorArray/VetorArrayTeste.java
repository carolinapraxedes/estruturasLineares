package vetorArray;

public class VetorArrayTeste {

	public static void main(String[] args) {
		VetorArray novoVetor = new VetorArray(6);
		//novoVetor.elemAtRank(1);
		
		novoVetor.insertAtRank(0, "1");
		novoVetor.insertAtRank(1, "2");
		novoVetor.insertAtRank(2, "3");
		
		novoVetor.insertAtRank(3, "ACHOU");
		novoVetor.insertAtRank(4, "5");
		novoVetor.insertAtRank(5, "6");
		
		novoVetor.removeAtRank(3);
		//novoVetor.insertAtRank(2, "novo valor");
		System.out.println(novoVetor.size()); 
		System.out.println(novoVetor.isEmpty());
		
		//System.out.println(novoVetor.elemAtRank(0));
		novoVetor.showVetor();
	}

}
