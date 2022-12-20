package ArvoreGenerica;

import java.util.Iterator;

public interface ITADArvoreGenerica<E> {
	/*metodos genericos*/
	public int size();
	public int height(No desejado);
	public boolean isEmpty();
	public Iterator<E> elements();
	public Iterator<E> nos();
	
	/*metodos de acesso*/
	public No root();
	public No parent(No desejado);
	public Iterator<E> children(No desejado);
	
	/*metodos de consulta e atualização*/
	public boolean isInternal(No desejado);
	public boolean isExternal(No desejado);
	public boolean isRoot(No desejado);
	public int depth(No desejado);
	
	/*Outros*/
	public No addChild(No parent, Object element);
	public Object remove (No desejado);
	public Object replace(No desejado,Object elemento);
	
}
