package com.game.battlefield.actions;

import com.game.battlefield.model.Player;

public interface IAttackStrategy {
	
	public Attack composeMyMove(Player activePlayer, Player opponent);

}
