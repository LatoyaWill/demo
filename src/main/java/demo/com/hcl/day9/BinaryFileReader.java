package demo.com.hcl.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileReader {

	public static void main(String[] args) {
		
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;
		int temp = 0;
		
		try {
			try {
				sourceStream = new FileInputStream("/Users/Latoya/Desktop/test-files/test.png");
				targetStream = new FileOutputStream("/Users/Latoya/Desktop/test-files/testt.png");
				
				while ((temp = sourceStream.read()) != -1) {
					targetStream.write((byte) temp);
				}
				System.out.println("Success...");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} finally {
			try {
				if (sourceStream != null) {
					sourceStream.close();
				}
				if (targetStream != null) {
					targetStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
