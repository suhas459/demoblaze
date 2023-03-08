package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartButton {

	@FindBy(xpath="//a[@id='cartur']") private WebElement crt;
	@FindBy(xpath="//button[text()='Place Order']") private WebElement place;
@FindBy(xpath="//input[@id='name']") private WebElement enterName;
@FindBy(xpath="//button[text()='Purchase']") private WebElement pur;
@FindBy(xpath="//input[@id='card']")  private WebElement creditCard;
@FindBy(xpath="//button[text()='OK']")  private WebElement OkButton;
public cartButton(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
	public void ClickOnCartButton(WebDriver driver) throws InterruptedException {
		crt.click();
		Thread.sleep(2500);
	//	driver.wait(1);
		place.click();
		Thread.sleep(2500);
		enterName.sendKeys("Pranay");
		Thread.sleep(2500);
		creditCard.sendKeys("1234569871234567");
		Thread.sleep(2500);
		pur.click();
		Thread.sleep(2500);
		OkButton.click();
	}
	
	
	
	
	
	
}
