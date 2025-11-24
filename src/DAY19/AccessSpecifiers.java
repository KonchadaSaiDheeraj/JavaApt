package DAY19;

import java.util.Scanner;

public class AccessSpecifiers {
	
	Scanner sc = new Scanner(System.in);
	public int a = sc.nextInt();
	private float b = sc.nextFloat();
	protected double c = sc.nextDouble();
	String d = sc.next();  // default variable 

	public void methodPublic() {
		System.out.println("This is an Public method...");
	}
	
	private void methodPrivate() {
		System.out.println("This is an Private method...");
	}
	
	void methodDefault() {  //Default Method
		System.out.println("This is an Default method...");
	}

	protected void methodProtected() {
		System.out.println("This is an Protected method...");
	}

	public static void main(String[] args) {
		
		AccessSpecifiers as = new AccessSpecifiers();
		
	    System.out.println(as.a);   // these all variables and methods are within the same class and same package
	    System.out.println(as.b);
	    System.out.println(as.c);
	    System.out.println(as.d);
	    
	    as.methodPublic();
	    as.methodPrivate();
	    as.methodDefault();
	    as.methodProtected();
	}

}
