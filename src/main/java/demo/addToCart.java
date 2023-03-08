package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCart {

@FindBy(xpath="//a[text()='Add to cart']")	 private WebElement add;
	
public addToCart(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
public void Cart(WebDriver driver) throws InterruptedException {
	Thread.sleep(1500);
	add.click();
	Thread.sleep(1500);
	Alert a= driver.switchTo().alert();
	a.accept();
}
	
	
	
}
