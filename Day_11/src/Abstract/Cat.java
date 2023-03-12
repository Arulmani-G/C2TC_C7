package Abstract;

public class Cat extends Animal{
	String name = "Cat";
	@Override
	void sleep() {
		System.out.println("Cat is sleeping");
	}
}
