package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.WebWindow;

public class ActionsExamples {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");

   Actions abc= new Actions(driver);		
	WebElement element = driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']"));
   
   abc.moveToElement(element).build().perform();
   WebElement xyz=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
   abc.keyDown(Keys.SHIFT).moveToElement(xyz).click().sendKeys("headphones").build().perform();
   abc.contextClick(xyz).build().perform();
		
		
		
	}
	

}
