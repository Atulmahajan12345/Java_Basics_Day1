package com.bridgelabz;

import java.util.Scanner;

public class CommandLineSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number");
		int num2 = sc.nextInt();
		int num3 = num1 + num2;
		System.out.println("addition of two number:" + num3);
		sc.close();

	}

}
