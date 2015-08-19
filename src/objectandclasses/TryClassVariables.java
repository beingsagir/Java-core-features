package objectandclasses;

public class TryClassVariables {
	
	private int gear;
	private int speed;
	
	private int id;
	private static int numberOfBicycles = 0;
	
	
	private TryClassVariables(int initialGear, int initialSpeed){
		
		gear = initialGear;
		speed = initialSpeed;		
		id = ++numberOfBicycles;
	}
	
	public String getBiclycleInfo(){
		
		return ("ID : " + id + "\nGear :" + gear + "Speed :" + speed);
	}
	
	public void ceateThreeNewBicycle(int initialGear, int initialSpeed){
		for (int i = 0; i < 3; i++) {
			this.id = ++numberOfBicycles;
			this.gear = initialGear;
			this.speed = initialSpeed;
		}
		
	}

	public static void main(String[] args) {
		TryClassVariables newBicycle = new TryClassVariables(1, 20);
		newBicycle.ceateThreeNewBicycle(1, 20);
		System.out.println(newBicycle.getBiclycleInfo() + "\ntotal number of bicycle: "+ TryClassVariables.numberOfBicycles); 
	}

}
