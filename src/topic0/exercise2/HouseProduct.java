package topic0.exercise2;

public class HouseProduct {

	private String wall;
	private String floor;
	private String roof;
	
	public String getWall(){
		return wall;
	}
	
	public void setWall(String wall)
	{
		this.wall = wall;		
	}
	
	public String getFloor(){
		return floor;
	}
	
	public void setFloor(String floor)
	{
		this.floor = floor;		
	}
	
	public String getRoof(){
		return roof;
	}
	
	public void setRoof(String roof)
	{
		this.roof = roof;		
	}
	
	public String toString(){
		return wall + floor + roof;
		
	}
	
}
