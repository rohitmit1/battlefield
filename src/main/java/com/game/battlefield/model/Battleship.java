package com.game.battlefield.model;

public class Battleship extends AbstractShip {

	public Battleship(Coordinate start, Orientation orientation) {
		super(4, start, orientation);
	}

	@Override
	public String getName() {
		return ShipType.Battleship.toString();
	}

}
