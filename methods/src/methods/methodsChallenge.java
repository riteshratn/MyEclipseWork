package methods;

public class methodsChallenge {

	public static void main(String[] args) {
		int highScorePosition=calculateHighScorePosition(1500);
		dispalyHighScorePosition("Tim",highScorePosition);
		
		 highScorePosition=calculateHighScorePosition(900);
		dispalyHighScorePosition("bob",highScorePosition);
		
		 highScorePosition=calculateHighScorePosition(400);
		dispalyHighScorePosition("ray",highScorePosition);
		
		 highScorePosition=calculateHighScorePosition(50);
		dispalyHighScorePosition("tom",highScorePosition);

	}
	public static void dispalyHighScorePosition(String name,int highScorePosition) {
		System.out.println(name+ " managed to get into position"+ highScorePosition +"on the high score table");
	}
	public static int calculateHighScorePosition(int playerScore) {
		if(playerScore>1000) {
			return 1;
		}else if(playerScore>500&&playerScore<1000) {
			return 2;
		}else if(playerScore>100&&playerScore<500) {
			return 3;
	}else {
		return 4;
	}

}

}
