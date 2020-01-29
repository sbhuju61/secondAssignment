package com.ss.second;

import java.util.Scanner;

public class App {

	public void commandLineAddition() {
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		int count = 0;

		try {
			System.out.print("How many numbers would you like to add? ");
			count = scanner.nextInt();
			System.out.println();
			for (int i = 1; i <= count; i++) {

				System.out.print("Enter \'" + i + "\' number: ");
				sum += scanner.nextInt();

			}
			System.out.println("\nSum: " + sum);
		} catch (Exception e) {
			System.err.println("\nInvalid Input: " + scanner.nextLine());
		}

		scanner.close();

	}

	public void max2DArray(int int2DArray[][]) {
		int max = Integer.MIN_VALUE;
		int x = 0, y = 0;
		for (int i = 0; i < int2DArray.length; i++) {
			for (int j = 0; j < int2DArray[i].length; j++) {
				if (int2DArray[i][j] > max) {
					max = int2DArray[i][j];
					x = i;
					y = j;
				}

			}

		}
		System.out.println("Max value: " + max + " i: " + x + " j: " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App second = new App();
		// second.commandLineAddition();
		int int2DArray[][] = { { 1, 297, 3 }, { 5, 84, 3 } };
		second.max2DArray(int2DArray);

		Rectangle rect = new Rectangle(5.0, 4.0);
		System.out.println(rect.calculateArea());
	}

}
