package demo.com.hcl.day7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;

import org.apache.commons.lang3.ObjectUtils;

public class LinkedHashMapPrompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Patient p1 = new Patient("John", "Hypertension", "ER", 53);
			Patient p2 = new Patient("Jane", "Stroke", "ICU", 71);
			Patient p3 = new Patient("Billy", "Adenoids", "ENT", 5);
			
			Map<String, Patient> patientList = new LinkedHashMap< >();
			
			patientList.put("John", p1);
			patientList.put("Jane", p2);
			patientList.put("Billy", p3);
			patientList.put(null, null);
			
			for (String key : patientList.keySet()) {
				
				Patient p = patientList.get(key);
				System.out.println(p);
				
				if (ObjectUtils.isNotEmpty(p)) {
					System.out.println(p.getDiagnosis());
				}
				
			}
			
			for (Map.Entry<String, Patient> entry : patientList.entrySet()) {
				
				System.out.println(entry.getKey() + " " + entry.getValue());
				
			}
			
			for (Patient val : patientList.values()) {
				if (ObjectUtils.isNotEmpty(val)) {
					System.out.println(val.getName());
					
				}
			}
			
			Iterator<Map.Entry<String, Patient>> itr = patientList.entrySet().iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			
	}

}
