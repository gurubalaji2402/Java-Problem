package javachallenge;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String s =sc.nextLine();
		
		
		 for (int i = s.length()-1; i >= 0; i--) {
	            // If space found after counting started, stop loop
	            if (s.charAt(i) == ' ' && count > 0) {
	                break;
	            }
	            // If character is not space, count it
	            if (s.charAt(i) != ' ') {
	                count++;
	            }
	            
		 }
	            for (int i = s.length()-count; i<s.length(); i++) {
	                System.out.print(s.charAt(i));
	               
	    }
	            System.out.println();
	            System.out.println(count);
	} 
	
}
	

