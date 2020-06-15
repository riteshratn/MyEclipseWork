package oops2Interface;

import oops2Inheritance.ChessGame;

public class GameRunner {

	public static void main(String[] args) {
		GamingConsole game=new ChessGame();
	//	ChessGame game=new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
