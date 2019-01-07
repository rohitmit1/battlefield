package com.game.battlefield.model;

public class Square {
	
	private Coordinate location;
	private boolean isHit;
	
	public Square(Coordinate location) {
		this(location, false);
	}
	
	public Square(Coordinate location, boolean isHit) {
		super();
		this.location = location;
		this.isHit = isHit;
	}
	public Coordinate getLocation() {
		return location;
	}
	public void setLocation(Coordinate location) {
		this.location = location;
	}
	public boolean isHit() {
		return isHit;
	}
	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}
	
	

}
