package javachallenge;

import java.util.Scanner;

public class SquareRoot {
	
	
	
		 public void mySqrt(int x) {
			 if (x < 0) {
				 System.out.println("Square root not defined for negative numbers");
		            return;   // return nothing
		        }

		        int i = 0;
		        while (i * i <= x) {
		            i++;
		        }
                int num=i-1;
		        System.out.println(num);
		    }
		    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n =sc.nextInt();
		SquareRoot sq= new SquareRoot ();
		sq.mySqrt(n);

	}

}
