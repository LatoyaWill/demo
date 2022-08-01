package demo.com.hcl.day9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class SerializationEx {

	public static void main(String[] args) {
		
		AccountHolder a = new AccountHolder(202117, "user", "password");
				
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("/Users/Latoya/Desktop/test-files/AccountHolder.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			System.out.println("Sucess...");
		} catch (FileNotFoundException a2) {
			
			a2.printStackTrace();
		} catch (IOException a2) {
			
			a2.printStackTrace();
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


@Setter
@Getter
@AllArgsConstructor

class AccountHolder implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int acctNum;
	
	private String userName;
	
	private String password;
}