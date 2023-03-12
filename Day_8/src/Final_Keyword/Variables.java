package Final_Keyword;

public class Variables {
	final String message = "theriyala";
	public static void main(String[] args) {
		Variables vers = new Variables();
		vers.arul();
		Addition add = vers.new Addition();
		add.arul();
	}
	 void arul() {
		System.out.println("hi");
	}
	final class Addition extends Variables{
		void arul() {
			System.out.println("hello");
		}
	}

}
