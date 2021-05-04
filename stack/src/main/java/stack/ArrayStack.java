package stack;

public class ArrayStack implements Stack {
	private int top;
	private int stackSize;
	private char[] itemArray;
	
	public ArrayStack(int stackSize) {
		top=-1;
		this.stackSize=stackSize;
		itemArray = new char[this.stackSize];
	}
	
	@Override
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (top==this.stackSize-1);
	}

	@Override
	public void push(char item) {
		if(isFull()) {
			System.out.println("Push Fail! Array Stack is full!");
		}
		else {
			itemArray[++top]=item;
			System.out.println("Inserted Item : " + item);
		}
	}

	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println("Pop Fail! Array Stack is empty!");
			return 0;
		}
		else {
			return itemArray[top--];
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public char peek() {	
		if(isEmpty()) {
			System.out.println("Peek Fail! Array Stack is Empty");
			return 0;
		}
		else {
			return itemArray[top];
		}
		
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Array Stack is Empty");
		}
		else {
			System.out.println("Array Stack >>");
			for(int i =0; i<= top; i++) {
				System.out.println("Array Stack["+i+"] - "+itemArray[i]);
			}
		}
	}

}
