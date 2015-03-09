package courseregistration.project;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RegistrationForm extends Frame implements ActionListener{

    private static final long serialVersionUID = 1L;
    protected String message = "";
    private Label  titleLabel  = new Label("Registration Form",Label.CENTER);
    private Label  nameLabel = new Label("Name:",Label.LEFT);
    private Label  ssnLabel = new Label("Social Security Number",Label.LEFT);
    private Label  courseOfferingsLabel = new Label("Courses:",Label.LEFT);

    public Button button = new Button("save");
    public TextField nameField = new TextField();
    public TextField ssnField = new TextField();
    public Choice course = new Choice();
    public static String coursePicked;

    Class currentClass = new Class();
    AccountsReceivable acc = new AccountsReceivable();
    Acknowledgment result = new Acknowledgment();
    
    public RegistrationForm() {

            addWindowListener(new myWindowAdapter());

            setBackground(Color.LIGHT_GRAY);
            setForeground(Color.BLUE);
            setLayout(null);

        add(titleLabel);
            add(nameLabel);
            add(ssnLabel);
            add(courseOfferingsLabel);
            add(nameField);
            add(ssnField);
            add(course);

            course.add(Course.courseOffereings[0]);
            course.add(Course.courseOffereings[1]);
            course.add(Course.courseOffereings[2]);
            course.add(Course.courseOffereings[3]);
            course.add(Course.courseOffereings[4]);
            course.add(Course.courseOffereings[5]);
            add(button);

            button.addActionListener(this);

            titleLabel.setBounds(100,40,280,20);
            nameLabel.setBounds(25,100,90,10);
            ssnLabel.setBounds(25,150,150,20);
            courseOfferingsLabel.setBounds(25,180,90,20);

            nameField.setBounds(180,100,170,20);
            ssnField.setBounds(180,150,170,20);
            course.setBounds(180,180,100,40);
            button.setBounds(180,230,80,35);
    }

    @Override
    public void paint(Graphics g){
            g.drawString(message,170,80);
            }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        Student student = new Student(nameField.getText(),ssnField.getText());
        coursePicked = course.getSelectedItem();
        double feeOwed = acc.getStudentFee(student.getStudentName());
        String courseSelected = student.getcoursePicked();
        String[] studentTranscript = student.getTranscript(student.getStudentName());     
        Course course = new Course();
        String coursePrerequite = course.getCoursePrequisites(courseSelected); 

        if(actionEvent.getActionCommand().equals("save")){
            
            System.out.println("###############");
            System.out.println("Registration Process");
            System.out.println("###############\n");
            
            //student sends form
            student.sendForm();
            
            //sanity check
            System.out.println( student.getStudentName() +"'s registration Form is sent to Registration Office");
            System.out.println("Student name : "+ student.getStudentName());
            System.out.println("Student ssn : "+ student.getStudentSSN());
            System.out.println("Course Picked : "+ student.getcoursePicked());
		  
            // inform student that registration form is saved
            showSaveMessage(); 
            
            // check account receivable
            System.out.println("\n >>>>Checking student account Receivable...\n");
              
            if(feeOwed == 0){
               System.out.println(student.getStudentName()+"'s fee from last quarter is "+feeOwed); 
               
               //check student transcript against course preRequisite
               System.out.println("\n >>>>Checking student transcript against course preRequisite... \n");
               
               Set<String> set = new HashSet<String>(Arrays.asList(studentTranscript));
               
               if(set.contains(coursePrerequite) || coursePrerequite.contains("none")){
                    System.out.println("course,  prerequisite(s) completed");
                    
                    //check class position availability
                    System.out.println("\n >>>>Checking class position availability...\n");
                    
                    if(currentClass.isPositionAvailable()){
                        currentClass.addStudentToClass(student);
                        result.showResult(coursePicked,
                                course.getCourseDate(coursePicked),
                                course.getCourseTime(coursePicked),
                                course.getCourseRoom(coursePicked),
                                course.getCourseTuition(coursePicked));
                        
                        //send students enrolled list to instructor
                        Instructor.addStudentEnrooledToInstructorList(student.getStudentName());
                    } 
                    else{
                        result.showAcknowlegement("course closed");
                    }
               }
               else{
                   //preRequisites not met
                    System.out.println("course,  prerequisite(s) not completed");
                    result.showAcknowlegement(student.getStudentName(), courseSelected, studentTranscript, coursePrerequite);
               }
           }else if(feeOwed == -1){
               result.showAcknowlegement(student.getStudentName()+ " does not exist in the database");
           }
            else{
                //send Bill to student
                acc.sendBill(student.getStudentName(), student.getAddress(student.getStudentName()), feeOwed);
                result.showAcknowlegement(student.getStudentName(), feeOwed);
            }
       }
    }   

    private void showSaveMessage() {
        message = "Registration Form saved!";
        setForeground(Color.DARK_GRAY);
    }
    public void showForm() {

            RegistrationForm  registrationForm = new RegistrationForm();
            registrationForm.setSize(new Dimension(400,300));
            registrationForm.setTitle("Student Registration Form");
            registrationForm.setVisible(true);

    }        
    class myWindowAdapter extends WindowAdapter{
            @Override
            public void windowClosing(WindowEvent we){
                     System.exit(0);
            }
    }

	
}

