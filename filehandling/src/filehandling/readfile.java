package filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class readfile {

	public static void main(String[] args) {
		try {
			File myobj = new File("E:\\JAVAFSD\\FILEHANDLINGJAVA\\filehandling\\src\\demofile.txt");
			Scanner myread = new Scanner(myobj);
			while(myread.hasNextLine()) {
				String contant = myread.nextLine();
				System.out.println(contant);
			}myread.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An Error occurred.");
			e.printStackTrace();
		}
	}
}
