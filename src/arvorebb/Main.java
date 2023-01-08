package arvorebb;

public class Main {

	public static void main(String[] args) {
		 NoBP arvore = new NoBP(10);
	        NoBP.insert(arvore,null);
	        
	        NoBP num5 = new NoBP(5);
	        NoBP.insert(num5, arvore);
	        
	        NoBP num20 = new NoBP(20);
	        NoBP.insert(num20, arvore);
	        
	        NoBP num33 = new NoBP(33);
	        NoBP.insert(num33, arvore);
	        
	        NoBP num1 = new NoBP(1);
	        NoBP.insert(num1, arvore);
	        
	        NoBP num2 = new NoBP(0);
	        NoBP.insert(num2, arvore);
	        
	        NoBP num7 = new NoBP(7);
	        NoBP.insert(num7, arvore);
	        
	    
	        
	        /*System.out.println("Pos-ordem:");
	        NoBP.imprimirPosOrdem(arvore);
	        System.out.println("");
	        
	        System.out.println("Pre-ordem:");
	        NoBP.imprimirPreOrdem(arvore);
	        System.out.println("");*/
	        
	        System.out.println("Em-ordem:");
	        NoBP.imprimirEmOrdem(arvore);
	        System.out.println("");

	}

}
