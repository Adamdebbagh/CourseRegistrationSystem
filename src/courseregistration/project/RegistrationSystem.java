package courseregistration.project;

public class RegistrationSystem {
	
	static RegistrationForm form = new RegistrationForm();
	static RegistrationManager rm = new RegistrationManager();
	static AccountsReceivable accountFee = new AccountsReceivable();
	public RegistrationSystem() {}

	public static void main(String[] args) {
	
		// 1- on launch, show student a registration Form.
		//    on form Submitted, send data to Registration Manager (clerk). 	
		if(RegistrationForm.sent == false){	
			form.showForm();
		}
		if(RegistrationForm.sent == true){	
			System.out.println( "Checking Accounts Receivable for Student owed fees...");	
		}	
  }
}
