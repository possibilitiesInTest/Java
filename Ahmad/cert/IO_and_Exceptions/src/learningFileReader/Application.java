package learningFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		
		File file = new File("myfile.txt");
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		
		try(FileReader fileReader1 = new FileReader(file);
			BufferedReader bufferedReader1 = new BufferedReader(fileReader1);) {
			
			String line = bufferedReader1.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader1.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Problem reading the file " + file.getName());

//		} finally {
//			try {
//				if(bufferedReader != null) {
//					bufferedReader.close();
//				}
//				if(fileReader != null) {
//				fileReader.close();
//				}
//			} catch (IOException e) {
//				System.out.println("unable to close file " + file.getName());
//			} catch(NullPointerException ex) {
//				System.out.println(" file was probably never opened" + ex);
//			}
		}
	}

}
