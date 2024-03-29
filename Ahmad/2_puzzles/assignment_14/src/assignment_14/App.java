package assignment_14;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given 2 arrays that are the same length containing strings, compare the 1st string in one array 
	to the 1st string in the other array, the 2nd to the 2nd and so on. 
	Count the number of times that the 2 strings are non-empty and start with the same char. 
	The strings may be any length, including 0. 	
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		matchingChar({"aa", "bb", "cc"}, {"aaa", "xx", "bb"})  <b>---></b> 1<br>
		matchingChar({"aa", "bb", "cc"}, {"aaa", "b", "bb"}) <b>---></b> 2 <br>
		matchingChar({"aa", "bb", "cc"}, {"", "", "ccc"}) <b>---></b> 1 <br>
	 */
	
	public static int matchingChar(String[] a, String[] b) {
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			String str1 = a[i];
			String str2 = b[i];
			
			if(!str1.equals("") && !str2.equals("")) {
					if(str1.charAt(0) == str2.charAt(0))
						count++;
				}
		}
		
		
		return count;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
