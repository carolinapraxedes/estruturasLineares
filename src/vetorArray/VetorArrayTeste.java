package vetorArray;

public class VetorArrayTeste {

	public static void main(String[] args) {
		VetorArray novoVetor = new VetorArray(6);
		//novoVetor.elemAtRank(1);
		
		novoVetor.insertAtRank(0, "1");

		novoVetor.insertAtRank(1, "2");
		novoVetor.insertAtRank(2, "3");
		novoVetor.insertAtRank(3, "4");
		novoVetor.insertAtRank(4, "SASARA");
		novoVetor.insertAtRank(5, "SASUKE");
		
		System.out.println(novoVetor.size());
		novoVetor.showVetor();
		
		novoVetor.removeAtRank(5);
		System.out.println(novoVetor.size());
		novoVetor.showVetor();		

	}
}
