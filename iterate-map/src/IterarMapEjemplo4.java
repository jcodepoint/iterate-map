import java.util.HashMap;
import java.util.Map;

public class IterarMapEjemplo4 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mar");
		map.put(2, "Lago");
		map.put(3, "Rio");
		map.put(4, "Arroyo");
		
		for (Integer key : map.keySet()) {
			System.out.println("-> key: " + key + " | value: " + map.get(key));
		}
	}

}
