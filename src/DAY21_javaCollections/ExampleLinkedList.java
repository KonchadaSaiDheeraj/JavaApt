package DAY21_javaCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExampleLinkedList {

	public static void main(String[] args) {
		
		List list3 = new LinkedList();
		list3.add("Sai");
		list3.add("Dheeraj");
		list3.add("Konchada");
		list3.add("Sai");   // duplicate element
		list3.add(4.5f);
		list3.add(264);
		
		for (Object l3 : list3) {
			System.out.println(l3);
		}
		
		System.out.println("The Size of the list3: "+list3.size());
		System.out.println("The Index value of list3: "+list3.get(2));
		System.out.println("The first element of list3: "+list3.getFirst());
		System.out.println("The last element of list3: "+list3.getLast());
		System.out.println("The first index of list element "+list3.get(0)+" : "+list3.indexOf("Sai"));
		System.out.println("The first index of list element "+list3.get(0)+" : "+list3.lastIndexOf("Sai"));
		
		List<String> list4 = new LinkedList<>();
		list4.add("Toys");
		list4.add("Home Appliances");
		list4.add("Utensils");
		list4.add("Books and Stationaries");
		list4.add(1, "Vegetables");
		list4.add(null);
		list4.add(null);         // arraylist accepting null values
		list4.addFirst("Fruits");
		list4.addLast("Appreals");
		
		for (String l4 : list4) {
			System.out.println(l4);
		}
		
		System.out.println(list4.addAll(list3));
		System.out.println("The Array List is: "+list4);
//		Iterator<String> iterator = list4.iterator();   // classCastException is coming when we execute the iterator code
//		System.out.println("The Array List is: ");
//        while(iterator.hasNext()) {
//        	
//            String item = iterator.next();
//            System.out.println(item);
//            
//        }
		System.out.println("The reverse order of the list: "+list4.reversed());
		System.out.println(list4);
		System.out.println("The updating element at index-6: "+list4.set(6, "Eatables"));
		System.out.println("The updating element at index-7: "+list4.set(7, "Programming Languages"));
		System.out.println(list4);
	} 
}
