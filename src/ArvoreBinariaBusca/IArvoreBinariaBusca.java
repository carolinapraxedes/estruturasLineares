package ArvoreBinariaBusca;

import java.util.Iterator;

public interface IArvoreBinariaBusca {
	public int size();
	public boolean isEmpty();
	
	public int height(Node no);
	public int depth(Node no);
	
	public boolean isInternal(Node no);
	public boolean isExternal(Node no);
		
	public void inOrder(Node no);
	
	public Node getRoot();

	public int compararKeys(Object elementA,Object elementoB);
	
	public Node insert(Object elemento);
	public Node search(Node no, Object elemento);
	public Object remove(Object elemento);
	
}
