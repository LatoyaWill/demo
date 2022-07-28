package demo.com.hcl.day7;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class ComparableAndComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient p1 = new Patient(" John", "Hypertension", "ER", 53);
		Patient p2 = new Patient(" Jane", "Stroke", "ICU", 71);
		Patient p3 = new Patient(" Billy", "Adenoids", "ENT", 5);
		
		List<Patient> patientList = new ArrayList< >();
		
		patientList.add(p1);
		patientList.add(p2);
		patientList.add(p3);
		
		for (Patient p : patientList) {
			
			System.out.print(p.getName() + " " + p.getDiagnosis() + " " + p.getLocation() + " " + p.getAge());
		}
		
		//Collections.sort(patientList);
		
		Collections.sort(patientList, new DiagnosisComparator());
		
		System.out.println("After sorting ...");
		
		for (Patient p : patientList) {
			
			System.out.print(p.getName() + " " + p.getDiagnosis() + " " + p.getLocation() + " " + p.getAge());
		}


	}

}


@Setter
@Getter
@AllArgsConstructor

class Patient implements Comparable<Patient> {
	
	private String name;
	
	private String diagnosis;
	
	private String location;
	
	private int age;


	@Override
	public int compareTo(Patient p) {
		//return this.age.compareTo(p.getAge());
		
		return this.name.compareTo(p.getName());
	}
	
}

class AgeComparator implements Comparator<Patient> {
	
	@Override
	public int compare(Patient p1, Patient p2) {
		
		if (p1.getAge() > p2.getAge()) {
			return 1;
		}
		if (p1.getAge() < p2.getAge()) {
			return -1;
		}
		
		return 0;		
	}
}

class DiagnosisComparator implements Comparator<Patient> {
	
	public int compare(Patient p1, Patient p2) {
		return p1.getDiagnosis().compareTo(p2.getDiagnosis());
	}
}