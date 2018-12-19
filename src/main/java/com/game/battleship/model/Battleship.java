package com.game.battleship.model;

public class Battleship extends AbstractShip {

	public Battleship(Location start, Orientation orientation) {
		super(4, start, orientation);
	}

	@Override
	public String getName() {
		return ShipType.Battleship.toString();
	}

}
