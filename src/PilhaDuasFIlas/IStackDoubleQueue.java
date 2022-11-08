package PilhaDuasFIlas;

public interface IStackDoubleQueue {
	public abstract int sizeQueue();
	public abstract boolean isEmptyQueue();
	
	/*Primeira fila*/
	public abstract void EnqueueFirst(Object element);
	public abstract Object DequeueFirst() throws emptyStackDQException;
	
	
	
	/*Segundo fila*/
	public abstract void EnqueueLast(Object element);
	public abstract Object DequeueLast() throws emptyStackDQException;

}
