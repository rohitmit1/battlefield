package com.game.battlefield.actions;

import com.game.battlefield.model.Player;
import com.game.battlefield.service.UserInputService;

public class AttackStrategy implements IAttackStrategy {

	@Override
	public Attack composeMyMove(Player activePlayer, Player opponent) {
		
		Attack attack = new Attack();
		attack.setOpponent(opponent);
		attack.setPlayer(activePlayer);		
		attack.setTarget(UserInputService.getAttackCoordinates(activePlayer));
		
		return attack;
	}

}
