package methods;

public class methodExplanation {

	public static void main(String[] args) {
//		boolean gameOver = true;
//		int score = 800;
//		int levelCompleted = 5;
//		int bonus = 100;
//		calculateScore(gameOver,score,levelCompleted,bonus);
		
		calculateScore(true,800,5,100);
		
//		score=10000;
//		levelCompleted=8;
//		bonus=200;
//		calculateScore(gameOver,score,levelCompleted,bonus);
		
		calculateScore(true,10000,8,200);

	}
	//Creating Method
	public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
		
		if(gameOver==true) {
			int finalScore=score+(levelCompleted*bonus);
			System.out.println("your final score was " +finalScore);
		}
		
	}

}
