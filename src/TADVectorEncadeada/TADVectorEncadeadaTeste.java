package TADVectorEncadeada;

import listaDuplamenteEncadeada.noDuplamente;


public class TADVectorEncadeadaTeste {

	public static void main(String[] args) {
		TADVectorEncadeada novoVector = new TADVectorEncadeada();
		
		noDuplamente no1 = new noDuplamente("1");
		noDuplamente no2 = new noDuplamente("2");
		noDuplamente no3 = new noDuplamente("3");
		noDuplamente no4 = new noDuplamente("4");
		noDuplamente no5 = new noDuplamente("5");
		//System.out.println(novoVector.elemAtRank(no1));
		
		//System.out.println(no4);
		//novoVector.replaceAtRank(no4, "teste");
		
		
		novoVector.insertAtRank(no5, "6");
		novoVector.insertAtRank(no4, "sara");
		
		System.out.println(novoVector.size());
		

	}

}
