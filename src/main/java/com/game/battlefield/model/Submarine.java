package com.game.battlefield.model;

public class Submarine extends AbstractShip {

	public Submarine(Coordinate start, Orientation orientation) {
		super(3, start, orientation);
	}

	@Override
	public String getName() {
		return ShipType.Submarine.toString();
	}

}
