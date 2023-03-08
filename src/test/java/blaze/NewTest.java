package blaze;

import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demo.addToCart;
import demo.cartButton;
import demo.sonyXpheria5;

public class NewTest extends base{
	sonyXpheria5 s;
	addToCart ac;
	 cartButton cb;
	
	@BeforeMethod
	public void stepsTo() {
		launchTheBrowser();
 s= new sonyXpheria5(driver);
ac= new addToCart(driver);
  cb= new cartButton(driver);
	}
	
	
	@Test
  public void f() throws InterruptedException {
		Thread.sleep(1500);
		s.clickonsony();
		Thread.sleep(1500);
		ac.Cart(driver);
		Thread.sleep(1500);
		cb.ClickOnCartButton(driver);
		Thread.sleep(7500);
		driver.close();
  }
}
