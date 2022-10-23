package FilaArray;

public class QueueTest {

	public static void main(String[] args) {
		QueueArray newQueue = new QueueArray(6);
		
		newQueue.Enqueue("teste");
		newQueue.Enqueue("teste sara");
		
		newQueue.Enqueue("arnold teste");
		newQueue.Enqueue("blabla");
		
		newQueue.Denqueue();
		newQueue.Denqueue();
		newQueue.Denqueue();
		newQueue.Denqueue();
			
		
		newQueue.Enqueue("blabla");
		newQueue.showQueue();
	}

}
