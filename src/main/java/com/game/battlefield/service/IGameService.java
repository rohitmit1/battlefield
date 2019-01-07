package com.game.battlefield.service;

import java.util.List;

import com.game.battlefield.actions.Attack;
import com.game.battlefield.model.HitResult;
import com.game.battlefield.model.Player;

public interface IGameService {

	public Player startToss(List<Player> playerList);
	
	public HitResult launchAttack(Attack attackObj);
	
	public Attack getNextMove(Player activePlayer);

	public boolean isOpponentDestroyed(Attack attackObject);
	
}
