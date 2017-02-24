package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spinbot {
public static void main(String[] args) {
	
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	

driver.get("https://https://spinbot.com//");	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 System.out.println(driver.getPageSource().contains("iframe"));
 switchToFrame(driver);
}
	
public static  void switchToFrame(WebDriver driver){
	
	int framecount = driver.findElements(By.tagName("iframe")).size();
	
	for (int i = 0;i<framecount; i++){
		driver.switchTo().frame(i);
		
		int count = driver.findElements(By.xpath("//*[@id='recaptcha-anchor']")).size();
		if (count>0){
			driver.findElement(By.xpath("//*[@id='recaptcha-anchor']")).click();
		    break;
		} else{
			System.out.println("Continue looping");
		}
		
	}
	
}





}
