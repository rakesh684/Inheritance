package Inheritance;


public class vehicle {
	private String color;
	int maxSpeed;
	
	//including getters and setters
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
		
	}
	
	public void print() {
		System.out.println(" vehicle" + " color "+ color+" maxspeed "+ maxSpeed);
	}

}
