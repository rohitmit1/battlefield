package com.game.battlefield.service;

import java.util.List;
import java.util.Random;

import com.game.battlefield.actions.Attack;
import com.game.battlefield.factory.PlayerFactory;
import com.game.battlefield.model.HitResult;
import com.game.battlefield.model.Player;
import com.game.battlefield.model.Ship;
import com.game.battlefield.model.ShipStatus;
import com.game.battlefield.model.Square;

public class GameService {
	
	public Player getPlayerDetails(String playerWelcomeString) {
		//from command prompt get player details
		//Use this input, send it to Player Factory to create a player and return
		System.out.println("Welcome : " + playerWelcomeString);
		Player player = PlayerFactory.createPlayer();		
		return player;
	}
	
	public Player startToss(List<Player> playerList) {
		int playerCount = playerList.size();
		Random r = new Random();
		int randomNumber =  r.nextInt(playerCount + 1);
		return playerList.get(randomNumber);
	}

	public HitResult launchAttack(Attack attackObj) {
		List<Ship> ships = attackObj.getOpponent().getShips();
		for(Ship ship : ships) {
			Square square = ship.squareAt(attackObj.getTarget());
			if(square != null) {
				square.setHit(true);
				ShipStatus status = ship.getStatus();
				if(ShipStatus.DESTROYED.equals(status)) {
					return new HitResult(true, ship.getName());
				} else {
					return new HitResult(true, null);
				}
				
			}
		}
		return null;
	}
	
	public Attack getNextMove(Player activePlayer) {
		return activePlayer.getNextMove();
		
	}

	public boolean isOpponentDestroyed(Attack attackObject) {
		return attackObject.getOpponent().isCompletelyDestroyed();
	}
	

}
