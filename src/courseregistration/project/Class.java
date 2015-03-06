package courseregistration.project;
import java.util.ArrayList;
import java.util.List;

public class Class {
	
	protected static final int classSize = 30;
	protected int position = 0;
	protected boolean full = false ;
	
	protected List<Student> studentsList = new ArrayList<Student>();
	
	public Class() {}
	
	// if student successfully checked. add him to class list
	@SuppressWarnings("unused")
	private void addStudentToList(Student student){
		if(studentsList.size() <= classSize){
			studentsList.add(student);
			position++;
			System.out.println("stuent current position in the class : ");
		}
		else{
			full = true;
			System.out.println("Class is full. No more student can be added :\n full : "+full );
		}
	}
	@SuppressWarnings("unused")
	private boolean isPositionAvailable() {
		if(position <= classSize){
			return true;
			}
		return false;
	}
	@SuppressWarnings("unused")
	private boolean isClassFull(){
		if(full == true){
			return true;
			}
		return false;
	}
	

}
