package com.game.battlefield.model;

public class Destroyer extends AbstractShip {

	public Destroyer(Coordinate start, Orientation orientation) {
		super(2, start, orientation);
	}

	@Override
	public String getName() {
		return ShipType.Destroyer.toString();
	}

}
