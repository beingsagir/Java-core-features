package constructor;

public class TestConstructors {

	public static void main(String[] args) {

		ASampleContructor newConstructor = new ASampleContructor(10, 2, 2);
		
		

		Integer doors = newConstructor.getTotaldoors();
		Integer gears = newConstructor.getTotalGears();
		Integer seats = newConstructor.getTotalSeats();
		
		System.out.println(" doors : "+ doors +"\n gears : "+ gears +"\n seats : "+ seats);
	}

}
