package courseregistration.project;
import java.util.ArrayList;
import java.util.List;


public class Class {
	 
    protected static final int classSize = 30;
    protected int position = 0;
    protected boolean full = false ;

    protected List<Student> studentsClassList = new ArrayList<Student>();
    protected List<String> studentsClassSSNList = new ArrayList<String>();

    public Class() {}

    // if student successfully checked. add him to class list
    protected void addStudentToClass(Student student){
        if(studentsClassList.size() < classSize){
            if(!studentsClassSSNList.contains(student.getStudentSSN())){
                studentsClassList.add(student);
                position++;
                System.out.println("student current position in the class : "+ position);
                studentsClassSSNList.add(student.getStudentSSN());
            }else{
                System.out.println(student.getStudentName()+" already registered to the class.");
            }
        }
        else{
                full = true;
                System.out.println("Class is full. No more student can be added :\n full : "+full );
        }
    }

    protected boolean isPositionAvailable() {
        if(position < classSize){
            return true;
        }
        return false;
    }

    protected boolean isClassFull(){
        if(full == true){
            return true;
       }
       return false;
    }
}
