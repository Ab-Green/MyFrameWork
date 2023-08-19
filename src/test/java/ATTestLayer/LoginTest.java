package ATTestLayer;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.atTestBase.TestBase;









public class LoginTest extends TestBase{

@Test	
public void LoginWithValid(){
String expected = "https://practice.automationtesting.in/my-account/";
String actual_url = driver.getCurrentUrl();
System.out.println(actual_url);
Assert.assertEquals(actual_url, expected);
System.out.println("Login Test Successfull");	

}

}
