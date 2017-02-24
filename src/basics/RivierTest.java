package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RivierTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rivier.edu/");
		driver.findElement(By.linkText("MyRiv"));
		//driver.findElement(By.xpath("//div[id = 'cover']")).click();
	
		
		
		
		
		
		
		
	}
	
	

}
