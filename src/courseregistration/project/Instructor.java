package courseregistration.project;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    public static List<String> studentsEnrolled = new ArrayList<String>();
    public Instructor() {}
    
    public static void addStudentEnrooledToInstructorList(String name) {
    studentsEnrolled.add(name);	
    }
}
