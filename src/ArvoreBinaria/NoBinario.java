package ArvoreBinaria;



public class NoBinario {
	private int element;
	private NoBinario sonLeft,sonRight,parent;

	
	public NoBinario(int element, NoBinario parent) {
		this.element= element;
		this.parent = parent;
		this.sonLeft = null;
		this.sonRight = null;
	}


	public int getElement() {
		return this.element;
	}
	
	public void setElement(int value) {
		this.element = value;
	}
	
	public NoBinario getSonLeft() {
		return this.sonLeft;
	}
	public void setSonLeft(NoBinario sonLeft) {
		this.sonLeft = sonLeft;
	}
	
	public NoBinario getSonRight() {
		return sonRight;
	}
	
	public void setSonRight(NoBinario sonRight) {
		this.sonRight = sonRight;
	}
	
	public NoBinario getParent() {
		return this.parent;
	}
	
	public void setParent(NoBinario parent) {
		this.parent = parent;
	}





	

	
}
