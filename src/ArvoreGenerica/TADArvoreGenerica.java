package ArvoreGenerica;

import java.lang.Iterable;
import java.math.*;
import java.util.ArrayList;
import java.util.Iterator;
import listaDuplamenteEncadeada.noDuplamente;

public class TADArvoreGenerica {
	No root;
	int size = 0;
	private ArrayList<No> elements = new ArrayList<No>();

	public TADArvoreGenerica(Object element) {
		root = new No(null, element);
		size = 1;
	}

	public No root() {
		return root;
	}

	public No parent(No desejado) {
//retorna o pai do no desejado
		return desejado.getParent();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Iterator elements() {
		return mostraArvore();
		
	}

	public ArrayList<No> nos() {
        ArrayList<No> Nos = new ArrayList<>();
        // vai pra o método noRecursivo com os parâmetros (raiz e o array)
        noRecursivo(root, Nos);
        return Nos;
	}
	
    private void noRecursivo(No node, ArrayList<No> Nos) {
        // adiciona o "node" (no caso raiz) para o array para poder fazer o loop
        Nos.add(node);
        // mesmo loop de iterator
        for (Iterator<Object> it = children(node); it.hasNext(); ) {
            Object filho = it.next();
            No noFilho = (No) filho;
            noRecursivo(noFilho, Nos);
        }
    }
    
    public Iterator<Object> mostraArvore(){
        mostraArvoreRecursivo(root, 0);
        return null;
    }
    
    private void mostraArvoreRecursivo(No node, int depth){
        for (int i = 0; i < depth; i++) {
            System.out.print("  ↳ ");
        }
        System.out.println(node.getElement());
        // 'loop' para percorrer os filhos
        for (Iterator<Object> it = children(node); it.hasNext(); ) {
            Object filho = it.next();
            No noFilho = (No) filho;
            mostraArvoreRecursivo(noFilho, depth + 1);}
        }

	public Iterator children(No desejado) {
		//retorna os filhos do no desejado
		return desejado.children();
	}

	public boolean isInternal(No desejado) {
		return desejado.childrenNumber() > 0;
	}

	public boolean isExternal(No desejado) {
		return desejado.childrenNumber() == 0;
	}

	public boolean isRoot(No desejado) {
		return desejado == root;
	}

	public int height(No desejado) {
		if (isExternal(desejado)) {
			return 0;
		}
		int h = 0;
		for (int i = 0; i < ((ArrayList) children(desejado)).size(); i++) {
			h = Math.max(h, height((No) ((ArrayList) children(desejado)).get(i)));
		}
		return 1 + h;
	}

	public int depth(No desejado) {
		if (desejado == root) {
			return 0;
		}
		return 1 + depth(parent(desejado.getParent()));
	}

	public Object replace(No desejado, Object elemento) {
		No noRepassado = new No(desejado, elemento);
		desejado.setElement(elemento);
		return noRepassado;
	}

	public No addChild(No parent, Object element) {
		No novoNo = new No(parent, element);
		parent.addChild(novoNo);
		size++;
		return novoNo;
	}

	public Object remove(No desejado) throws ArvoreVaziaException {
		No parent = desejado.getParent();
		if (parent != null || isExternal(desejado)) {
			parent.removeChild(desejado);
		} else {
			throw new ArvoreVaziaException();
		}
		Object removido = desejado.getElement();
		size--;
		return removido;
	}
}
