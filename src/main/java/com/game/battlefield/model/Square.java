package com.game.battlefield.model;

public class Square {
	
	private Location location;
	private boolean isHit;
	
	public Square(Location location) {
		this(location, false);
	}
	
	public Square(Location location, boolean isHit) {
		super();
		this.location = location;
		this.isHit = isHit;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public boolean isHit() {
		return isHit;
	}
	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}
	
	

}
