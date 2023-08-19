package ATPageLayer;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Registrationpage{
	WebDriver driver;

private By MyAccount_click = By.xpath("//a[text()='My Account']");

//private By Adt_click = By.xpath("//div[@id='dismiss-button']");

private By email_txt = By.xpath("//input[@id='reg_email']");

private By password_txt = By.xpath("//input[@id='reg_password']");

private By Register_btn = By.xpath("//input[@name='register']");

public Registrationpage(WebDriver driver)  {
	PageFactory.initElements(driver,this);	
}

public void clickon_MyAccount() throws InterruptedException {
	driver.findElement(MyAccount_click).click();
	Thread.sleep(4000);

	 
        }
        
//public void closeAdvatise() {

	

	  //driver.switchTo().frame(8);
	   //driver.switchTo().defaultContent();
	   //driver.switchTo().frame(9);
	   //driver.switchTo().defaultContent();
	   //driver.switchTo().frame(10);
	   //driver.findElement(Adt_click).click();
	   //driver.switchTo().defaultContent();
	
	//String mainwindow = driver.getWindowHandle();
    //Set<String> s1 = driver.getWindowHandles();
    //Iterator<String> i1 = s1.iterator();
    
    //while (i1.hasNext()) {
        //String ChildWindow = i1.next();
            //if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
            	
            
            	// driver.switchTo().window(mainwindow);
            	 
           
        //}
    //}    

    
  
	
	//String parentwindowID = driver.getWindowHandle();
	//Set<String> childwindowID = driver.getWindowHandles();
	
	//for(String ch :childwindowID) {
		//if(!parentwindowID.equalsIgnoreCase(ch)) {
			//driver.switchTo().window(ch);
			//driver.close();
		//}
		//driver.switchTo().window(parentwindowID);
		
	
	
	
	
	
	//driver.switchTo().frame("Blank");
	//driver.findElement(Adt_click).click();
	//driver.switchTo().defaultContent();
//}

public void enteremail(String email) {
	
	 driver.findElement(email_txt).sendKeys(email);
}

public void enterpassword(String password) {
	driver.findElement(password_txt).sendKeys(password);
}

public void clickonRegisterbutton() {
	driver.findElement(Register_btn).click();
}

}
