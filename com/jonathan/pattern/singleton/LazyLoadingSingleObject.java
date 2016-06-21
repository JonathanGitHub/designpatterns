
public class LazyLoadingSingleObject {
	
	private static LazyLoadingSingleObject instance; // no final modifier 

   //make the constructor private so that this class cannot be
   //instantiated
	private LazyLoadingSingleObject(){

	}

	/*Create the singleton instance only if it's
  	  null, which means no one else has created it
  	  already, also, it's dangerous to init an instance inside a method so
  	  the keyword synchronized will make the operation thread safe
	*/
	public synchronized static LazyLoadingSingleObject getInstance() {
		if (instance == null) {
			instance = new LazyLoadingSingleObject();
		} 
		return instance;
	}

	public void showMessage(){
      System.out.println("Hello World!");
   }
}