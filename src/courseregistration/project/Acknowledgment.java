package courseregistration.project;


import java.util.List;
import courseregistration.project.Course.PreRequite;
import java.util.Arrays;

public class Acknowledgment {

    List<PreRequite> prerequisites;
    
    public Acknowledgment() {}

    protected void showResult(String course,String day,String time,String room,double tuition){
        System.out.println("\n ACKNOWLEDGMENT");
        System.out.println("\n \n Thank you for registering for " + course +" course\n");
        System.out.println("\n Calss Details :");
        System.out.println("The Course will lauch on: " + day + "at "+ time);
        System.out.println(" The course will be taken place at room : "+ room);
        System.out.println(" The current course tuition is: "+ tuition);
        System.out.println("\n We wish you good learning Experience! ");	
    }
    protected void showAcknowlegement(String name,double feeOwed){
        System.out.println("\n ACKNOWLEDGMENT \n");
        System.out.println(name +" cannot be registered until all fees are paid");
        System.out.println("Amount due is : "+ feeOwed);
    }
    protected void showAcknowlegement(String name, String courseSelected, String[] studentTranscript, String coursePrerequite) {
        System.out.println("\n ACKNOWLEDGMENT \n");
        System.out.println(name+" picked : "+ courseSelected);
        System.out.println(name+"'s transcript  : "+ Arrays.toString(studentTranscript));
        System.out.println("the course : " + courseSelected +","+" has the following preRequisite : "+ coursePrerequite);
        System.out.println(name+" can not be registered until prequisites are filled");
}
    protected void showAcknowlegement(String message){
        System.out.println("\n ACKNOWLEDGMENT \n");
        System.out.println(message);
    }
}
