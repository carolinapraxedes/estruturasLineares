package Pilha;
public class testePilha {
	public static void main(String[] args) {		
		Integer[] b = new Integer[1];		
		PilhaArray pp=new PilhaArray(10);
		System.out.println("inserindo");
		for(int f=0;f<10;f++){
		  System.out.println(f);		  
		  pp.push(f);
		}
		System.out.println("retirando");
		for(int f=0;f<10;f++){
			  System.out.print(f);
			  System.out.println(" - "+pp.pop());
		}
	}
}
