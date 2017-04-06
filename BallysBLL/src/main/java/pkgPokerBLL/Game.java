package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private UUID TableID;
	private ArrayList<Player> GamePlayers = new ArrayList<Player>();
	
	public Game(UUID gameID, UUID tableID, ArrayList<Player> gamePlayers) {
		super();
		GameID = gameID;
		TableID = tableID;
		GamePlayers = gamePlayers;
	}

	public UUID getGameID() {
		return GameID;
	}

	public UUID getTableID() {
		return TableID;
	}

	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}

	public void setGameID(UUID gameID) {
		GameID = gameID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
	
	public Game AddPlayerToGame(UUID t, Player p) {
		GamePlayers.add(p);
		return this;
	}
	
}
