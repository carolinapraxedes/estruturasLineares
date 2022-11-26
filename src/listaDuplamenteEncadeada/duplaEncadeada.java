package listaDuplamenteEncadeada;

import listaEncadeada.No;

public class duplaEncadeada {
	protected int size; //qtd elementos
	protected noDuplamente primeiro; //sentinelas
	protected noDuplamente ultimo;
	
	public duplaEncadeada(){
		size = 0;
		//criando os sentinelas
		primeiro = new noDuplamente(null);
		ultimo = new noDuplamente(null);
		primeiro.setProximo(ultimo);
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public noDuplamente getPrimeiro() {
		//pega primeiro no da lista
		if(isEmpty()) {
			System.out.println("A lista está vazia");
		}
		return primeiro.getProximo();
	}
	
	public noDuplamente getUltimo() {
		//pega o ultimo no da lista
		if(isEmpty()) {
			System.out.println("A lista está vazia");
		}
		return ultimo.getAnterior();
	}
	
	//vai pegar o no anterior do no que foi passado por parametro
	public noDuplamente getAnterior(noDuplamente noDesejado){
		if(noDesejado == primeiro) {
			System.out.println("não existe um no anterior do primeiro");
		}
		return noDesejado.getAnterior();
	}
	
	public noDuplamente getProximo(noDuplamente noDesejado) {
		if(noDesejado == ultimo) {
			System.out.println("Nao existe no proximo do ultimo");
		}
		return noDesejado.getProximo();
	}
	
	public void addFirst(Object elemento) {		
		/*NOVO PRIMEIRO = NP
		 *PROXIMO PRIMEIRO = X
		 *PRIMEIRO = P
		 *
		 *  P --- NP --- X
		 *	*/
		noDuplamente novoPrimeiro = new noDuplamente(elemento);
		noDuplamente proxPrimeiro = primeiro.getProximo();
		
		novoPrimeiro.setProximo(proxPrimeiro);
		//o proximo de NP vai ser X
		novoPrimeiro.setAnterior(primeiro);
		//o anterior de NP vai ser P
		
		proxPrimeiro.setAnterior(novoPrimeiro);
		//o anterior de X vai ser NP
		primeiro.setProximo(novoPrimeiro);
		//o proximo de P vai ser NP
				
		
		size++;
	}
	
	public void addBefore(Object antesNoElemento, Object NoElemento) {
		//insire o z antes do v
		//antesNo = v, No = z
		
		noDuplamente antesNo = procurar(antesNoElemento);
		noDuplamente NoAtual = new noDuplamente(NoElemento);
		
				
		noDuplamente temp = getAnterior(antesNo);
		//estou pegando o No anterior do antesNo 
		
		//estou dizendo que noAtual vai anterior de anterior e prox de antesNo
		NoAtual.setAnterior(temp);
		NoAtual.setProximo(antesNo);
		
		//O noatual vai ser antes do noanterior e o temp vai ser proximo do no Atual
		antesNo.setAnterior(NoAtual);
		temp.setProximo(NoAtual);
		size++;
	}
	

	public noDuplamente procurar(Object elementoProcurado) {
		noDuplamente procurado = this.primeiro;
		while(procurado.getProximo()!=null) {
			if(procurado.getElemento()==elementoProcurado) {
				return procurado;
			}
			procurado = procurado.getProximo();
		}
		return null;
	}
	
	public String toString() {
		String s = "[";
		noDuplamente v = primeiro.getProximo();
		while(v!=ultimo) {
			s+=v.getElemento();
			v=v.getProximo();
			if(v!=ultimo) {
				s+=", ";
			}
		}
		s+="]";
		
		return s;
	}
	
	
	
	
	
}
