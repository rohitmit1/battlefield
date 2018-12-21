package com.game.battlefield.model;

public class Destroyer extends AbstractShip {

	public Destroyer(Location start, Orientation orientation) {
		super(2, start, orientation);
	}

	@Override
	public String getName() {
		return ShipType.Destroyer.toString();
	}

}
