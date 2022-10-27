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
			this.aumentarTamanho();
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
		start =(start +1 )%sizeArray;
		return QueueElements;
	}


	public int sizeQueue() {		
		return (sizeArray - start + end) % sizeArray;
	}

	public boolean isEmptyQueue() {
		return (start==end);
	}
	
	public void aumentarTamanho() {
		int newSize = this.QueueElements.length*2;
		
		Object newQueueElements[]= new Object[newSize];
		//atualizando a posição do end no novo array
		this.end = QueueElements.length-1;
		sizeArray=newSize;
		
		int temp = start;
		for(int i=0;i<this.end;i++) {
			newQueueElements[i]=this.QueueElements[temp];
			temp =(temp+1) % QueueElements.length;
		}
		this.start=0;
		this.QueueElements=newQueueElements;
	

		
	}
	
	public void showQueue() {
		
		for(int i=0;i< this.QueueElements.length;i++) {			
			System.out.print("["+ QueueElements[i] +"]");
			
		}
	}



}


