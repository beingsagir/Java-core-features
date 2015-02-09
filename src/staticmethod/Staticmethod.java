package staticmethod;

public class Staticmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aNewStaticMethod();
		Staticmethod ok = new Staticmethod();
		ok.aNonStaticMethod();
	}
	static void aNewStaticMethod(){
		System.out.println("This is a new static method");
	}
	
	public void aNonStaticMethod(){
		System.out.println("A non Static method");
	}

}
