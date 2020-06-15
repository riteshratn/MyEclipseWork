package GenericsTimBuchulka;
public class MainRunner {

	public static void main(String[] args) {
		
		FootballPlayer joe=new FootballPlayer("Joe");
		BaseballPlayer ray=new BaseballPlayer("Ray");
		SoccerPlayer pat=new SoccerPlayer("Pat");
		
		Team KKR=new Team("KKR");
		KKR.addPlayer(joe);
		KKR.addPlayer(ray);
		KKR.addPlayer(pat);
		
		System.out.println(KKR.newPlayer());
		
	}
}
