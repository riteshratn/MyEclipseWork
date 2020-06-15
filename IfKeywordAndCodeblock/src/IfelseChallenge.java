
public class IfelseChallenge {
	public static void main(String[] args) {
		boolean gameOver=true;
		int secondScore=10000;
		int levelCompleted=8;
		int bonus=200;
		
		if(gameOver==true) {
			int finalScore=secondScore+(levelCompleted*bonus);
			System.out.println("your final score was "+finalScore);
		}
		
		
	}

}
