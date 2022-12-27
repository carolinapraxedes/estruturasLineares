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
// TODO Auto-generated method stub
		return null;
	}

	public Iterator nos() {
// TODO Auto-generated method stub
		return null;
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
