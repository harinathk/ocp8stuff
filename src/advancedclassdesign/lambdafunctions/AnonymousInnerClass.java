package advancedclassdesign.lambdafunctions;

@FunctionalInterface
interface Function{
	void call();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Function function = new Function(){
			public void call(){
				System.out.println("Hello World");
			}
		};
		function.call();

	}

}
