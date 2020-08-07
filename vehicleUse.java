package Inheritance;

public class vehicleUse {

	public static void main(String[] args) {
		
		vehicle v = new vehicle();

		//		v.color="Red";
		v.setColor("blue");
		v.print();
		
		car c = new car();
//		c.color="black";
		c.setColor("black");
		
		c.maxSpeed=100;
		c.numDoor=4;
		c.print();
		c.printCar();
		
		bycycle b =new bycycle();
		b.print();
	}
	

}
