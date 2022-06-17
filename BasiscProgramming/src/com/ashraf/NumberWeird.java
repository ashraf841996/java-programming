package com.ashraf;
/*
 Given an integer n, perform the following conditional actions,
If n is odd, print weird,
If n is even and in the inclusive range of 2 to 5, print not weird,
If n is even and in the inclusive range 6 to 20, print weird,
If n is even and greater than 20, print not weird.

Input Format

An integer value from the user.

Constraints

1<=n<=100

Output Format

Weird or Not Weird

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

4
Sample Output 1

Not Weird
Sample Input 2

50
Sample Output 2

Not Weird 
 */

import java.util.Scanner;

public class NumberWeird {

	public static String WeirdFunction(int num) {

		if (1 <= num && num <= 100) {
			if (num % 2 == 0 && num >= 2 && num <= 5)
				return "Not Weird";
			else if (num % 2 == 0 && num >= 6 && num <= 20)
				return "Weird";
			else if (num % 2 == 0 && num >= 20)
				return "Not Weird";
			else
				return "Weird";
		} else
			return "Invalid";

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(WeirdFunction(sc.nextInt()));
	}

}
