package com.cdac.core;

public class Stacks {
	private int top;
	private int[] stack;

	public Stacks(int size) {
		top = -1;
		stack = new int[size];
	}

	public boolean isFull() {
		if (top == stack.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int ele) {
		if (isFull()) {
			System.out.println("Stack is full!!");
		} else {
			top++;
			stack[top] = ele;
		}
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public int pop() {
		int x = -1;
		if (isEmpty()) {
			System.out.println("Stack is empty!!");
		} else {
			x = stack[top];
			top--;
		}
		return x;
	}

	public int peek(int pos) {
		int x = -1;
		if (top - pos + 1 < 0)
			System.out.println("Invalid position!!");
		else
			x = stack[top - pos + 1];
		return x;
	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
}
