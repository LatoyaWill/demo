package demo.com.hcl.day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamEx {

	public static void main(String[] args) {
		FileReader in = null;
		FileWriter out = null;
		
	try {
		
		in = new FileReader("/Users/Latoya/Desktop/test-files/testfile.txt");
		out = new FileWriter("/Users/Latoya/Desktop/test-files/newfile.txt");
		
		int c = 0;
		
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		
		System.out.println("Success...");
	} catch (IOException e) {
			e.printStackTrace();
	} finally {
		try {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	   }
	}

}
