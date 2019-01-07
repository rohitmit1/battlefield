package com.game.battlefield.model;

import java.util.List;

import com.game.battlefield.actions.Attack;

public interface Player {
	
	String getName();
	void placeShips(List<Ship> ships);
	List<Ship> getShips();
	
	//HitResult attack(Player opponent, Coordinate location);
	List<String> getDestroyedShips(Player opponent);

	public Attack getNextMove();
	public Player getOpponent();
	public void setOpponent(Player opponent);
	public boolean isCompletelyDestroyed();
}
