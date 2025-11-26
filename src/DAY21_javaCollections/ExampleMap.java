package DAY21_javaCollections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ExampleMap {

	public static void main(String[] args) {
		
		Map<String,Double> m1 = new HashMap<>();
		m1.put("Volvo", 340.057);
		m1.put("Volvo",300.0);
		m1.put("Tata",350.0);
		m1.put("Mahindra",250.0);
		m1.put("Tesla",400.0);
		m1.put("Hyundai",280.0);
		m1.put("Toyota",null);
		
		System.out.println(m1);
		System.out.println(m1.size());
		System.out.println("The value of Key-Tata: "+m1.get("Tata"));
		System.out.println(m1.containsKey("Volvo"));
		System.out.println(m1.containsValue(300.0));
		
		Map<String, Double> m2 = new LinkedHashMap<>();
		m2.put("Volvo",300.0);
		m2.put("Tata",350.0);
		m2.put("Mahindra",250.0);
		m2.put("Tesla",400.0);
		m2.put("Hyundai",280.0);
		m2.put("Toyota",null);
		m2.put("MG", 469.3);
		
		System.out.println(m2);
		System.out.println(m2.replace("Toyota", null, 455.6));
		System.out.println(m2);
		System.out.println("The values of the key set: "+m2.keySet());
		System.out.println(m2.entrySet());
		
		Set<String> set1 = m2.keySet();
		System.out.println("The list of Map m2: ");
		for (String str1 : set1) {
			System.out.println(str1+" : "+m2.get(str1));
		}
		
		System.out.println(m2.values());
		System.out.println("The final Map m2: ");
		m2.putAll(m1);
		System.out.println(m2);
		System.out.println(m1);
		
		Set<Entry<String, Double>> e3 = m2.entrySet();
		Iterator<Entry<String, Double>> itr1 = e3.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
