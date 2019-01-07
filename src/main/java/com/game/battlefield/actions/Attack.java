package com.game.battlefield.actions;

import com.game.battlefield.model.Coordinate;
import com.game.battlefield.model.Player;

public class Attack {
	
	private Player player; 
	private Player opponent;
	private Coordinate target;
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Player getOpponent() {
		return opponent;
	}
	public void setOpponent(Player opponent) {
		this.opponent = opponent;
	}
	public Coordinate getTarget() {
		return target;
	}
	public void setTarget(Coordinate target) {
		this.target = target;
	}
	

}
