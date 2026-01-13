package javachallenge;



public class MatchingStone {

	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aaaAhftA";
		
		int[] arr = new int[128]; // in ASCII logic
		for (int i = 0; i < jewels.length(); i++) {
		    arr[jewels.charAt(i)] = 1;
		}

		int count = 0;
		for (int i = 0; i < stones.length(); i++) {
		    if (arr[stones.charAt(i)] == 1) {
		        count++;
		    }
		}
		
       System.out.println(count);	
	}

}







