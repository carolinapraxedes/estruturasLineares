package TADVectorEncadeada;

public interface IVetorArray {
	public Object elemAtRank(Integer indice);
	
	public Object replaceAtRank(Integer indice, Object elemento);
	
	public void insertAtRank(Integer indice,Object elemento);
	
	public Object removeAtRank(Integer indice);
	
	public int size();
	public boolean isEmpty();
}
