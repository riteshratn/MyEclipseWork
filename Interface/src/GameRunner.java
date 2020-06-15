
public class GameRunner {

	public static void main(String[] args) {
		
		/*
		MarioGame game=new MarioGame();
		game.up();
		game.down();
		game.left();
		game.right();
		 */
		
		
		/*
		Chessgame game=new Chessgame();
		game.up();
		game.down();
		game.left();
		game.right();
		*/
		
		
		//Polymorphism
		GamingConsole[] games= {new MarioGame(), new Chessgame()};
		for(GamingConsole game:games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}
		

	}

}
