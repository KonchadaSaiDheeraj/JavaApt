package DAY19;

import java.util.Scanner;

public class Keywords {
	
	public static void checkOdd(int num) throws IllegalArgumentException {
		
		if(num%2==0) {
			
			throw new IllegalArgumentException("Num is an even number...");
		}
		else {
			
			System.out.println("Num is an odd number...");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		try {
			checkOdd(num);
		}
		catch(Exception e) {
			System.out.println("Caught Exception: "+e);
			System.out.println(e.getLocalizedMessage());
		}
		finally {
			
			System.out.println("The Program Continues...");
		}
		
	}

}
