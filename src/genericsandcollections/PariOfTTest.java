package genericsandcollections;

class PairOfT<T>{
	T object1;
	T object2;
	PairOfT(T t1, T t2){
		object1 = t1;
		object2 = t2;
	}
	public T getFirst(){
		return object1;
	}
	public T getSecond(){
		return object2;
	}
}

public class PariOfTTest {

	public static void main(String[] args) {
		PairOfT<String> worldCup = new PairOfT<>("2018","Russia");
		System.out.println("World cup " + worldCup.getFirst() + " in " + worldCup.getSecond());

	}

}
