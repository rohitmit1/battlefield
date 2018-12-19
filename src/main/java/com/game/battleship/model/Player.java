package com.game.battleship.model;

import java.util.List;

public interface Player {
	
	String getName();
	void placeShips(List<Ship> ships);
	List<Ship> getShips();
	HitResult attack(Location location);
	List<String> getDestroyedShips(Player opponent);

}
