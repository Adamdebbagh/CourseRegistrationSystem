package courseregistration.project;

import java.util.ArrayList;
import java.util.List;

public class AccountsReceivable {
	
        // this Class interfaces an Accounting database residing on a remote server.
	// i am only going to emulate its function in the simplest way !  
	//fake database. represented as an arrayList of { names & fees } 
        
    List<StudentBalance> studentsBalance = new ArrayList<StudentBalance>();
	
    public class StudentBalance {
        protected double feeOwed;
        protected String name;
        
    public StudentBalance(String name,double feeOwed){	
	this.name = name;
	this.feeOwed = feeOwed;
	}
    }
    public AccountsReceivable() {
        studentsBalance.add(new StudentBalance("adam",0));
        studentsBalance.add(new StudentBalance("giuseppe",0));
	studentsBalance.add(new StudentBalance("solomon",0));
	studentsBalance.add(new StudentBalance("carlos",0));
	studentsBalance.add(new StudentBalance("wade",750.89));}	
    public double getStudentFee(String name){
		
	for(StudentBalance student:studentsBalance){
            // if student exist, then check his balance
            if(student.name.equals(name)){
		if (student.feeOwed != 0){
                    return student.feeOwed;
		}else{
                    System.out.println("student does not owe anything");	
                    return 0;
		}
            }		
	}
	return -1;
		
	}
    protected void sendBill(String studentName, String adress, double fee) {
	
        System.out.println("Bill sent to : ");
        System.out.println("Student Name : "+ studentName );
        System.out.println("Adreess :" + adress);
        System.out.println("fee Owed :" +fee);
    }
		
}
