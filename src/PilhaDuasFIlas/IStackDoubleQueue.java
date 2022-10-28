package PilhaDuasFIlas;

public interface IStackDoubleQueue {
	/*Primeira fila*/
	public abstract void EnqueueFirst(Object element);
	public abstract Object DequeueFirst() throws emptyStackDQException;
	public abstract int sizeQueue();
	public abstract boolean isEmptyQueue();
	
	
	/*Segundo fila*/
	public abstract void EnqueueLast(Object element);
	public abstract Object DequeueLast() throws emptyStackDQException;

}
