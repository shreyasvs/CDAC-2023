package tester;

import java.util.Scanner;

import com.cdac.core.Queue;

public class Queue_Implementation {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter queue size:\n");
			int size = sc.nextInt();
			Queue q = new Queue(size);
			boolean exit = false;
			while (!exit) {
				System.out.println("Enter your choice:\n" + "1.Add element\n" + "2.Remove element\n"
						+ "3.Check if queue is empty\n" + "4.Check if queue is full\n" + "5.Display all elements\n"
						+ "0.exit\n");
				try {
					switch (sc.nextInt()) {
					case 1:
						for (int i = 0; i < size; i++) {
							System.out.println("Enter element to add:\n");
							q.enqueue(sc.nextInt());
							System.out.println("Element added successfully!");
						}
						break;
					case 2:
						q.dequeue();
						System.out.println("Element removed successfully!");
						break;
					case 3:
						if (q.isEmpty() == true)
							System.out.println("Queue is empty!!");
						else
							System.out.println("Queue is not empty!!");

						break;
					case 4:
						if (q.isFull() == true)
							System.out.println("Queue is full!!");
						else
							System.out.println("Queue is not full!!");
						break;
					case 5:
						q.display();
						break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}
	}

}
