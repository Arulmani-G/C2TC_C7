package Polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int num1 = 6;
		int num2 = 7;
		System.out.println(add(num,num1,num2));
		OverRidding ref = new Refer();
		ref.mes();
	}
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b, int c) {
		return a+b+c;
	}
}
