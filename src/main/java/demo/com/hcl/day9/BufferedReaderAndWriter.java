package demo.com.hcl.day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderAndWriter {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			Reader reader = new FileReader("/Users/Latoya/Desktop/test-files/testfile.txt");
			br = new BufferedReader(reader);
			String line = null;
			
			File outFile = new File("/Users/Latoya/Desktop/test-files/newfile.txt ");
			Writer writer = new FileWriter(outFile);
			bw = new BufferedWriter(writer);
			
			while ((line = br.readLine()) != null) {
				bw.write(line);
			}
			System.out.println("Success...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
