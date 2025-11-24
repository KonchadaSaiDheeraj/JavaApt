package DAY20;

public class AccessSpecifiers4 {

	public static void main(String[] args) {
		
		AccessSpecifiers3 as = new AccessSpecifiers3();
		
		System.out.println(as.a);
//		System.out.println(as.b);  // private variable
//		System.out.println(as.c);  // protected variable
//		System.out.println(as.d);  // default variable

		as.methodPublic();
//    	as.methodPrivate();  // private method
//		as.methodDefault();  // default method
//		as.methodProtected(); // protected method
	}

}
