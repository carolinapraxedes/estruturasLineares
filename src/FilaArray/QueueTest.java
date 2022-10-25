package FilaArray;

public class QueueTest {

	public static void main(String[] args) {
		QueueArray newQueue = new QueueArray(6);
		
		newQueue.Enqueue("teste");
		newQueue.Enqueue("teste sara");
		newQueue.Enqueue("teste guigui");
		newQueue.Denqueue();
		newQueue.Denqueue();
		newQueue.Denqueue();
		newQueue.Enqueue("teste guigui");
		newQueue.Enqueue("teste guigui");
		newQueue.Enqueue("teste guigui");
		newQueue.Enqueue("teste guigui");
		newQueue.Enqueue("teste guigui5");
		newQueue.Enqueue("teste jero");
		newQueue.Enqueue("teste mis");

		

				
			

		newQueue.showQueue();
	}

}
