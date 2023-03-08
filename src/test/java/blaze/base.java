package blaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
protected	WebDriver driver;
	public void launchTheBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
driver= new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
	}
	
}
