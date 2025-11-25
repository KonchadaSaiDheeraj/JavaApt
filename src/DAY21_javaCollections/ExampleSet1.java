package DAY21_javaCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleSet1 {

	public static void main(String[] args) {
		
		Set set1 = new HashSet();    // set doesn't allow duplicate elements
		set1.add("Sai");
		set1.add("Dheeraj");
		set1.add("Konchada");
		set1.add("Sai");   // duplicate element
		set1.add(4.5f);
		set1.add(264);
		set1.add(null);
		
		for (Object s1 : set1) {
			System.out.println(s1);
		}
		System.out.println("The size of the set1: "+set1.size());
		System.out.println(set1.contains(4.5f));
		System.out.println(set1.remove("Konchada"));
		System.out.println("The Set is: "+set1);
		
		Set<String> set2 = new LinkedHashSet<>(); 
		set2.add("Toys");
		set2.add("Home Appliances");
		set2.add("Utensils");
		set2.add("Books and Stationaries");
		set2.add(null);
		set2.add(null);         //  accepting null values
		
		for (String s2 : set2) {
			System.out.println(s2);
		}
		System.out.println("The size of the set2: "+set2.size());
		System.out.println(set2);
		System.out.println(set2.addAll(set1));
		System.out.println(set1);
		System.out.println("The LinkedHashSet is: "+set2);
		System.out.println(set1.isEmpty());
		System.out.println(set2.removeAll(set1));
		System.out.println("The Final set2 list: "+set2);	
	}

}
