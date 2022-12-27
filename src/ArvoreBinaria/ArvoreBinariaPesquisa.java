package ArvoreBinaria;

import java.util.ArrayList;
import java.util.Iterator;

import ArvoreGenerica.No;


public class ArvoreBinariaPesquisa {
	protected NoBinario root;
	protected int size;
	
	//v= no
	//k = elemento

	
	public ArvoreBinariaPesquisa() {
		this.root=null;
		this.size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size()==0);
	}
	
	public NoBinario root() {
		return root;
	}

	
	public boolean isRoot(NoBinario noDesejado) {
		return noDesejado == root;
	}
	
	public boolean isInternal(NoBinario noDesejado) {		
		return noDesejado.getElement()>0;
	}
	
	public boolean isExternal(NoBinario noDesejado) {
		// TODO Auto-generated method stub
		return false;
	}
	public NoBinario leftChild(NoBinario noDesejado) {
		return noDesejado.getSonLeft();
	}
	
	public NoBinario rightChild(NoBinario noDesejado) {
		return noDesejado.getSonRight();
	}
	public boolean hasLeft(NoBinario noDesejado) {
		return noDesejado.getSonLeft();
	}
	
	public boolean hasRight(NoBinario noDesejado) {
		return noDesejado.getSonRight();
	}


	public NoBinario search(NoBinario noDesejado, int elemento) {
		if(isExternal(noDesejado)) {
			return noDesejado;
		}else if(elemento < noDesejado.getElement()){
			return search(noDesejado.getSonLeft(),elemento);
		}else if(elemento == noDesejado.getElement()) {
			return noDesejado;
		}else if(elemento>noDesejado.getElement()) {
			return search(noDesejado.getSonRight(),elemento);
		}
		return null;
		
	}
	
	public NoBinario insert(int elemento) {
		NoBinario NoProcurado = search(root,elemento);
		if(NoProcurado.getElement()== elemento) {
			System.out.println("deu ruim");
		}else {
			NoBinario novoNo = new NoBinario(elemento, NoProcurado);
			novoNo.setParent(NoProcurado);
			if(isSonRight(novoNo)) {
				NoProcurado.setSonRight(novoNo);
			}else {
				NoProcurado.setSonLeft(novoNo);
			}
			return novoNo;
		}			
		return null;
		
	}

	private boolean isSonRight(NoBinario novoNo) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private boolean isSonLeft(NoBinario novoNo) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Object replace(NoBinario desejado, int elemento) {
		NoBinario noRepassado = new NoBinario(elemento, desejado);
		desejado.setElement(elemento);
		return noRepassado;
	}
	

	
	


}
