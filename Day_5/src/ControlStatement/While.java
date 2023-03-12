package ControlStatement;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		System.out.println();
		int i = 1;
		while(i<=num) {
	 		System.out.println(i);
			i++;
		}
		do {
			System.out.println("Entered number "+num);
		}
		while(i==num); 		
		
		for(i=1;i<=num;i++) {
			if(i==2) {
				continue;
			}
			else {
				System.out.println(i);
			}
			
		}
	}

}
