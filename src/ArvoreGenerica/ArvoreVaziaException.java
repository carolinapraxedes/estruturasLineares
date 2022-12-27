package ArvoreGenerica;

public class ArvoreVaziaException extends Exception{
	public ArvoreVaziaException() {
		super("A árvore não tem filhos");
	}
	
}
