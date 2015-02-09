package impsingleton;

public class ImplementingSingletons {
	
	private static ImplementingSingletons singletons = new ImplementingSingletons();
	
	/* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	private ImplementingSingletons(){
		
	}
	
	/* Static instance method */
	public static ImplementingSingletons getInstance(){
		return singletons;
	}
	
	/* Other Methods protected by singleton-ness */
	protected static void demoMethod(){
		System.out.println("this is a sweet output from a singleton class");		
	}

}
