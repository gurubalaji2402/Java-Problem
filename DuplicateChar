package javachallenge;



public class DuplicateChar {

	public static void main(String[] args) {
		String sample="abccbaacz";
		
		boolean [] ifseen = new boolean[128];
		
		for (int i = 0; i < sample.length(); i++) {
			char c =sample.charAt(i);
			
			if(ifseen[c]) {
				System.out.println("first letter to appear twice = " +c);
				return;
			}
			ifseen[c]=true;
		}
	}
}
