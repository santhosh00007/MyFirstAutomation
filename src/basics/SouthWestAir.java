package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SouthWestAir {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
driver.get("https://www.southwest.com/");
//Assert.assertFalse((driver.findElement(By.xpath("//*[@id='air-date-return']")).isEnabled()));
System.out.println(driver.findElement(By.xpath("//*[@id='air-date-return']")).isEnabled());
driver.findElement(By.xpath("//input[@id='air-date-departure']")).click();
driver.findElement(By.xpath("//td[@data-day='28']")).click();
driver.findElement(By.xpath("//*[@id='air-pax-count-adults']")).click();
int i = 0 ;
while (i<5){
	driver.findElement(By.xpath("//*[@id='jb-number-selector-more']")).click();
	i++;
	
}


		
		
		
		
		
	}
	
	

}
