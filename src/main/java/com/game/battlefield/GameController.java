package com.game.battlefield;

import com.game.battlefield.model.Player;

public class GameController {


	public static void main(String[] args) {
		GameController gc = new GameController();
		gc.startNewGame();
	}
	
	public void startNewGame() {
		Runnable gameRunnable = new Runnable() {
			
			@Override
			public void run() {
				Game game = new Game();
				game.init();
				GameStatus status = game.start();
				if(status == GameStatus.RESULT) {
					System.out.println(game.getActivePlayer() + " Won the game");
				}else {
					System.out.println("The game ended without any result");
				}
			}
		};
		new Thread(gameRunnable).start();		
	}

}
