package assignment_12;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Return a version of the given string, where for every star (*) 
	in the string the star and the chars immediately to its left and right are gone. 
	So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		starKill("cd*zq")  <b>---></b>"cq"<br>
		starKill("ab**cd")    <b>---></b> "ad" <br>
		starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */
	
	public static String starKill(String str) {
		
		// char star = '*';
		
		int len = str.length();
		String result = "";
		
		for ( int  i = 0; i < len; i++) {

		
		// if first char of string is not star
		// append char to result
		if (i == 0 && str.charAt(i) != '*')
			result += str.charAt(i);
		
		// for every char after first, does not equal star
		// or char before is not star
		// append char to res
		if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') 
			result += str.charAt(i);
	
		// if char at i = star and charBefore is not star
		// res = substring of first char to charBefore star
		if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*')
			result = result.substring(0, result.length() - 1);
		}
		
		return result;
	}
	
	
		


	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
