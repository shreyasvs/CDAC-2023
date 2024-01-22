package com.cdac.core;

public class Queue {
	private int front;
	private int rear;
	private int[] queue;

	public Queue(int capacity) {
		front = rear = 0;
		queue = new int[capacity];
	}

	public boolean isFull() {
		if (rear == queue.length) {
			return true;
		} else {
			return false;
		}
	}

	public void enqueue(int ele) {
		if (isFull()) {
			System.out.println("Queue is full!!");
			return;
		}
		queue[rear] = ele;
		rear++;
	}

	public boolean isEmpty() {
		if (front == rear) {
			return true;
		} else {
			return false;
		}

	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!!");
			return 0;
		}
		int ele = queue[front];
		front++;
		return ele;
	}

	public void display() {
		for (int i = front; i < rear; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
}
