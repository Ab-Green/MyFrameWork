package ATPageLayer;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;

import com.atTestBase.TestBase;

public class LoginPage extends TestBase {


public LoginPage() {
	PageFactory.initElements(driver,this);
}
private By MyAccount_btn= By.xpath("//a[text()='My Account']");

private By  user_name = By.xpath("//input[@name='username']");

private By  password = By.xpath("//input[@id='password']");

private By login_Btn = By.xpath("//input[@name='login']");


public void clickonMyAccount() {
	driver.findElement(MyAccount_btn).click();
}
public void enterusername(String username) {
	driver.findElement(user_name).sendKeys(username);
}
public void enterpassword(String pwd) {
	driver.findElement(password).sendKeys(pwd);	
}
public void clickonlogingbtn() {
	driver.findElement(login_Btn).click();
	
}


}
