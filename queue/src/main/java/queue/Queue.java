package queue;

public interface Queue {
	boolean isEmpty();
	boolean isFull();
	void enQueue(char item);
	char deQueue();
	void delete();
	char peek();
	void printQueue();
}
