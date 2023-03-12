package Interface;

public class Food implements Animal,Human {
	
	@Override
	public void run() {
		System.out.println("It is running");
	}

	@Override
	public void eat() {
		System.out.println("It is eating");
	}
	
}
