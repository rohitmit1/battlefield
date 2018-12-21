package com.game.battlefield.model;

public final class Location {
	
	private char column;
	private int row;
	
	public Location(char column, int row) {
		super();
		this.column = column;
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + column;
		result = prime * result + row;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		if (column != other.column)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	
	

}
