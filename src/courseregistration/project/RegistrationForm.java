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

public class RegistrationForm extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	protected String message = "";
	public static boolean sent = false;
	
	
	private Label  titleLabel  = new Label("Registration Form",Label.CENTER);
	private Label  nameLabel = new Label("Name:",Label.LEFT);
	private Label  ssnLabel = new Label("Social Security Number",Label.LEFT);
	private Label  courseOfferingsLabel = new Label("Courses:",Label.LEFT);
	
	public Button button = new Button("save");
	public TextField nameField = new TextField();
	public TextField ssnField = new TextField();
	public Choice course = new Choice();
	public static String coursePicked;
	  

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
	
	public void paint(Graphics g){
		g.drawString(message,170,80);
		}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		
		Student student = new Student(nameField.getText(),ssnField.getText());
		coursePicked = course.getSelectedItem();
		
		if(actionEvent.getActionCommand().equals("save")){
			message = "Registration Form saved!";
			setForeground(Color.DARK_GRAY); 				
			student.sendForm();
			//rm.addStudentToList(rm.getStudentName());
			System.out.println( student.getStudentName() +"'s registration Form is sent to Registration Office");	
			sent = true;		   			
			
		   }
		}

	public void showForm() {
		
		RegistrationForm  registrationForm = new RegistrationForm();
		registrationForm.setSize(new Dimension(400,300));
		registrationForm.setTitle("Student Registration Form");
		registrationForm.setVisible(true);
		
	}
	
	class myWindowAdapter extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			 System.exit(0);
		}
	}

	
}

