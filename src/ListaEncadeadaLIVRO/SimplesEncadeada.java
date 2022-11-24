package ListaEncadeadaLIVRO;


public class SimplesEncadeada {
	protected No primeiro;
	protected int tamanho; //numeros de nos na lista
	protected No ultimo;
	
	public SimplesEncadeada() {
		this.primeiro=null;
		this.ultimo=null;
		this.tamanho=0;
	}
	
	public void addPrimeiro(Object novoValorPrimeiro) {
		No novoNoPrimeiro = new No(novoValorPrimeiro);
		novoNoPrimeiro.setProximo(primeiro);
		primeiro = novoNoPrimeiro;
		tamanho++;
	}
	
	public void addUltimo(Object novoValorUltimo) {
		No novoNoUltimo = new No(novoValorUltimo);
		No temp = primeiro;
		while(temp.getProximo()!=null) {
			temp = temp.getProximo();
			//vai procurar pelo o ultimo novo
		}
		temp.setProximo(novoNoUltimo);
		tamanho++;
	}
	
	public void removePrimeiro() {
		if(this.primeiro==null) {
			System.out.println("A lista está vazia");
		}
		No temp = primeiro;
		primeiro = primeiro.getProximo();
		temp.setProximo(null);
		tamanho--;
		
	}
	public void removeUltimo() {
		if(this.primeiro==null) {
			System.out.println("A lista está vazia");
		}
		No penultimo = null;
		No temp = primeiro;
		while(temp.getProximo()!=null) {
			//procura o ultimo
			if(temp.getProximo().getProximo()==null) {
				//procura penultimo
				penultimo = temp;
			}
			temp = temp.getProximo();
		}
		penultimo.setProximo(null);
		temp=null;
		tamanho--;		
	}
	
	
	public void show() {
		No temp = primeiro;
		System.out.print("[");
		while(temp!=null) {
			System.out.print(" "+temp.getElemento()+" ");
			temp = temp.getProximo();
		}
		System.out.print("]");
	}
	
}