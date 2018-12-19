package com.game.battleship.model;

import java.util.List;

public interface Player {
	
	String getName();
	void placeShips(List<Ship> ships);
	List<Ship> getShips();
	HitResult attack(Player opponent, Location location);
	List<String> getDestroyedShips(Player opponent);

}
