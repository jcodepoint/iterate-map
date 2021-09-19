import java.util.HashMap;
import java.util.Map;

public class IterarMapEjemplo3 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mar");
		map.put(2, "Lago");
		map.put(3, "Rio");
		map.put(4, "Arroyo");
		
		map.entrySet().forEach(entry -> {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		});
	}

}
