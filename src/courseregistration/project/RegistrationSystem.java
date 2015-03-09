package courseregistration.project;

public class RegistrationSystem {
	
    static RegistrationForm form = new RegistrationForm();
	
    public RegistrationSystem() {}
    
    public static void main(String[] args) {
            // on launch, show student a registration Form.
            form.showForm();                       
  }
}
