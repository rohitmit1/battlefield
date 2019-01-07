package com.game.battlefield.model;

public class Grid {
	
	//Based on the requirement given, am hardcoding the the column count and row count values	
	private int columnCount = 10;
	int rowCount = 10;
	
	public static final String COLUMN_RANGE_STRING = "A to J";
	public static final String ROW_RANGE_STRING = "1 to 10";
	
	public int getColumnCount() {
		return columnCount;
	}
//	public void setColumnCount(int columnCount) {
//		this.columnCount = columnCount;
//	}
	public int getRowCount() {
		return rowCount;
	}
//	public void setRowCount(int rowCount) {
//		this.rowCount = rowCount;
//	}
	
	
}
