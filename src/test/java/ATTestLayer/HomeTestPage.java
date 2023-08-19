package ATTestLayer;


import java.io.IOException;

import org.testng.annotations.Test;

import com.atTestBase.TestBase;






public class HomeTestPage extends TestBase {
	@Test
	public void ToVerifySlider() {
		home.clickOnshopmenu();
		shop.clickOnhomemenu();
		home.clickOnslider();
	}
	@Test
   public void ToverifyNewArrivals() throws IOException {
	   home.clickOnshopmenu();
	   shop.clickOnhomemenu();
	   home.NewArrivals();
   }
}
