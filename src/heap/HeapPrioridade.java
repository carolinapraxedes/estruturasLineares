package heap;

public class HeapPrioridade {
	private int[] Heap;
	private int size;
	private int maxSize;
	
	public HeapPrioridade(int maxSize) {
		this.size = 0;
		this.maxSize=maxSize;
		Heap = new int[this.maxSize+1];
		
	}
	
	private int parent(int pos) { return pos / 2; }
	
	private void swap(int fpos, int spos)
    {
 
        int tmp;
        tmp = Heap[fpos];
 
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
	
	  public void insert(int element)
	    {
	 
	        if (size >= maxSize) {
	            return;
	        }
	 
	        Heap[++size] = element;
	        int current = size;
	 
	        while (Heap[current] < Heap[parent(current)]) {
	            swap(current, parent(current));
	            current = parent(current);
	        }
	    }
	
	    public void print()
	    {
	        for (int i = 1; i <= size / 2; i++) {
	 
	            // Printing the parent and both childrens
	            System.out.print(
	                " PARENT : " + Heap[i]
	                + " LEFT CHILD : " + Heap[2 * i]
	                + " RIGHT CHILD :" + Heap[2 * i + 1]);
	 
	            // By here new line is required
	            System.out.println();
	        }
	    }
}

