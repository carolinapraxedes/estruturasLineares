package PilhaDuasFIlas;



public class StackDoubleQueueTest {

	public static void main(String[] args) {
		StackDoubleQueue newStack = new StackDoubleQueue(6);
				
			newStack.EnqueueFirst("0");
			newStack.EnqueueFirst("1");
			newStack.EnqueueFirst("2");
			newStack.DequeueFirst();
			newStack.DequeueFirst();
			
			newStack.showStackDoubleQueue();

	}

}
