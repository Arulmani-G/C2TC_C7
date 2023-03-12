package Operators;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int sum = a+b;
		int sub= a-b;
		int mul = a*b;
		double div = a/b;
		int mod = a%b;
		a=++b;
		b=--a;
		a/=b;
		b*=a;
		a%=b;
		b-=a;
		a+=b;
		if(a==b&&b>=sum) {
			System.out.println(a);
		}
		else if(a!=mul||b<=div) {
			System.out.println(b);
		}
		System.out.println(b);
		int val = (a>b)?a:b;
		
;	}

}
