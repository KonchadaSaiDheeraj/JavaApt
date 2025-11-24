package DAY19;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
//		String reverse = "";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			
//			reverse+=str.charAt(i);
//			
//		}
		char strArr[] = str.toCharArray();
		int left = 0;
		int right = strArr.length-1;
		char temp;  // temporary variable to store
		
		while(left<right) {
			temp = strArr[left];
			strArr[left] = strArr[right];
			strArr[right] = temp;
			
			left++;
			right--;	
		}
		
		String reverse = new String(strArr);
		System.out.println("Original String: "+str);
		System.out.println("Reverse String: "+reverse);
	}

}

