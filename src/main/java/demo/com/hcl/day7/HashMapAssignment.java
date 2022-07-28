package demo.com.hcl.day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;


public class HashMapAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient4 p1 = new Patient4(" John", "Hypertension", "ER", 53);
		Patient4 p2 = new Patient4(" Jane", "Stroke", "ICU", 71);
		Patient4 p3 = new Patient4(" Billy", "Adenoids", "ENT", 5);
		
		Map<String, Patient4> patientList = new HashMap< >();
		
		patientList.put("John", p1);
		patientList.put("Jane", p2);
		patientList.put("Billy", p3);
		patientList.put(null, null);
		
		for (String key : patientList.keySet()) {
			Patient4 p = patientList.get(key);
			System.out.println(p);
			
			if (ObjectUtils.isNotEmpty(p)) {
				
				System.out.println(p.getName());
			}
		}
		
		for (Map.Entry<String, Patient4> entry : patientList.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		for (Patient4 val : patientList.values()) {
			if (ObjectUtils.isNotEmpty(val)) {
				System.out.print(val.getName());
			}
		}
		
		Iterator<Map.Entry<String, Patient4>> itr = patientList.entrySet().iterator();
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}

class Patient4 {
	
	Patient4(String name, String diagnosis, String location, int age) {
		
		this.name = name;
		this.diagnosis = diagnosis;
		this.location = location;
		this.age = age;
	}
	
	private String name;
	
	private String diagnosis;
	
	private String location;
	
	private int age;
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDiagnosis() {
		return diagnosis;
	}
	
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
