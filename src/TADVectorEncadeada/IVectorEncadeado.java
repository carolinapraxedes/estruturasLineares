package TADVectorEncadeada;

import listaDuplamenteEncadeada.noDuplamente;

public interface IVectorEncadeado {
	public Object elemAtRank(noDuplamente noIndice);
	
	public Object replaceAtRank(noDuplamente noIndice, Object elemento);
	
	public Object insertAtRank(noDuplamente noIndice,Object elemento);
	
	public Object removeAtRank(noDuplamente noIndice);
	
	public int size();
	public boolean isEmpty();
}
