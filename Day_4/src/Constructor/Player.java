package Constructor;

public class Player {
	String name;
	int playerNo;
	int scores;
	public Player(String name, int playerNo, int scores) {
		super();
		this.name = name;
		this.playerNo = playerNo;
		this.scores = scores;
	}
	void display() {
		System.out.println("Name: "+name+"\n"+"Player No: "+playerNo+"\n"+"Scores: "+scores);
	}
	
}
