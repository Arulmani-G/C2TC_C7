package ControlStatement;
import java.util.*;
public class If_Statement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		System.out.println();
		if(num>10&&num<20) {
			System.out.println(num+" Greater than 10 and lesser than 20");
		}
		else if(num<10) {
			System.out.println(num+" Smaller than 10 ");
			if(num%2==0) {
				System.out.println(num+" is divided by two");
			}
		}
		else {
			System.out.println(num+" number is greater");
		}
	}

}
