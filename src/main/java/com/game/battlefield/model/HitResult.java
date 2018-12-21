package com.game.battlefield.model;

public class HitResult {
	
	boolean isHit;
	String destroyedShip;
	
	public boolean isHit() {
		return isHit;
	}
	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}
	public String getDestroyedShip() {
		return destroyedShip;
	}
	public void setDestroyedShip(String destroyedShip) {
		this.destroyedShip = destroyedShip;
	}
	
	

}
