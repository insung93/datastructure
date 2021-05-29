package queue;

public class ArrayQueue implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];

	public ArrayQueue(int queueSize) {
		front = -1;
		rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}
	
	@Override
	public boolean isEmpty() {
		return (front == rear);
	}
	
	@Override
	public boolean isFull() {
		return (rear == this.queueSize-1);
	}
	
	@Override
	public void enQueue(char item) {
		if(isFull()) {
			System.out.println("Enqueue Fail! Array Queue full");
		} else {
			itemArray[++rear] = item;
			System.out.println("Enqueued Item : " + item);
			printQueue();
		}
	}

	@Override
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("Dequeue fail! Array Queue is emplty!!");
			return 0;
		} else {
			return itemArray[++front];
		}

	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Queue is emplty!!");
		} else {
			++front;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail!! Array Queue is empty!!");
			return 0;
		} else {
			return itemArray[front+1];
		}
		
	}

	@Override
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("Array Queue is empty!! \n");
		} else {
			System.out.print("Array Queue >> ");
			for(int i = front +1;i<=rear;i++) {
				System.out.print(itemArray[i]+ "  ");
			}
			System.out.println();
		}
		
	}
}
