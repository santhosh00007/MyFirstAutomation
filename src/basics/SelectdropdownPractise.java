package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectdropdownPractise {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://www.spicejet.com/");
	driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")).click();
	//Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
	//dropdown.selectByIndex(4);
	
	
	
	
	
	
	
	
}
	
	
	
}
