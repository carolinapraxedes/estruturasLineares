package ArvoreGenerica;

import java.util.Iterator;

public class TADArvoreGenerica implements ITADArvoreGenerica{
	No root;
	int size = 0;
	
	/*metodos que faltam implementar:
	 * elements
	 * nos
	 * height
	 * depth
	 * replace
	 * remove

	 * */
	
	public TADArvoreGenerica(Object element) {
		root = new No(null,element);
		size = 1;
	}
	public No root() {
		return root;
	}	
	public No parent(No desejado) {
		//retorna o pai do no desejado
		return desejado.getParent();
	}
	@Override
	public int size() {		
		return size;
	}
	@Override
	public boolean isEmpty() {		
		return size==0;
	}
	@Override
	public Iterator elements() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterator nos() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterator children(No desejado) {
		//retorna os filhos do no desejado
		return desejado.children();
	}
	@Override
	public boolean isInternal(No desejado) {
		return desejado.childrenNumber()>0;
	}
	@Override
	public boolean isExternal(No desejado) {
		return desejado.childrenNumber()==0;
	}
	@Override
	public boolean isRoot(No desejado) {
		return desejado==root;
	}
	public int height() {
		if(isExternal(No algo)) {
			return 0;
		}
		
	}
	@Override
	public int depth(No desejado) {
		if(desejado == root) {
			return 0;
		}
		return 1+depth(parent(desejado.getParent()));
	}

	@Override
	public Object replace(No desejado, Object elemento) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public No addChild(No parent, Object element) {
		No novoNo = new No(parent, element);
		parent.addChild(novoNo);
		size++;
		
		return novoNo;
		
	}
	@Override
	public Object remove(No desejado) throws InvalidNoException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
