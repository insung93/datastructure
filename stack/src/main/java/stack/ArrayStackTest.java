package stack;


public class ArrayStackTest {

	public static void main(String[] args) {
		int stackSize = 5;
		ArrayStack as = new ArrayStack(stackSize);
		
		as.push('A');
		as.printStack();
		
		as.push('C');
		as.printStack();
		
		as.push('B');
		as.printStack();
		
		as.pop();
		as.printStack();
	}

}
