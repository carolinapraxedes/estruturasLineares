package FilaEncadeada;

import FilaArray.emptyQueueException;

public interface IFilaArrayList {
	public abstract void search(Object element);
	public abstract int size();
	public abstract boolean isEmpty();
	public abstract void Enqueue(Object element);
	public abstract Object Denqueue() throws emptyQueueException;
	
}
