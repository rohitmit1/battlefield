package com.game.battlefield.factory;

import java.util.ArrayList;
import java.util.List;

import com.game.battlefield.model.AircraftCarrier;
import com.game.battlefield.model.Battleship;
import com.game.battlefield.model.Coordinate;
import com.game.battlefield.model.Cruiser;
import com.game.battlefield.model.Destroyer;
import com.game.battlefield.model.Orientation;
import com.game.battlefield.model.Player;
import com.game.battlefield.model.PlayerImpl;
import com.game.battlefield.model.Ship;
import com.game.battlefield.model.ShipType;
import com.game.battlefield.model.Submarine;
import com.game.battlefield.service.UserInputService;

public class PlayerFactory {

	public static Player createPlayer() {
		String playerName = UserInputService.getPlayerName();
		Player player = new PlayerImpl(playerName);
		List<Ship> ships = new ArrayList<>();
		ships.add(ShipFactory.getShip(ShipType.Destroyer));
		ships.add(ShipFactory.getShip(ShipType.Destroyer));
		
		ships.add(ShipFactory.getShip(ShipType.Submarine));
		ships.add(ShipFactory.getShip(ShipType.Submarine));
		ships.add(ShipFactory.getShip(ShipType.Submarine));
		
		ships.add(ShipFactory.getShip(ShipType.Cruiser));
		ships.add(ShipFactory.getShip(ShipType.Cruiser));
		ships.add(ShipFactory.getShip(ShipType.Cruiser));
		
		ships.add(ShipFactory.getShip(ShipType.Battleship));
		ships.add(ShipFactory.getShip(ShipType.Battleship));
		ships.add(ShipFactory.getShip(ShipType.Battleship));
		ships.add(ShipFactory.getShip(ShipType.Battleship));
		
		ships.add(ShipFactory.getShip(ShipType.AircraftCarrier));
		ships.add(ShipFactory.getShip(ShipType.AircraftCarrier));
		ships.add(ShipFactory.getShip(ShipType.AircraftCarrier));
		ships.add(ShipFactory.getShip(ShipType.AircraftCarrier));
		ships.add(ShipFactory.getShip(ShipType.AircraftCarrier));
		ships.add(ShipFactory.getShip(ShipType.AircraftCarrier));
		return player;	
	}
	
}


class ShipFactory {
	
	public static Ship getShip(ShipType type){
		Ship ship = null;
		if(type == ShipType.AircraftCarrier) {
			System.out.println("Enter details for Aircraft Carrier");
			Coordinate coordinate = UserInputService.getCoordinate();
			Orientation orien = UserInputService.getOrientation();
			ship = new AircraftCarrier(coordinate, orien);
		}else if(type == ShipType.Battleship) {
			System.out.println("Enter details for Battleship");
			Coordinate coordinate = UserInputService.getCoordinate();
			Orientation orien = UserInputService.getOrientation();
			ship = new Battleship(coordinate, orien);
		}else if(type == ShipType.Cruiser) {
			System.out.println("Enter details for Cruiser");
			Coordinate coordinate = UserInputService.getCoordinate();
			Orientation orien = UserInputService.getOrientation();
			ship = new Cruiser(coordinate, orien);
		}else if(type == ShipType.Destroyer) {
			System.out.println("Enter details for Destroyer");
			Coordinate coordinate = UserInputService.getCoordinate();
			Orientation orien = UserInputService.getOrientation();
			ship = new Destroyer(coordinate, orien);
		}else if(type == ShipType.Submarine) {
			System.out.println("Enter details for Submarine");
			Coordinate coordinate = UserInputService.getCoordinate();
			Orientation orien = UserInputService.getOrientation();
			ship = new Submarine(coordinate, orien);
		}
		
		return ship;
	}

}
