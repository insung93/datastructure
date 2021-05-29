package queue;

public class ArrayQueueTest {

	public static void main(String[] args) {

		int queueSize = 5;
		ArrayQueue queue = new ArrayQueue(queueSize);
		
		queue.enQueue('A');
		queue.enQueue('B');
		
		queue.deQueue();
		queue.printQueue();
		
		queue.enQueue('C');
		
		queue.deQueue();
		queue.printQueue();
		
		queue.deQueue();
		queue.printQueue();
		
		queue.deQueue();
		
	}

}
