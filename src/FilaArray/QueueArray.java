package FilaArray;

public class QueueArray implements IQueue{
	int sizeArray;
	int start=0;
	int end=0;
	
	 Object QueueElements[];
	
	
	public QueueArray(int sizeArray) {
		this.QueueElements = new Object[sizeArray];
		this.sizeArray = sizeArray;
	}

	public void Enqueue(Object element) {
		// enfileirar
		if(sizeQueue() == sizeArray-1) {
			throw new fullQueueException("Fila Cheia");
		}
		this.QueueElements[end] = element;
		end = (end+1) % sizeArray;
		
	}


	public Object Denqueue() throws emptyQueueException {
		//desenfileirar
		if(isEmptyQueue()) {
			throw new emptyQueueException("Fila vazia");
		}

		QueueElements[start]=null;
		start +=1;
		return QueueElements;
	}


	public int sizeQueue() {		
		return (sizeArray - start + end) % sizeArray;
	}

	public boolean isEmptyQueue() {
		return (start==end);
	}
	
	public void showQueue() {
		
		for(int i=0;i< this.QueueElements.length;i++) {			
			System.out.print("["+ QueueElements[i] +"]");
			
		}
	}



}
