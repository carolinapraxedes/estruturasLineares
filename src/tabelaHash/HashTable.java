package tabelaHash;

public class HashTable {

	    private int size;
	    private int[] keys;
	    private int[] values;
	    private boolean[] isOccupied;
	    private int count;

	    public HashTable(int size) {
	        this.size = size;
	        this.keys = new int[size];
	        this.values = new int[size];
	        this.isOccupied = new boolean[size];
	    }
	    
	    public int size(){
	        return count;
	    }
	    
	    public boolean isEmpty() {
	        int count = 0;
	        for (int i = 0; i < size; i++) {
	            if (isOccupied[i]) {
	                count++;
	            }
	        }
	        return count == 0;
	    }


	    private int linearProbing(int key) {
	        return key % size;
	    }

	    private int hashDuplo(int key) {
	        return 7 - (key % 7);
	    }

	    public void insertElement(int key, int value) {
	        int index = linearProbing(key);
	        int step = hashDuplo(key);

	        while (isOccupied[index]) {
	            index = (index + step) % size;
	        }

	        keys[index] = key;
	        values[index] = value;
	        isOccupied[index] = true;
	        count++;
	    }

	    public int findElement(int key) {
	        int index = linearProbing(key);
	        int step = hashDuplo(key);

	        while (isOccupied[index]) {
	            if (keys[index] == key) {
	                return values[index];
	            }
	            index = (index + step) % size;
	        }

	        return -1;
	    }

	    public void remove(int key) {
	        int index = linearProbing(key);
	        int step = hashDuplo(key);

	        while (isOccupied[index]) {
	            if (keys[index] == key) {
	                isOccupied[index] = false;
	                count--;
	                break;
	            }
	            index = (index + step) % size;
	        }
	    }
	    
	    public void print() {
	        for (int i = 0; i < size; i++) {
	            if (isOccupied[i]) {
	                System.out.println("Key: " + keys[i] + ", Value: " + values[i]);
	            }
	        }
	    }


}
