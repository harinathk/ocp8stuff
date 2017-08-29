package genericsandcollections;

class BoxPrinter<T>{
	private T value;
	public BoxPrinter(T arg){
		value = arg;
	}
	public String toString(){
		return "["+value+"]";
	}
}

public class BoxPrinterTest {

	public static void main(String[] args) {
		BoxPrinter<Integer> intValue = new BoxPrinter<Integer>(new Integer(10));
		System.out.println(intValue);
		
		BoxPrinter<String> strValue = new BoxPrinter<String>("Hello String");
		System.out.println(strValue);

	}

}
