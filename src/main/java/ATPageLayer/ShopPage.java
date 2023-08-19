package ATPageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.atTestBase.TestBase;

public class ShopPage extends TestBase {

	

	
	
	 public ShopPage(){
		
		 PageFactory.initElements(driver,this);

	}
	 private By homemenu_btn = By.xpath("//a[text()='Home']");
	 
 public void clickOnhomemenu() {
		 
		 driver.findElement(homemenu_btn).click();
	 }

}
