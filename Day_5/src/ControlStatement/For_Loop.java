package ControlStatement;

import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		System.out.println();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		String [] a = {"I ","LOVE "+"YOU "+"MAM"};
		for(String i:a) {
			System.out.print(i);
		}
	}
}
