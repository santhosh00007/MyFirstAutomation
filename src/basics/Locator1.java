package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	/*driver.findElement(By.id("email")).sendKeys("santhosh00007@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("126455");
	driver.findElement(By.id("u_0_q")).click();
	driver.findElement(By.linkText("Forgot Password?")).click();*/
	driver.findElement(By.tagName("<a"));
	
	
	
	
	
}
}
