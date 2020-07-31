package practice.recursion;

public class RecursionPractice2 {

	public static void main(String[] args) {

		System.out.println(allDollars("hello")); //h$e$l$l$o
		System.out.println(allDollars("James")); //j$a$m$e$s

	}
	
	public static String allDollars(String str) {
		if(str.length() <=1) {
			return str;
		}
		return str.charAt(0) + "$" + allDollars(str.substring(1));
	}

}
