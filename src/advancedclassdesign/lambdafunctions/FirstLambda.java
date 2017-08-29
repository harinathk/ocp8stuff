package advancedclassdesign.lambdafunctions;

@FunctionalInterface
interface LambdaFunction{
	void callme();
	
	default public void call(){
		System.out.println("Default Method");
	}
}

public class FirstLambda {
	
	public static void main(String []args){
		
		LambdaFunction lambdaFunction = () -> System.out.println("Lambda Expression Called ");
		lambdaFunction.callme();
		lambdaFunction.call();
	}

}
