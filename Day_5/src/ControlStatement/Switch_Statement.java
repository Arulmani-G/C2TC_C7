package ControlStatement;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		System.out.println();
		switch(num) {
		case 1:
			System.out.println("number is one");
			break;
		case 2:
			System.out.println("number is two");
			break;
		case 3:
			System.out.println("number is three");
			break;
		default:
			System.out.println("greater number");
			break;
		}
	}

}
