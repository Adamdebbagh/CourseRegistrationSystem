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
	String msg = ""; 
	
	Label  titleLabel  = new Label("Registration Form",Label.CENTER);
	Label  nameLabel = new Label("Name:",Label.LEFT);
	Label  ssnLabel = new Label("Social Security Number",Label.LEFT);
	Label  courseOfferingsLabel = new Label("Courses:",Label.LEFT);
	
	Button button = new Button("save");
	TextField nameField = new TextField();
	TextField ssnField = new TextField();
	Choice course = new Choice();
	  

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
		  
		course.add("CS101");
		course.add("CS102");
		course.add("CS103");
		course.add("CS104");
		course.add("CS105");
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
		g.drawString(msg,170,80);
		}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		
		if(actionEvent.getActionCommand().equals("save")){
			msg = "Registration Form saved!";
		   setForeground(Color.DARK_GRAY); 
		   // get student Inputs
		   String studentName = nameField.getText();
		   String studentSSN = ssnField.getText();
		   String coursePicked = course.getSelectedItem();
		   System.out.println("student name : "+ studentName);
		   System.out.println("student ssn : "+ studentSSN);
		   System.out.println("student course : "+ coursePicked);
		   
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

