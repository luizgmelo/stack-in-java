package stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {


	@Test
	void testPush() {
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		assertFalse(stack.isEmpty());
	}
	
	@Test
	void testPop() {
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		assertTrue(stack.isEmpty());
	}
	
	
	@Test
	void testIsEmpty() {
		Stack stack = new Stack(5);
		assertTrue(stack.isEmpty());
		stack.push(10);
		stack.push(22);
		assertFalse(stack.isEmpty());
		stack.pop();
		stack.pop();
		assertTrue(stack.isEmpty());
	}
	
		
	@Test
	void testIsFull() {
		Stack stack = new Stack(2);
		stack.push(10);
		stack.push(20);
		assertTrue(stack.isFull());
		assertThrows(RuntimeException.class, () -> {
			stack.push(30);
		}, "Pilha cheia!");
	}
	
	@Test
	void testPeek() {
		Stack stack = new Stack(5);
		stack.push(10);
		
		stack.push(20);
		assertEquals(stack.peek(), 20);
		
		stack.push(30);
		assertEquals(stack.peek(), 30);
		
		stack.pop();
		assertEquals(stack.peek(), 20);
		
		stack.pop();
		assertEquals(stack.peek(), 10);
		
	}
	
}
