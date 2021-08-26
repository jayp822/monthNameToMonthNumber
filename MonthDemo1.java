package MonthAssignment;

/**
   Demo program for the Month Class
   Chapter 9, Programming Challenge 6
 */

import java.util.Scanner;

public class MonthDemo1 {
	public static void main(String[] args) {
		// Scanner kb = new Scanner(System.in);

		// System.out.println("Please enter two numbers in between 1-12);
		// step8: ask the user to enter two numbers, and create two Month objects

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter two numbers in between 1-12\n");

		System.out.println("Enter the first number in between 1-12");
		int num1 = userInput.nextInt();

		System.out.println("Enter the second number in between 1-12");
		int num2 = userInput.nextInt();

		Month monthOne = new Month(num1);
		Month monthTwo = new Month(num2);

		// step9: Call equal method to compare the two objects to see whether they
		// contain the same month or not.

		if (monthOne.equals(monthTwo))
			System.out.println("same\n");
		else
			System.out.println("not same\n");

		// step10: Call the greaterThan method to compare the above two objects

		if (monthOne.greaterThan(monthTwo)) {
			System.out.println("month one is greater than month two");
		} else if (monthOne.equals(monthTwo)) {
			System.out.println("month one and month two are the same");
		} else {
			System.out.println("month one is less than month two");
		}

	}
}
