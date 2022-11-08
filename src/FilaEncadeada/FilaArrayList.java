package FilaEncadeada;

import java.util.ArrayList;


public class FilaArrayList implements IFilaArrayList{
	ArrayList<Object> FilaAL;
	int start=0;

	
	public FilaArrayList() {
		FilaAL = new ArrayList<>();
	}

	@Override
	public void search(Object element) {
		int searchResult =this.FilaAL.indexOf(element);
		if(searchResult != -1){
			System.out.println("Elemento encontrado no índice: "+searchResult);
		}else {
			System.out.println("Elemento não encontrado no índice: "+searchResult);
		}
		
	}

	@Override
	public int size() {
		return FilaAL.size();
	}

	@Override
	public boolean isEmpty() {
		return FilaAL.isEmpty();
	}

	@Override
	public void Enqueue(Object element) {

			FilaAL.add(element);		
		
	}

	@Override
	public Object Denqueue() throws emptyQueueException {
		if(isEmpty()) {
			throw new emptyQueueException("Fila Vazia");
		}
		FilaAL.remove(start);
		
		return FilaAL;
	}
	
	public String toString() {
		String saida = "";
		for(Object element: this.FilaAL) {
			saida+=String.format("[%s]", element);
		}

		return saida;
	}

}
