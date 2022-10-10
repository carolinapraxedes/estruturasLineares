package PilhaBlackRed;



public interface PilhaBR {	   
	    public int sizeBlack();
	    public boolean isEmptyBlack();
	    public Object posicaotTopBlack() throws PilhaBlackEnception;
	    public void pushBlack(Object elementoBlack);
	    public Object popBlack() throws PilhaBlackEnception;
	    
	    
	    public int sizeRed();	    
	    public boolean isEmptyRed();
	    public Object posicaoTopRed() throws PilhaRedException;
	    public void pushRed(Object elementoRed);
	    public Object popRed() throws PilhaRedException;
	
}
