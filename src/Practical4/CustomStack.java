package Practical4;

class ArrayStack{

	private int capacity;
	private int[] arr;
	private int top;
	
	public ArrayStack(int size) {
	capacity = size;
	arr = new int[capacity];
	top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == capacity -1;
	}
	public int count() {
		return top+1;
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack Overflow : Cannot push "+value+" element, Stack Full ");
			return;
		}
		arr[++top] = value;
		System.out.println("Value "+ value + " Pushed into stack");
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow : Cannot Pop, Stack Empty");
			return -1;
		}
		return arr[top--];
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack Is Empty");
			return;
		}
		for(int i=top;i>=0;i--) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	public int peek() {
		if(isEmpty()) {			
			System.out.println("Stack is Empty");
			return -1;
		}
		return arr[top];
	}
	
}
public class CustomStack {

	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~");
		ArrayStack arrayStack = new ArrayStack(5);
		arrayStack.push(10);
		arrayStack.push(20);
		arrayStack.push(30);
		arrayStack.push(40);
		arrayStack.push(50);
		arrayStack.push(60);
		arrayStack.display();
		
		System.out.println("Top element is : "+arrayStack.peek());
		System.out.println("Popped "+arrayStack.pop());
		System.out.println("Popped "+arrayStack.pop());
		arrayStack.display();
		System.out.println("Current Count : "+arrayStack.count());


		while(!arrayStack.isEmpty()) {
			System.out.println("Popped "+arrayStack.pop());
		}
		arrayStack.pop();
	}
	
}
