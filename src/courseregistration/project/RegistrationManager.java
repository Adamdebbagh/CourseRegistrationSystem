package courseregistration.project;

public class RegistrationManager {
    
    String studentName;
    String studentSSN ;
    String coursePicked;

    public RegistrationManager() {}

    public void saveName(String studentName) {
            this.studentName = studentName;
    }	
    public void saveSSN(String ssn) {
            this.studentSSN = ssn;
    }
    public void saveCoursePicked(String coursePicked) {
            this.coursePicked = coursePicked;
    }
}
