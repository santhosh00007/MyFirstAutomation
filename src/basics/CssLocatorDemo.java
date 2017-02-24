package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.findElement(By.xpath("/html/body/header/div/div[1]/div/div/nav/div[1]/div/div[2]/div[4]/div/div/a/span[2]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shuhbs");
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		
		
		
		
		
	}
	
	
	

}
