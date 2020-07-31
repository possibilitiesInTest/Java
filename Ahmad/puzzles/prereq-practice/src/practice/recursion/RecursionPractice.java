package practice.recursion;

public class RecursionPractice {

	public static void main(String[] args) {

		printNumber(4);
	}

	public static int printNumber(int num) {
		if(num ==0) {
			return 0;
	} else { 
		System.out.println(num);
		return printNumber(num-1);
	}
	}
}
