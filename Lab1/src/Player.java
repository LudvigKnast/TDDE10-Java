
public class Player {
	private String name;
	private Location position;
	private int gold;
	private int health;
	
	public Player(String name, Location position) {
		this.name = name; this.position = position;
		this.gold = 0; this.health = 100;
	}
	
	public void moveTo(Player player, Location newLocation) {
		player.position = newLocation;
	}
	
	public Location getLocation() { 
		return this.position;
	}
}
