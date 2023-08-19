package ATTestLayer;



import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import ATPageLayer.Registrationpage;





public class RegistrationTestpage{

	WebDriver driver;
	

	@Test
	public void VerifyRegistrationFuntionalitywithValidCre() throws InterruptedException {
		Registrationpage reg = new Registrationpage(driver);
		
		reg.clickon_MyAccount();
		//reg.closeAdvatise();
		reg.enteremail("bansode481@gmail.com");
		reg.enterpassword("Qwertyuiop#123456789011");
		reg.clickonRegisterbutton();
		System.out.print("User Successfully Register Sign-in");
	}

}
