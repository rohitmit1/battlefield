package com.game.battlefield;

import java.util.List;

import com.game.battlefield.model.GameStatus;
import com.game.battlefield.model.Grid;
import com.game.battlefield.model.Player;

public interface BattleFieldGame {
	
	List<Player> getPlayers();
	Grid getGrid();
	GameStatus getStatus();
	Player getWinner();
	Player getActivePlayer();
	

}
