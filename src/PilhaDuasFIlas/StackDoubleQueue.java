package PilhaDuasFIlas;


public class StackDoubleQueue implements IStackDoubleQueue {
	
	int sizeArray;
	
	int start=0;
	int end=0;
	
	int endF;
	int endL=0;

	
	Object StackDB[];
	
	
	public StackDoubleQueue(int sizeArray) {
		this.StackDB = new Object[sizeArray];
		this.sizeArray = sizeArray;
		this.endL=-1;

	}
	
	public int sizeQueue() {
		return (sizeArray - start + end) % sizeArray;
	}
	


	public boolean isEmptyQueue() {
		
		//verifico se o inicio esta na mesmo lugar do final da segunda fila 
		return (start==endL);
		
	}
	/*============================================================
	 * Primeira fila
	 * */

	
	@Override
	public Object EnqueueFirst(Object element) {
		// enfileirar
		
		if(sizeQueue() == sizeArray-1) {
			System.out.println("ta cheiA");
		}
		Object temp = StackDB[endF];
		this.StackDB[endF] = element;
		this.endF= this.endF+1;
		
		
	}
		
	
	
	@Override
	public Object DequeueFirst() throws emptyStackDQException {
		//desenfileirar
		if(isEmptyQueue()) {
			throw new emptyStackDQException("Fila vazia");
		}

		StackDB[endF]=null;
		this.endF= this.endF-1;
		return StackDB;
	}
	
	
	/*============================================================
	 * Segunda fila
	 * */
	
	@Override
	public void EnqueueLast(Object element) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
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
