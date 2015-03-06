package courseregistration.project;

import java.util.ArrayList;
import java.util.List;

public class AccountsReceivable {
	// this Class interfaces an Accounting database residing on a remote server.
	// i am only going to emulate its function in the simplest way !  
	
	//fake database. represented as an arrayList of { names & fees } 

	public class StudentAccount {
	protected double feeOwed;
	protected String name;
	public StudentAccount(String name,double feeOwed){	
		this.name = name;
		this.feeOwed = feeOwed;
		}
	}
		
	List<StudentAccount> studentsData = new ArrayList<StudentAccount>();

	public AccountsReceivable() {

		studentsData.add(new StudentAccount("adam",0));
		studentsData.add(new StudentAccount("giusepee",1000));
		studentsData.add(new StudentAccount("solomon",500));
		studentsData.add(new StudentAccount("carlos",0));
		studentsData.add(new StudentAccount("waden",100));
	}
	
	public double getStudentFee(String studentName){
		
		for(StudentAccount student:studentsData){
			// if student exist, then check his balance
			if(studentName == student.name){
				if (student.feeOwed != 0){
					return student.feeOwed;
				}else{
					System.out.println("student does not owe anything");	
					return 0;
				}
			}		
		}
		System.out.println("student does not exist in the database");
		return 0;
		
	}
		
}
