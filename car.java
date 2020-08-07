package Inheritance;

//we have to specify car is the inheritance property of vehicle
//so we use extend that specify we cand extend its property
public class car extends vehicle {
    
	
	int numDoor;
	
	public void printCar() {
		System.out.println(" car " + " color "+ getColor()+" maxspeed "+ maxSpeed + " number of outdoor " + numDoor);
	}


}
