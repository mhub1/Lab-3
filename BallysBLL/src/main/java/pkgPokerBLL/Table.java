package pkgPokerBLL;

import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	
	private HashMap<Player, UUID> TablePlayers = new HashMap<Player, UUID>();
	
	public Table() {
		super();
		TableID = UUID.randomUUID();
	}
	
	public Table AddPlayerToTable(Player p)
	{
		TablePlayers.put(p, UUID.randomUUID());
		return this;
	}
	
	public Table RemovePlayerFromTable(Player p)
	{
		TablePlayers.remove(p);
		return this;
	}
}
