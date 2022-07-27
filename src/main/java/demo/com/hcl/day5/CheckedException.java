package demo.com.hcl.day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file  = new File("/Applications/SpringToolSuite4.app/Contents/MacOS/STS_Workspace/demo/src/main/java/demo/com/hcl/day5/test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
	}

}
