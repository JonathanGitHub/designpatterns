public class SingletonPatternDemo {
	public static void main(String[] args) {
		//illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
		SingleObject object = SingleObject.getInstance();
		LazyLoadingSingleObject lazyLoadingSingleObject = LazyLoadingSingleObject.getInstance();

		//show the msg
		object.showMessage();
		lazyLoadingSingleObject.showMessage();
	}
}