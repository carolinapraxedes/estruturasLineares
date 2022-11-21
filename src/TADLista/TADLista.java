package TADLista;

import java.util.Arrays;

public class TADLista implements ITADLista {
	int tamanho;
	Object[] Lista;
	int contador;
	
	
	public TADLista(int tamanho) {
		this.Lista = new Object[tamanho];
		this.tamanho = tamanho;
		int contador=0;
	}

	@Override
	public int size() {
		
		return this.contador;
	}

	@Override
	public boolean isEmpty() {
		if(this.contador == 0){
			return true;
		}
		return false;
	}

	@Override
	public boolean isFirst(int indice) {
		
		//verifica se o elemento do indice passado é igual ao primeiro elemento
		if(this.Lista[indice]==first()) {
			return true;
		}

		return false;
	}

	@Override
	public boolean isLast(int indice) {
		//verifica se o elemento do indice passado é igual ao ultimo elemento
		if(this.Lista[indice]==last()) {
			return true;
		}

		return false;
	}
	

	@Override
	public Object first() {
		Object temp ="";
		for(int i=0;i<Lista.length;i++) {
			//ele procura o primeiro elemento que seja diferente de null e retorna ao encontrar
			if(this.Lista[i]!=null) {
				temp=Lista[i];
				break;
			}
		}
		return temp;
	}

	@Override
	public Object last() {
		Object temp="";
		for(int i=Lista.length-1;i>=0;i--) {
			//ele procura o ultimo elemento que seja diferente de null e retorna ao encontrar
			if(this.Lista[i]!=null) {
				temp= Lista[i];
				break;
			}
		}
		return temp;
	}

	@Override
	public void before(int indice) {	
		//retorna o elemento anterior do indice passado
		System.out.println(this.Lista[indice-1]);
		
		
	}

	@Override
	public void after(int indice) {
		//retorna o elemento depois do indice passado
		System.out.println(this.Lista[indice+1]);
		
	}

	@Override
	public void replaceElement(int indice, Object elemento) {
		//substitui o elemento do indice por um novo elemento
		//se o elemento do indice for vazio/null 
		//entao vai entrar um elemento no lugar, logo tera que aumentar o contador
		if(this.Lista[indice]==null) {
			contador++;
		}
		this.Lista[indice]=elemento;
		
		
	}

	@Override
	public void swapElements(int indiceAtual, int indiceDesejado) {
		//troca o elemento de um indice por um elemento de um outro indice
		Object temp = this.Lista[indiceAtual];
		this.Lista[indiceAtual]=this.Lista[indiceDesejado];
		
		this.Lista[indiceDesejado]=temp;
		
	}

	@Override
	public void insertBefore(int indice, Object elemento) {
		//insire um elemento antes do indice passado
		//é necessario o arraycopy para mover os elementos na lista
		System.arraycopy(Lista, indice-1, Lista, indice, tamanho-indice);
		this.Lista[indice-1]=elemento;
		contador++;
	}

	@Override
	public void insertAfter(int indice, Object elemento) {
		//insere um elemento depois do indice passado
		//é necessario o arraycopy para mover os elementos na lista
		System.arraycopy(Lista, indice, Lista, indice+1, tamanho-indice-1);
		this.Lista[indice+1]=elemento;
		contador++;
		
	}

	@Override
	public void insertFirst(Object elemento) {
		//insere um elemento no primeiro indice
		System.arraycopy(Lista, 0, Lista, 0+1, tamanho-1);
		this.Lista[0]=elemento;
		contador++;
		
	}

	@Override
	public void insertLast(Object elemento) {
		//insere um elemento no ultimo indice
		System.arraycopy(Lista, tamanho-1, Lista, tamanho, tamanho);
		this.Lista[tamanho-1]=elemento;
		contador++;
		
	}

	@Override
	public void remove(int indice) {
		//remove o elemento do indice desejado
		this.Lista[indice]=null;
		contador--;
		
	}
	
	public String toString() {
		return Arrays.toString(Lista);
	}

}
