package com.atTestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ATPageLayer.LoginPage;
import ATPageLayer.Homepage;

import ATPageLayer.ShopPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public LoginPage login;
	public  Homepage home;
	public  ShopPage shop;
	
	
	@BeforeMethod
	public void setup() {
    String browser = "chrome";
    
	if(browser.equalsIgnoreCase("chrome")) {	
	WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		
	}
	else if(browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	}
	else {
      System.out.println("Please enter valid browser");
	}
	
	driver.navigate().to("https://practice.automationtesting.in/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
	

    login = new LoginPage();
    home = new Homepage();
    shop = new ShopPage();
	login.clickonMyAccount();
	login.enterusername("sbakash022@gmail.com");
	login.enterpassword("Akashbansode");
	login.clickonlogingbtn();
	}
	


@AfterMethod
public void teardown() {
	
        driver.quit();
    
	
}

}