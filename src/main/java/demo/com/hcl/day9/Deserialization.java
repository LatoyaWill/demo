package demo.com.hcl.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {	

		public static void main(String[] args) {
					
			FileInputStream fos = null;
			ObjectInputStream oos = null;
			
			try {
				fos = new FileInputStream("/Users/Latoya/Desktop/test-files/AccountHolder.txt");
				oos = new ObjectInputStream(fos);
				AccountHolder a = (AccountHolder) oos.readObject();
				System.out.println(a.getAcctNum() + " " + a.getUserName() + " " + a.getPassword());
			} catch (FileNotFoundException a2) {
				
				a2.printStackTrace();
			} catch (IOException a2) {
				a2.printStackTrace();
			} catch (ClassNotFoundException a) {
				a.printStackTrace();
			} finally {
				try {
					fos.close();
					oos.close();
				} catch (IOException a2) {
					a2.printStackTrace();
				}
			}

		}

	}

