package com.game.battlefield.model;

import java.util.List;

public interface Ship {
	int getSize();
	String getName();
	List<Square> getSquares();
	default Square squareAt(Coordinate location) {
		for(Square square : getSquares()) {
			if(square.getLocation().equals(location)) {
				return square;
			}
		}
		return null;
	}
	default ShipStatus getStatus() {
		int hitCount = 0;
		for(Square square : getSquares()) {
			if(square.isHit()) {
				hitCount++;
			}
		}
		if(hitCount == 0) {
			return ShipStatus.HEALTHY;
		} else if(hitCount == getSize()) {
			return ShipStatus.DESTROYED;
		} else {
			return ShipStatus.PARTIALLY_DESTROYED;
		}
	}
	

}
