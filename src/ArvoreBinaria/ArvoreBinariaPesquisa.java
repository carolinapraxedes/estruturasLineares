package ArvoreBinaria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import ArvoreGenerica.No;


public class ArvoreBinariaPesquisa {
	protected NoBinario root;
	protected int size;
	private Comparator<Object> comparatorTree;
	
	
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
	
	public boolean isExternal(NoBinario noDesejado) {
		//verifica se ele nao tem filho
		return noDesejado.getSonRight()==null && noDesejado.getSonLeft()==null;
	}
	
	public boolean isInternal(NoBinario noDesejado) {
		//verifica se tem um filho
		return noDesejado.getSonLeft()!=null && noDesejado.getSonRight()!=null;
	}
	
	public Comparator<Object> getComparatorTree() {
		return comparatorTree;
	}
	
	public Object compare(Object elementA, Object elementB) {
		return comparatorTree.compare(elementA, elementB);
	}

	public void setComparatorTree(Comparator<Object> comparatorTree) {
		this.comparatorTree = comparatorTree;
	}
	
	
	/*
	public NoBinario root() {
		return root;
	}
	
	public boolean isRoot(NoBinario noDesejado) {
		return noDesejado == root;
	}
	
	public boolean isInternal(NoBinario noDesejado) {		
		return false;
	}
	
	public boolean isExternal(NoBinario noDesejado) {
		return noDesejado.getSonRight()==null && noDesejado.getSonLeft()==null;
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
		if(novoNo.getParent()==null) {
			return false;
		}
		return novoNo.getElement();
	}
	
	private boolean isSonLeft(NoBinario novoNo) {
		// TODO Auto-generated method stub
		return false;
	}
	*/
	public Object replace(NoBinario desejado, int elemento) {
		NoBinario noRepassado = new NoBinario(elemento, desejado);
		desejado.setElement(elemento);
		return noRepassado;
	}


	

	
	


}
