package javachallenge;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicate2 {

	public static void main(String[] args) {
		  int[] nums = {1,2,3,3,4};

	        Set<Integer> n = new LinkedHashSet<Integer>();

	        for (int num : nums) {
	            if (!n.add(num)) {
	                System.out.println("true");
	                return;
	            }
	        }

	        System.out.println("false");
	}
