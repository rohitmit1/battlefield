package com.game.battlefield.model;

import java.util.ArrayList;
import java.util.List;

import com.game.battlefield.actions.Attack;
import com.game.battlefield.actions.IAttackStrategy;

public class PlayerImpl implements Player {
	
	private List<Ship> ships;
	private String name;
	private IAttackStrategy aStrategy;
	private Player opponent;
	
	public PlayerImpl(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void placeShips(List<Ship> ships) {
		this.ships = ships;
	}

	@Override
	public List<Ship> getShips() {
		return ships;
	}

	/*@Override
	public HitResult attack(Player opponent, Coordinate location) {
		HitResult result = new HitResult();
		for(Ship ship : opponent.getShips()) {
			Square square = ship.squareAt(location);
			if(square != null) {
				square.setHit(true);
				result.setHit(true);
				if(ship.getStatus().equals(ShipStatus.DESTROYED)) {
					result.setDestroyedShip(ship.getName());
					return result;
				}
			}
		}
		return result;
	}*/

	@Override
	public List<String> getDestroyedShips(Player opponent) {
		List<String> destroyedShips = new ArrayList<>();
		for(Ship ship : opponent.getShips()) {
			if(ShipStatus.DESTROYED.equals(ship.getStatus())) {
				destroyedShips.add(ship.getName());
			}
		}
		return destroyedShips;
	}
	
	@Override
	public boolean isCompletelyDestroyed() {
		boolean allDestroyed = true;
		for(Ship ship : getShips()) {
			if(! ShipStatus.DESTROYED.equals(ship.getStatus())) {
				allDestroyed = false;
				break;
			}
		}
		return allDestroyed;
	}

	@Override
	public Attack getNextMove() {
		return aStrategy.composeMyMove(this, getOpponent());
	}

	@Override
	public Player getOpponent() {
		return opponent;
	}

	@Override
	public void setOpponent(Player opponent) {
		this.opponent = opponent;
	}

}
