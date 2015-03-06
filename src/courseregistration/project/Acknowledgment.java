package courseregistration.project;

import java.util.Date;
import java.util.List;

import courseregistration.project.Course.PreRequite;

public class Acknowledgment {
	String result; 
	double amountDue;
	 Date time; 
	 String room;
	 String courseNumber; 
	 double totalTuition; 
	 String courseClosed;
	 List<PreRequite> prerequisites;
	public Acknowledgment() {}
	
	@SuppressWarnings("unused")
	private void showResult(boolean status){
		if(status == true){
		result = RegistrationManager.registrationStatus[0];
		// construct the other params here
		}else{
			result = RegistrationManager.registrationStatus[1];	
			// construct the other params here
		}
	}

}
