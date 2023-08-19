package ATPageLayer;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.atTestBase.TestBase;





public class Homepage extends TestBase{
	

	 
	
	 public Homepage() {
		 PageFactory.initElements(driver,this);
	 }
	 private By shopmenu_btn = By.xpath("//a[text()='Shop']");
		//private By homemenu_btn = By.xpath("//a[text()='Home']");
		private By sliders_btn = By.xpath("//img[@data-hack='data-lazy-src']");
	 public void clickOnshopmenu() {
		 
		 driver.findElement(shopmenu_btn).click();
	 }
	 
	 //public void clickOnhomemenu() {
		 
		// driver.findElement(homemenu_btn).click();
	 //}
	 public void clickOnslider() {
		 for(int i=0; i<3; i++) {
		driver.findElement(sliders_btn).click();
		
		 } 
	 }

	 public void NewArrivals() throws IOException {
		 JavascriptExecutor j1 = ((JavascriptExecutor)driver);
		 j1.executeScript("scrollBy(0,300)");
		 String path ="D:\\velocity9julyTraining\\NewJavaBasic-Workspace-2022\\ATProjectPractice\\NewScreenshot\\My1.png"; 
		 TakesScreenshot s2 = ((TakesScreenshot)driver);
		 File src = s2.getScreenshotAs(OutputType.FILE);
		 File des = new File(path);
		 FileHandler.copy(src, des);
		 
		 
		 
	 }
}
