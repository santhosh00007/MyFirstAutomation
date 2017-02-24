package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomisedXpath {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("santhosh00007@gmail.com");
	
	
	
	
	
	
	
}
}
