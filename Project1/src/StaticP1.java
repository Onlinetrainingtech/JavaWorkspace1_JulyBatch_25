
public class StaticP1 {

	static int gameScore=0;//Static variable
	public StaticP1() {
		gameScore++;
		System.out.println(gameScore);
	}
	public static void main(String[] args) {
		
		new StaticP1();
		new StaticP1();

	}

}
