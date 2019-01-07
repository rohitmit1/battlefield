package com.game.battlefield.service;

import java.util.Scanner;

import com.game.battlefield.model.Coordinate;
import com.game.battlefield.model.Grid;
import com.game.battlefield.model.Orientation;
import com.game.battlefield.model.Player;

public class UserInputService {
	
	public static String getPlayerName() {
		System.out.println("Enter the player name");
		Scanner sc = new Scanner(System.in);
		String playerName = sc.next();
		sc.close();
		return playerName;
	}
	
	public static Orientation getOrientation() {
		Orientation orien;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Provide orientation of the ship by entering 1 or 2");
			System.out.println("1. Horizonatal");
			System.out.println("2. Vertical");
			int orientationValue = sc.nextInt();
			if(orientationValue == 1) {
				orien = Orientation.HORIZONTAL;
				break;
			}else if(orientationValue == 2) {
				orien = Orientation.VERTICAL;
				break;
			}
			System.out.println("Please provide a valid input");
			
		}
		sc.close();
		return orien;
	}

	public static Coordinate getAttackCoordinates(Player activePlayer) {
		System.out.println("Active player : " + activePlayer.getName());
		System.out.println("Provide the coordinates to attack the opponent");
		
		return getCoordinate();
	}
	
	public static Coordinate getCoordinate() {
		Scanner sc = new Scanner(System.in);
		char col;
		while(true) {
			System.out.println("Please Provide column range from " + Grid.COLUMN_RANGE_STRING + " : ");
			String colValue = sc.next();
			if(isColumValueValid(colValue)) {
				col = colValue.charAt(0);
				break;
			}
			System.out.println("Provided input is not in range");
		}

		int row;
		while(true) {
			System.out.println("Please Provide row range from " + Grid.ROW_RANGE_STRING + " : ");
			int rowValue = sc.nextInt();
			if(isRowValueValid(rowValue)) {
				row = rowValue;
				break;
			}
			System.out.println("Provided input is not in range");
		}
		sc.close();
		Coordinate coordinate = new Coordinate(col, row);
		return coordinate;

	}

	private static boolean isRowValueValid(int rowValue) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean isColumValueValid(String colValue) {
		// TODO Auto-generated method stub
		return false;
	}

}
