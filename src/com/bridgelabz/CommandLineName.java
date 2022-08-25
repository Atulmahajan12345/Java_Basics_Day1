package com.bridgelabz;

import java.util.Scanner;

public class CommandLineName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String st = sc.nextLine();
		System.out.println("your name is " + st);
		sc.close();
	}

}
