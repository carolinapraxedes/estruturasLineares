package FilaArray;


public class QueueTest {

	public static void main(String[] args) {
		QueueArray newQueue = new QueueArray(6);
		
		newQueue.Enqueue("0");
		newQueue.Enqueue("1");
		newQueue.Enqueue("2");
		newQueue.Enqueue("3");
		newQueue.Denqueue();
		newQueue.Denqueue();
		newQueue.Denqueue();
		newQueue.Enqueue("4");
		newQueue.Enqueue("5");
		newQueue.Enqueue("6");		
		newQueue.Enqueue("7");
		newQueue.Enqueue("mais um");		
		newQueue.showQueue();
	}
}
