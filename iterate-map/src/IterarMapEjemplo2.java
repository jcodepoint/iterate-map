import java.util.HashMap;
import java.util.Map;

public class IterarMapEjemplo2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mar");
		map.put(2, "Lago");
		map.put(3, "Rio");
		map.put(4, "Arroyo");

		//Map<K, V>.forEach() expects a BiConsumer<? super K,? super V> as argument, 
		//and the signature of the BiConsumer<T, U> abstract method is accept(T t, U u).

		//So you should pass it a lambda expression that takes two inputs as argument: 
		//the key and the value:		
		map.forEach((k, v) -> {
			System.out.println("Key : " + k + " Value : " + v);
		});
	}

}
