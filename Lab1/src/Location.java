import java.util.ArrayList;

public class Location {
	private String name;
	private String descriptionLong;
	private String descriptionShort;
	private ArrayList<Location> paths;
	
	public Location(String name) {
		this.name = name;
	}
	
	public void describeYourself() {
		System.out.println(this.descriptionLong);
	}
		
	public void doCommand(String direction) {
		
	}
}
