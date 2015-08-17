package constructor;

public class TestConstructors {

	public static void main(String[] args) {

		ASampleCarClass newCarConstructor = new ASampleCarClass(10, 2, 2);
		
		Integer doors = newCarConstructor.getTotaldoors();
		Integer gears = newCarConstructor.getTotalGears();
		Integer seats = newCarConstructor.getTotalSeats();
		
		System.out.println(" doors : "+ doors +"\n gears : "+ gears +"\n seats : "+ seats);
	}

}
