package com.cdac.core;

import java.util.Scanner;

public class Array {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);

		// Read the count of elements from the user
		System.out.println("Enter the count of elements: ");
		int n = sc.nextInt();

		// Create the array
		int[] arr = new int[n];

		boolean exit = false;
		// Initialize the array using user input
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		while (!exit) {// Display the menu
			System.out.println("Menu:");
			System.out.println("1. Display the array");
			System.out.println("2. Reverse the array");
			System.out.println("3. Replace the nth element from the array and print");
			System.out.println("4. Find the addition of all elements of the array");
			System.out.println("5. Find the maximum number from the array");
			System.out.println("6. Print the average of all the elements from the array");
			System.out.println("7. Display the even and odd number from the array separately");
			System.out.println("0. To exit program");

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			// Call the appropriate function based on the user's choice
			switch (choice) {
			case 1:
				displayArray(arr);
				break;
			case 2:
				reverseArray(arr);
				displayArray(arr);
				break;
			case 3:
				System.out.println("Enter the index of the element to be replaced: ");
				int index = sc.nextInt();
				System.out.println("Enter the new element: ");
				int newValue = sc.nextInt();
				replaceElement(arr, index, newValue);
				displayArray(arr);
				break;
			case 4:
				int sum = findSum(arr);
				System.out.println("The sum of all elements of the array is: " + sum);
				break;
			case 5:
				int max = findMax(arr);
				System.out.println("The maximum element in the array is: " + max);
				break;
			case 6:
				float average = findAverage(arr);
				System.out.println("The average of all elements of the array is: " + average);
				break;
			case 7:
				displayEvenOddNumbers(arr);
				break;
			case 0:
				exit = true;
			}
		}
		sc.close();
	}

	// Function to display the array
	public static void displayArray(int[] arr) {
		System.out.println("The array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Function to reverse the array

	public static void reverseArray(int[] arr)

	{
		int start = 0, end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

// Function to replace the nth element from the array and print
	public static void replaceElement(int[] arr, int index, int newValue) {
		arr[index] = newValue;
	}

// Function to find the addition of all elements of the array
	public static int findSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

// Function to find the maximum number from the array
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

// Function to print the average of all the elements from the array
	public static float findAverage(int[] arr) {
		int sum = findSum(arr);
		float average = (float) sum / arr.length;
		return average;
	}

// Function to display the even and odd number from the array separately
	public static void displayEvenOddNumbers(int[] arr) {
		System.out.println("Even numbers: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

		System.out.println("Odd numbers: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}
