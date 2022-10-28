package PilhaDuasFIlas;

import FilaArray.emptyQueueException;

public class StackDoubleQueue implements IStackDoubleQueue {
	
	int sizeArray;
	int start=0;
	int end=0;	
	Object StackDB[];
	
	
	public StackDoubleQueue(int sizeArray) {
		this.StackDB = new Object[sizeArray];
		this.sizeArray = sizeArray;
	}

/*=========================================
 *  STACK FIRST
 * */
	
	public void EnqueueFirst(Object element) {
		//enfileirar
		if(sizeQueue() == sizeArray-1) {
			throw new emptyStackDQException("Pilha vazia");
		}
		this.StackDB[end] = element;
		end = (end+1) % sizeArray;
	}


	public Object DequeueFirst() throws emptyStackDQException {
		//desenfileirar
		if(isEmptyQueue()) {
			throw new emptyStackDQException("Pilha vazia");
		}

		StackDB[start]=null;
		start =(start +1 )%sizeArray;
		return StackDB;
	}


	public int sizeQueue() {
		return (sizeArray - start + end) % sizeArray;
	}


	public boolean isEmptyQueue() {
		return (start==end);
		
	}
	
	
	/*=========================================
	 * STACK LAST
	 * */


	public void EnqueueLast(Object element) {
		// TODO Auto-generated method stub
		
	}


	public Object DequeueLast() throws emptyStackDQException {
		// TODO Auto-generated method stub
		return null;
	}

/*========================================
 * SHOW STACK WITH DOUBLE QUEUE
 * */
	
	public void showStackDoubleQueue() {
		
		for(int i=0;i< this.StackDB.length;i++) {			
			System.out.print("["+ StackDB[i] +"]");
			
		}
	}

}
