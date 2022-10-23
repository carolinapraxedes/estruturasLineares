package FilaArray;

public interface IQueue {
	public abstract void Enqueue(Object element);
	public abstract Object Denqueue() throws emptyQueueException;
	public abstract int sizeQueue();
	public abstract boolean isEmptyQueue();

	
}
