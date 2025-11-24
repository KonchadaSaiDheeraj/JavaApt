package DAY20;

import DAY19.AccessSpecifiers;

public class AccessSpecifiers3 extends AccessSpecifiers {

	public static void main(String[] args) {
		
		AccessSpecifiers3 as = new AccessSpecifiers3();
		
		System.out.println(as.a);
//		System.out.println(as.b);  // private variable
		System.out.println(as.c);  
//		System.out.println(as.d);  // default variable

		as.methodPublic();
 //   	as.methodPrivate();  // private method
//		as.methodDefault();  // default method
		as.methodProtected(); 

	}

}
