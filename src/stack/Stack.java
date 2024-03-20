package stack;


public class Stack {
	private int top;
	private Integer[] stack;
	
	public Stack(int capacity) {
		this.top = -1;
		this.stack = new Integer[capacity];
	}
	
	// LIFO
	
	// isEmpty
	public boolean isEmpty() {
		return this.top == -1;
	}
	
	public boolean isFull() {
		return this.top == this.stack.length - 1;
	}
	
	// push
	public void push(int data) {
		if (this.isFull()) {
			throw new RuntimeException("Pilha cheia!");
		}
		this.top++;
		this.stack[this.top] = data;
	}
	
	
	// pop remove last
	public void pop() {
		if (this.isEmpty()) {
			throw new RuntimeException("Pilha vazia!");
		}
		this.top--;
	}
	
	// peek
	public int peek() {
		if (this.isEmpty()) {
			throw new RuntimeException("Pilha vazia!");
		}
		return this.stack[top];
	}
	
}