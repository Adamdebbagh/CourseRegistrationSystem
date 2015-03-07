package courseregistration.project;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

public class RegistrationManager {
	public static String[] registrationStatus = {"Not Accepted", "Not Accepted"};// or Accepted 
	//List<Pair> pairs = new ArrayList<Pair>();
	//Map<String,Pair> map = new HashMap<String,Pair>();
	//int listSize = pairs.size();
	String studentName;
	String studentSSN ;
	String coursePicked;
	
	
	public RegistrationManager() {}
	AccountsReceivable Acc = new AccountsReceivable();
	
	
	
	
	
	
	
	
	
	
	////////////////
	public class Pair { 

	   int ssn;
	   String course;
	    
	    public Pair(int ssn, String course){ 

	        this.ssn = ssn;
	        this.course = course;
	    } 
	} 


	public void saveName(String studentName) {
		this.studentName = studentName;
	}	
	public void saveSSN(String ssn) {
		this.studentSSN = ssn;
	}
	public void saveCoursePicked(String coursePicked) {
		this.coursePicked = coursePicked;
	}
	
	/*public void addStudentToList(String studentName){
		
		pairs.add(new Pair(studentSSN, coursePicked));
		//map.put(studentName, pairs);	// ERRor
		
		System.out.println("student ssn  : " + pairs.get(pairs.size()-1).ssn);
		System.out.println("student course : " + pairs.get(pairs.size()-1).course);
	}
	
	public Pair getStudentFromList(String studentName){
		Pair student = (Pair) map.get(studentName);
		return student;	
	}
	
	public void deleteStudentFromList(String studentName){
		map.remove(studentName);
	}*/
	
	

	
}
