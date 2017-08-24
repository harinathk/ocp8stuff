package advancedclassdesign;

abstract class AbstractShapeMain {
	
	public double area(){
		return 0; //default implementation
	}

	public static void main(String []args){
		//an abstract class can have static methods. 
		//since you don’t need to create an object of a class to invoke a static method in that class,
		//you can invoke the main() method defined in an abstract class.
		System.out.println("Abstract class main method");
	}
	
}
