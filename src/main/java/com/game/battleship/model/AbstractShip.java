package com.game.battleship.model;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractShip implements Ship {
	private List<Square> squares;
	private final int size;
	protected AbstractShip(int size, Location start, Orientation orientation) {
		this.size = size;
		squares = new ArrayList<>();
		for(int i = 1; i <= size; size++) {
			if(Orientation.VERTICAL.equals(orientation)) {
				squares.add(new Square(new Location(start.getColumn(), start.getRow() + i)));
			} else {
				squares.add(new Square(new Location((char)((int)start.getColumn() + i), start.getRow())));
			}
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public List<Square> getSquares() {
		return squares;
	}


}
