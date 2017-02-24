package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/SignUp");
	
	driver.findElement(By.linkText("Learn more")).click();
	System.out.println("Before Switching to child window");
	System.out.println(driver.getTitle());
	Set<String> ids = driver.getWindowHandles();
	Iterator<String> itr = ids.iterator();
	String  parentid = itr.next();
	String childid = itr.next();
	driver.switchTo().window(childid);
	System.out.println("After switching to child:");
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//button[@data-value='5']")).click();
	driver.switchTo().window(parentid);
	System.out.println("after swithing back to parent:");
	System.out.println(driver.getTitle());
	
	
}
}
