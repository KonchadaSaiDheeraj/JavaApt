package DAY21_javaCollections;

import java.util.ArrayList;
import java.util.List;

public class ExampleArrayList {

	public static void main(String[] args) {
		
		List list1 = new ArrayList(); // without using the generics
		list1.add("Sai");
		list1.add("Dheeraj");
		list1.add("Konchada");
		list1.add("Sai");   // duplicate element
		list1.add(4.5f);
		list1.add(264);
		
		for(Object l1:list1) {		
			System.out.println(l1);
		}
		
		System.out.println("The Size of the list1: "+list1.size());
		System.out.println("The Index value of list1: "+list1.get(2));
		System.out.println("The first element of list1: "+list1.getFirst());
		System.out.println("The last element of list1: "+list1.getLast());
		System.out.println("The first index of list element "+list1.get(0)+" : "+list1.indexOf("Sai"));
		System.out.println("The first index of list element "+list1.get(0)+" : "+list1.lastIndexOf("Sai"));
		
		List<String> list2 = new ArrayList<>();
		//list2.add(67);
		list2.add("Toys");
		list2.add("Home Appliances");
		list2.add("Utensils");
		list2.add("Books and Stationaries");
		list2.add(1, "Vegetables");
		list2.add(null);
		list2.add(null);         // arraylist accepting null values
		list2.addFirst("Fruits");
		list2.addLast("Appreals");
		
		for (String l2 : list2) {
			System.out.println(l2);
		}
		
		System.out.println("The Size of the list1: "+list2.size());
		System.out.println("The Index value of list1: "+list2.get(4));
		System.out.println("The first element of list1: "+list2.getFirst());
		System.out.println("The last element of list1: "+list2.getLast());
		System.out.println(list2.contains("Fruits"));
		System.out.println(list2.remove("null"));
		System.out.println(list2);
		System.out.println(list2.remove(7));
		System.out.println(list2);
	}

}
