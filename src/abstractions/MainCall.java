package abstractions;

public class MainCall implements TestInterface{

	@Override
	public String testInterface1() {
		return "calling testInterface1";
	}
	
	
	public static void main(String args[]){
		// testInterface1();
	}

}
