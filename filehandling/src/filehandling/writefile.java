package filehandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writefile {

	public static void main(String[] args) {
		try {
			String myline;
			FileWriter myfilewriter = new FileWriter("E:\\JAVAFSD\\FILEHANDLINGJAVA\\filehandling\\src\\demofile.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a text line to write in demofile: ");
			myline = sc.nextLine();
			myfilewriter.write(myline);
			myfilewriter.close();
			System.out.println("Sucessfully wrote to the file.");
		}
		catch(IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace(); 
		}
		

	}

}
