package com.linecomparison;

import java.util.*;

public class LineComparison1 {
	public void length() {
		Scanner sc = new Scanner(System.in);
		/*
		 * Taking user input of coordinates of the Line
		 */
		System.out.println("Please enter x1");
		int x1 = sc.nextInt();

		System.out.println("Please enter y1");
		int y1 = sc.nextInt();

		System.out.println("Please enter x2");
		int x2 = sc.nextInt();

		System.out.println("Please enter y2");
		int y2 = sc.nextInt();
		/*
		 * calculating Length of the line using coordinates
		 * Displaying Length of the line
		 */
		int LengthOfLine = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("The length of the line is " + LengthOfLine);
		sc.close();
	}

	public static void main(String[] args) {
		LineComparison1 lc1 = new LineComparison1();
		lc1.length();//calling method
	}

}
