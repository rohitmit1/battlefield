package com.game.battlefield.model;

public class Cruiser extends AbstractShip {

	public Cruiser(Coordinate start, Orientation orientation) {
		super(3, start, orientation);
	}

	@Override
	public String getName() {
		return ShipType.Cruiser.toString();
	}

}
