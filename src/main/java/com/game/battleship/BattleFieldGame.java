package com.game.battleship;

import java.util.List;

import com.game.battleship.model.GameStatus;
import com.game.battleship.model.Grid;
import com.game.battleship.model.Player;

public interface BattleFieldGame {
	
	List<Player> getPlayers();
	Grid getGrid();
	GameStatus getStatus();
	Player getWinner();
	

}
