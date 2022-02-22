package com.linecomparison;

import java.util.Scanner;

class Line {
	public static int getLength(Scanner c) {
		/*
		 * Taking user input of coordinates of the Line
		 */
		System.out.println("Please enter x1");
		int x1 = c.nextInt();

		System.out.println("Please enter y1");
		int y1 = c.nextInt();

		System.out.println("Please enter x2");
		int x2 = c.nextInt();

		System.out.println("Please enter y2");
		int y2 = c.nextInt();
		/*
		 * calculating Length of the line using coordinates Displaying Length of the
		 * line
		 */
		int LengthOfLine = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return LengthOfLine;
	}
	public static void comparison() {
		Scanner c = new Scanner(System.in);
		/*
		 * Taking two length of the lines from coordinates Calling from previous(Static
		 * method) of length of line
		 */
		System.out.println("Please enter values for line 1");
		int lengthline1 = getLength(c);
		System.out.println("Please enter values for line 2");
		int lengthline2 = getLength(c);
		String Line1 = String.valueOf(lengthline1);
		String Line2 = String.valueOf(lengthline2);
		c.close();
		/*
		 * Comparing two lines are equal or not
		 */
		System.out.println("The length of the two line: ");
		if (Line1.equals(Line2))
			System.out.println("Both lines are equal");
		else
			System.out.println("Both lines are equal");

	}
}



public class LineComparison2 {

	public static void main(String[] args) {

		Line lc = new Line();
		lc.comparison();// calling method

	}

}
