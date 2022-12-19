package ArvoreGenerica;

import java.util.ArrayList;
import java.util.Iterator;

public class No 
{
	private Object element;
	private No parent;
	private ArrayList<No> children = new ArrayList<No>();
	
	public No(No parent, Object element){
		this.parent = parent;
		this.element = element;
	}
	
	public Object getElement(){
		return element;
	}
	
	public void setElement(Object element){
		this.element = element;
	}
	
	public No getParent(){
		return parent;
	}
	
	public void setParent(No parent){
		this.parent = parent;
	}

	public int childrenNumber(){
		return children.size();
	}
	public Iterator children(){
		return children.iterator();
	}	

	public void addChild(No element){
		children.add(element);
	}
	
	public void removeChild(No element){
		children.remove(element);
	}
}