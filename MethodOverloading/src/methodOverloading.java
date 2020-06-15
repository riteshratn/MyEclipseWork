
public class methodOverloading {

	public static void main(String[] args) {
		int newScore=calcuatescore("ray",500);
		System.out.println("score is"+newScore);
		calcuatescore(75);
		calcuatescore();

	}
	public static int calcuatescore(String playerName,int score) {
		System.out.println("player "+playerName+" scored"+score+" points");
		return score*1000;
		
	}
	
	public static int calcuatescore(int score) {
		System.out.println("unNamedplayer " + " scored "+score+" points");
		return score*1000;
		
	}
	
	public static int calcuatescore() {
		System.out.println("No player name,No player Score");
		return 0;
		
	}
	

}
 