package ArvoreBinariaBusca;


public class Node {	
	private Object element;
	private Node sonLeft,sonRight,parent;

		
	public Node(Object element) {
			this.element= element;
			this.sonLeft = null;
			this.sonRight = null;
	}

	public Object getElement() {
		return this.element;
	}
		
	public void setElement(int value) {
		this.element = value;
	}
		
	public Node getSonLeft() {
		return this.sonLeft;
	}
	public void setSonLeft(Node sonLeft) {
		this.sonLeft = sonLeft;
	}
		
	public Node getSonRight() {
		return sonRight;
	}
		
	public void setSonRight(Node sonRight) {
		this.sonRight = sonRight;
	}
		
	public Node getParent() {
		return this.parent;
	}
		
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public Node leftChild(Node no) {
		return no.getSonLeft();
	}

	
	public Node rightChild(Node no) {
		return no.getSonRight();
	}

	
	public boolean hasLeft(Node no) {
		return no.getSonLeft()!=null;
	}

	
	public boolean hasRight(Node no) {
		return no.getSonRight()!=null;
	}
}
