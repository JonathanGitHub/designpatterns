/*
 * http://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 */
public class SingleObject {
	//create an object of SingleObject, 类加载就初始化了 O(∩_∩)O哈！
	private static final SingleObject instance = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
	private SingleObject(){

	}

	//Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage(){
      System.out.println("Hello World!");
   }
}