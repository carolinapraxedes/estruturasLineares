package TADsequencia;

import listaDuplamenteEncadeada.noDuplamente;

public class TADsequenciaTeste {

	public static void main(String[] args) {
		TADsequencia sequencia = new TADsequencia();
		noDuplamente no1 = new noDuplamente("1");
		noDuplamente no2 = new noDuplamente("2");
		noDuplamente no3 = new noDuplamente("3");
		noDuplamente no4 = new noDuplamente("4");
		noDuplamente no5 = new noDuplamente("5");
		
		System.out.println(sequencia.AtRank(6));

	}

}
