package ArvoreBinariaBusca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import ArvoreGenerica.No;


public class ArvoreBinariaBusca implements IArvoreBinariaBusca{
	protected Node root;
	protected int size;
	protected ArrayList<Node> tree;
	protected Comparator<Object> comparatorKeys;
	private ArrayList<Node> elements = new ArrayList<Node>();
	
	
	
	public ArvoreBinariaBusca() {
		this.root=null;
		this.size = 0;
		
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}


	@Override
	public int height(Node no) {
		if(no == null) {
			return -1;
		}
		int sonLeftNo = height(no.getSonLeft());
		int sonRightNo = height(no.getSonRight());
		
		if(sonLeftNo > sonRightNo) {
			return sonLeftNo + 1;
		}else {
			return sonRightNo +1;
		}

	}

	@Override
	public int depth(Node no) {
		if(no == root) {
			return 0;
		}
		return 1 + (depth(no.getParent()));
	}


	@Override
	public boolean isInternal(Node no) {
		return no.getSonRight() != null && no.getSonLeft()==null;
	}

	@Override
	public boolean isExternal(Node no) {
		return no.getSonRight() == null || no.getSonLeft()==null;
	}

	@Override
	public void inOrder(Node no) {
		if(isInternal(no)) {
			if(no.hasLeft(no)) {
				inOrder(no.getSonLeft());
			}
									
		}System.out.println(no.getElement());
		if(isInternal(no)) {
			if(no.hasRight(no)) {
				inOrder(no.getSonRight());
			}
		}
	}

	@Override
	public Node getRoot() {
		return root;
	}


	public boolean isSonRight(Node no) {
		int comparar = compararKeys(no.getElement(),no.getParent().getElement());
		//A > B
		if(no.getParent()==null) {
			return false;
		}
			return comparar == 1;		
	}

	@Override
	public Node insert(Object elemento) {
		Node noPesquisa = search(root,elemento);
		
		
		if(noPesquisa.getElement() == elemento) {
			System.out.println("deu ruim");			
		}else {
			Node novoNo = new Node(elemento);
			novoNo.setParent(noPesquisa);
			if(isSonRight(novoNo)) {
				noPesquisa.setSonLeft(noPesquisa);
			}else {
				noPesquisa.setSonRight(noPesquisa);
			}	
			size++;
			return novoNo;
		}return null;				
	}

	
	@Override
	public int compararKeys(Object elementA, Object elementoB) {
		return comparatorKeys.compare(elementA, elementoB);
	}
	
	// se a A < B, o método retorna um número negativo,"-1"
    // se a A==B, o método retorna "0"
    // se a A > B, o método retorna um número positivo,"1"

	@Override
	public Node search(Node no, Object elemento) {		
		if(root == null) {
			root = new Node(elemento);
			return root;
		}
		int comparar = compararKeys(elemento,root.getElement());
		if(comparar < 0) {
			//o elemento A é menor que o elemento B
			return search(no.getSonLeft(),elemento);
		}else if(comparar==0) {
			//os elementos sao iguais
			return no;
		}else {
			//o elemento A é maior que o elemento B
			return search(no.getSonRight(),elemento);
		}		
	}

	@Override
	public Object remove(Object elemento) {

		return null;
	}				
}