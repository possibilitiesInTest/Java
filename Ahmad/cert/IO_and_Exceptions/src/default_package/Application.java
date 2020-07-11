package default_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
//		for(int i=0; i<=3; i++){
//			Scanner input = new Scanner(System.in);
//			System.out.println("Enter some text: ");
//			String enteredText = input.nextLine();
//			System.out.println(enteredText);
//		}

		try {
			File file = new File("myfile.txt");
			Scanner input = null;
			input = new Scanner(file);

			while(input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// System.out.println("File not found.");
	
		}
		

		MyFileUtils myUtil = new MyFileUtils();
		try {
			System.out.println(myUtil.subtract10FromLargerNumber(5));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			
	}
	

}
