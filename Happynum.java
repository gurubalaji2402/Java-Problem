package javachallenge;

import java.util.Scanner;

public class Happynum {
	
	
	public static int sumOfSquares(int n) {
		
		 int sum = 0;

	        while (n > 0) {
	            int digit = n % 10;
	            sum = sum + (digit * digit);
	            n = n / 10;
	        }
	        return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a positive number");
		int num =sc.nextInt();	
		 while (num != 1 && num != 4) {
	            num = sumOfSquares(num);
	        }
	        if (num == 1) {
	            System.out.println("Happy Number");
	        } else {
	            System.out.println("Not a Happy Number");
	        }
	    }
