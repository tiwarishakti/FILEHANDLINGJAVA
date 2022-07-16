package filehandling;

import java.io.File;
import java.io.IOException;

public class cratefile {
	public static void main(String[] args) {
		try {
			File myfile = new File("E:\\JAVAFSD\\FILEHANDLINGJAVA\\filehandling\\src\\demofile.txt");
			if(myfile.createNewFile()) {
				System.out.println("File created: " + myfile.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		}
		catch(IOException e) {
			System.out.println("An error occurred. ");
			e.printStackTrace();
		}
	}
}