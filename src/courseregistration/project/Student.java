package courseregistration.project;

public class Student {
	
	protected String studentName;
	protected int studentSSN ;
	protected double fee;
	protected String[] transcript;
	
	//simulate database work
	// hardCoded students transcripts
	
	
	String[] adamTranscript = {Course.COURSE_ID[0]};
	String[] giuseppeTranscript = {Course.COURSE_ID[0],Course.COURSE_ID[1],Course.COURSE_ID[2]};
	String[] carlosTranscript = {Course.COURSE_ID[1]};
	String[] solomonTranscript = {Course.COURSE_ID[3],Course.COURSE_ID[4]};
	String[] wadeTranscript = {Course.COURSE_ID[1],Course.COURSE_ID[3],Course.COURSE_ID[5]};
	
	public Student(String name, int ssn) {
		this.studentName = name;
		this.studentSSN = ssn;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentSSN() {
		return studentSSN;
	}

	public void setStudentSSN(int studentSSN) {

		this.studentSSN = studentSSN;
	}
	
	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String[] getTranscript(String studentName) {
		
		String[] transcript = new String[Course.COURSE_ID.length];
		
		switch (studentName) {
		case "adam":
			transcript = adamTranscript;
			break;
		case "giuseppe":
			transcript = giuseppeTranscript;
			break;
		case "solomon":
			transcript = solomonTranscript;
			break;
		case "carlos":
			transcript = carlosTranscript;
			break;
		case "wade":
			transcript = wadeTranscript;
			break;
		default:
			break;
		}
		return transcript;
		
	}
	public String getAddress(String name){
		String adress = null;
		switch (name) {
		case "adam":
			adress = "3350 huntley,MD , USA";
			break;
		case "giuseppe":
			adress = "423 brinkley,Calornia , USA";
			break;
		case "solomon":
			adress = "19 broadway,NY , USA";
			break;
		case "carlos":
			adress = "16 pennsylvania Ave,DC , USA";
			break;
		case "wade":
			adress = "30 Fisher rd ,Carolina , USA";
			break;

		default:
			break;
		}
		return adress;
		
	}
	public static void sendForm(RegistrationManager rm) {
		RegistrationForm rf = new RegistrationForm();	
		// get student Inputs
		   String studentName = rf.nameField.getText();
		   int studentSSN = Integer.parseInt(rf.ssnField.getText());
		   String coursePicked = rf.course.getSelectedItem();
		   
		   rm.setStudentName(studentName);
		   rm.setStudentSSN(studentSSN);
		   rm.setCoursePicked(coursePicked);
		   
		   //sanity check
		   System.out.println("RF-student name : "+ studentName);
		   System.out.println("RF-student ssn : "+ studentSSN);
		   System.out.println("RF-student course : "+ coursePicked);
		   
		   System.out.println("RM-student name : "+ rm.getStudentName());
		   System.out.println("RM-student ssn : "+ rm.getStudentSSN());
		   System.out.println("RM-student course : "+ rm.getCoursePicked());
		   
		   System.out.println("Registration submission list size : " + rm.listSize);
		   
	}
}
