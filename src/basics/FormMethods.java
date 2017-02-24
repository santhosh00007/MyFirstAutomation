package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethods {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.makemytrip.com/flights");
	System.out.println("Before clicking on multicity radio button");
	System.out.println(driver.findElement(By.xpath("//*[@id='return_date_sec']")).isDisplayed());
	
	driver.findElement(By.xpath("//*[@id='multi_city_button']/span")).click();
	
	System.out.println(driver.findElement(By.xpath("//*[@id='return_date_sec']")).isDisplayed());
	
	System.out.println(driver.findElement(By.xpath("//*[@id='content']/div[2]/div/section[1]/div[2]/h3)")).getText());
	
	
	
	
	
}
}
