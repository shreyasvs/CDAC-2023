package com.cdac.core;

public class CircularQ {
	private int front;
	private int rear;
	private int size;
	private int[] queue;

	public CircularQ(int size) {
		front = rear = -1;
		this.size=size;
		queue = new int[size];
	}

	public boolean isFull() {
		if ((rear + 1) % size == front) {
			System.out.println("Queue is full!!");
			return true;
		} else {
			System.out.println("Queue is not full!!");
			return false;
		}
	}

	public void enqueue(int ele) {
		if (isFull()) {
			System.out.println("Queue is full!!");
			return;
		}
		rear = (rear + 1) % size;
		queue[rear] = ele;
		if (front == -1)
			front = rear;
	}

	public boolean isEmpty() {
		if (front == rear) {
			System.out.println("Queue is empty!!");
			return true;
		} else {
			System.out.println("Queue is not empty!!");
			return false;
		}

	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!!");
			return 0;
		}
		int ele = queue[front];
		front = (front + 1) % size;
		return ele;
	}

	public void display() {
		for (int i = front; i <= rear; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
}
