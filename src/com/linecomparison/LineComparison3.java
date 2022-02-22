package com.linecomparison;

import java.util.Scanner;
import java.lang.Math;

public class LineComparison3 {
	public static int getLine(Scanner c) {
		/*
		 * Taking user input of coordinates of the Line
		 */
		System.out.println("Enter x1 Value");
		int x1 = c.nextInt();

		System.out.println("Enter y1 Value");
		int y1 = c.nextInt();

		System.out.println("Enter x2 Value");
		int x2 = c.nextInt();

		System.out.println("Enter y2 Value");
		int y2 = c.nextInt();
		/*
		 * calculating Length of the line using coordinates Displaying Length of the
		 * line
		 */
		int output1 = (int) Math.pow((x2 - x1), 2);
		int output2 = (int) Math.pow((y2 - y1), 2);
		int Lengthofline = (int) Math.sqrt(output1 + output2);

		return Lengthofline;
	}

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Please enter Line1 values");
		int Line1 = getLine(c);
		System.out.println("Please enter Line2 values");
		int Line2 = getLine(c);
		/*
		 * Comparing two lines are equal or largest or smallest
		 */
		System.out.println("The length of the two line: ");
		if (Line1 != Line2)
			if (Line1 < Line2)
				System.out.println("The line2 is greater than line1");

			else
				System.out.println("The line2 is smaller than line1");

		else
			System.out.println("Both lines are equal");

		c.close();
	}

}
