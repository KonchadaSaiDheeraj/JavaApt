package DAY19;

public class AccessSpecifiers2 {

	public static void main(String[] args) {
		
		AccessSpecifiers as = new AccessSpecifiers();
		
		System.out.println(as.a);
//		System.out.println(as.b);  // private variable
		System.out.println(as.c);
		System.out.println(as.d);  //  If we mention private access specifier to any data member/method can only accessible with in class only.

		as.methodPublic();
//    	as.methodPrivate();  // private method
		as.methodDefault();
		as.methodProtected();
	}

}
