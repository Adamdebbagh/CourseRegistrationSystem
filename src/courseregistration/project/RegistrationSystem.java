package courseregistration.project;

public class RegistrationSystem {
	
	static RegistrationForm form = new RegistrationForm();
	static RegistrationManager rm = new RegistrationManager();
	public RegistrationSystem() {}

	public static void main(String[] args) {
	
		// 1- on launch, show student a registration Form.
		//    on form Submitted, send data to Registration Manager (clerk). 	
			form.showForm();
			
  }
}
