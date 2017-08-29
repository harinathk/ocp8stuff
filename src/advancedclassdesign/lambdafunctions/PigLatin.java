package advancedclassdesign.lambdafunctions;

@FunctionalInterface
interface SuffixFuncion{
	void call();
}

public class PigLatin {

	public static void main(String[] args) {
		String word = "Hello";
		SuffixFuncion suffixFunc = ()->System.out.println(word +"ay");
		//word = word +"Effectively Final";
		suffixFunc.call();
	}

}
