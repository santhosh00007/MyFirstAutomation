package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http:http://www.hdfcbank.com/");
	driver.findElement(By.xpath("//*[@id='element2']/div[1]/div/div[5]/div[1]/div[2]/div[1]/div/div[1]")).click();
	driver.findElement(By.xpath("//*[@id='netbanking']")).click();
	
	//System.out.println(driver.getPageSource());
	
	
	
}
}
