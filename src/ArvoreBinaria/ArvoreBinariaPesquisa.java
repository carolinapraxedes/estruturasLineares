package ArvoreBinaria;

import java.util.ArrayList;

public class ArvoreBinariaPesquisa {
	protected NoBinario root;
	protected int size;
	protected ArrayList<Integer> tree;
	
	
	
	public ArvoreBinariaPesquisa(int elemento) {
		this.root= new NoBinario(elemento);
		this.size = 1;
		this.tree= new ArrayList();
		this.tree.add(root.getElement());
	}
	
	
	public boolean isExternal(NoBinario noDesejado) {
		//verifica se ele nao tem filho
		return noDesejado.getSonRight()==null && noDesejado.getSonLeft()==null;
	}
	
	public boolean isInternal(NoBinario noDesejado) {
		//verifica se tem um filho
		return noDesejado.getSonRight() !=null && noDesejado.getSonLeft()!=null;
	}


	public NoBinario search( int elemento,NoBinario noDesejado,NoBinario noParent) {
		if(noDesejado==null) {
			return noParent;
		}
		//System.out.println(noDesejado.getElement());
		if(isExternal(noDesejado)) {
			return noDesejado;
		}else if(elemento < noDesejado.getElement()){
			return search(elemento,noDesejado.getSonLeft(),noDesejado);
		}else if(elemento == noDesejado.getElement()) {
			return noDesejado;
		}else if(elemento>noDesejado.getElement()) {
			return search(elemento,noDesejado.getSonRight(),noDesejado);
		}
		return null;
		
	}
		
	
	public NoBinario insert(int elemento) throws Exception {
	    // 1º a gente pesquisa o nó que vai ser o pai do novo nó
		NoBinario noParent = search(elemento,root,null.);
	    
	    if (noParent == null)
	        throw new Exception("tem que debuggar isso aqui");
	    if (noParent.getElement() == elemento)
	        throw new Exception("Valor já existe na árvore");
	    
	    // cria o novo nó e seta o nó encontrado como pai dele
	    NoBinario novoNo = new NoBinario(elemento);
	    tree.add(elemento);
	    novoNo.setParent(noParent);
	    
	    if (isSonRight(novoNo))
	        noParent.setSonRight(novoNo);
	    else
	        noParent.setSonLeft(novoNo);
	    
	    
	    return novoNo;
	}
		

	
	private boolean isSonRight(NoBinario NoDesejado) {
			
		return NoDesejado.getParent().getElement() < NoDesejado.getElement();
	}
	
	private boolean isSonLeft(NoBinario NoDesejado) {
		
		return NoDesejado.getParent().getElement() > NoDesejado.getElement();
	}


	public void inOrder(NoBinario NoDesejado) {
		if(NoDesejado.getSonLeft()!=null) {
			inOrder(NoDesejado.getSonLeft());
		}
		System.out.print(NoDesejado.getElement()+" ");//visite
		if(NoDesejado.getSonRight()!=null) {
			inOrder(NoDesejado.getSonRight());
		}
	}
	
	public void show() {
		System.out.print("[");
		inOrder(root);		
		System.out.print("]");
	}
		
	
	public boolean isRoot(NoBinario noDesejado) {
		return noDesejado == root;
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
	



	

	
	


}
