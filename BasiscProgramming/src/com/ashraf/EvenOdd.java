package com.ashraf;

import java.util.Scanner;

public class EvenOdd {

	public static String EvenOddFunction(int num) {
		if (num > 0) {
			if (num % 2 == 0)
				return "true";
			else
				return "false";
		} else
			return "invalid";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(EvenOddFunction(sc.nextInt()));

	}

}
