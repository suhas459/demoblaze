package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sonyXpheria5 {

@FindBy(xpath="//a[text()='Sony xperia z5']") private WebElement sony;
	
	public sonyXpheria5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonsony() throws InterruptedException {
		Thread.sleep(1500);
		sony.click();
	}
	
	
	
	
	
	
	
	
}
