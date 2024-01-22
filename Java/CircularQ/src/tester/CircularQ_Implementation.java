package tester;

import java.util.Scanner;

import com.cdac.core.CircularQ;

public class CircularQ_Implementation {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter queue size:\n");
			CircularQ q = new CircularQ(sc.nextInt());
			boolean exit = false;
			while (!exit) {
				System.out.println("Enter your choice:\n" + "1.Add element\n" + "2.Remove element\n"
						+ "3.Check if queue is empty\n" + "4.Check if queue is full\n" + "5.Display all elements\n"
						+ "0.exit\n");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter element to add:\n");
						q.enqueue(sc.nextInt());
						System.out.println("Element added successfully!");
						break;
					case 2:
						q.dequeue();
						System.out.println("Element removed successfully!");
						break;
					case 3:
						q.isEmpty();
						break;
					case 4:
						q.isFull();
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
