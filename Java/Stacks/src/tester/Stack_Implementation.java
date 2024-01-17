package tester;

import java.util.Scanner;

import com.cdac.core.Stacks;

public class Stack_Implementation {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter stack size:\n");
			int size = sc.nextInt();
			Stacks s = new Stacks(size);
			boolean exit = false;
			while (!exit) {
				System.out.println("Enter your choice:\n" + "1.Push element\n" + "2.Pop element\n"
						+ "3.Check if stack is empty\n" + "4.Check if stack is full\n"
						+ "5.Search element at given position\n" + "6.Display all elements\n" + "0.exit\n");
				try {
					switch (sc.nextInt()) {
					case 1:
						for (int i = 0; i < size; i++) {
							System.out.println("Enter element to push:\n");
							s.push(sc.nextInt());
							System.out.println("Element pushed successfully!");
						}
						break;
					case 2:
						s.pop();
						System.out.println("Element popped successfully!");
						break;
					case 3:
						if (s.isEmpty() == true)
							System.out.println("Stack is empty!!");
						else
							System.out.println("Stack is not empty!!");
						break;
					case 4:
						if (s.isFull() == true)
							System.out.println("Stack is full!!");
						else
							System.out.println("Stack is not full!!");
						break;
					case 5:
						System.out.println("Enter a position:\n");
						int x = s.peek(sc.nextInt());
						System.out.println(x);
						break;
					case 6:
						s.display();
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
