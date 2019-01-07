package com.game.battlefield;

import java.util.List;

import com.game.battlefield.actions.Attack;
import com.game.battlefield.model.HitResult;
import com.game.battlefield.model.Player;
import com.game.battlefield.service.GameService;

public class Game {
	
	private GameService gameService;	
	private List<Player> playerList;	
	private Player activePlayer;
		
	public void init() {
		// if its multi player game, then init will take no of players as input and we can make player creation as generic as well
		Player player1 = gameService.getPlayerDetails("Player 1");
		playerList.add(player1);
		Player player2 = gameService.getPlayerDetails("Player 2");
		playerList.add(player2);
		setActivePlayer(gameService.startToss(playerList));
	}
	
	public Player getActivePlayer() {
		return activePlayer;
	}

	private void setActivePlayer(Player player) {
		activePlayer = player;
	}
	
	public GameStatus start() {
		while(true) {
			Attack attackObject = gameService.getNextMove(activePlayer);
			HitResult hit = gameService.launchAttack(attackObject);
			if(hit.isHit()) {
				//if opponent destroyed
				if(gameService.isOpponentDestroyed(attackObject)) {
					return GameStatus.RESULT;
					// From GameController ==>  get active player and he is the winner
				}else {
					setNextActivePlayer();
				}
			}
		}
		
	}

	// even this algorithm to find next player can be moved to service layer, if its a multi player game
	private void setNextActivePlayer() {
		//since there are only 2 players this logic could be sufficient
		for (Player player : playerList) {
			if(! player.equals(activePlayer)) {
				setActivePlayer(player);
			}
		}
	}

}
