package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	/*driver.findElement(By.xpath("//*[@id='email']")).sendKeys("santhosh00007@gmail.com");
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("125");
	driver.findElement(By.xpath("//*[@id='u_0_q']")).click();
	
	driver.findElement(By.linkText("Forgot Password?")).click();
	driver.findElement(By.linkText("No longer have access to these?")).click();
	driver.findElement(By.xpath("//*[@id='u_0_0']/div/div[3]/div/div[1]/a")).click();*/
	
	driver.findElement(By.linkText("Data Policy")).click();
	System.out.println("Before Swithcing the window:");
	System.out.println(driver.getTitle());
	Set<String> ids = driver.getWindowHandles();
	Iterator<String> itr =ids.iterator();
	String parentId =  itr.next();
	String childId = itr.next();
	
	driver.switchTo().window(childId);
	System.out.println("After Swithcing to child window:");
	System.out.println(driver.getTitle());
	Actions abc= new Actions(driver);
	//WebElement down = driver.findElement(By.xpath("//*[@id='u_0_z']/div[1]/i"));
	//abc.moveToElement(down).click().build().perform();
	
	WebElement joinOrSignUP = driver.findElement(By.xpath("//*[@id='u_0_0']/span"));
	
	abc.moveToElement(joinOrSignUP).click().build().perform();
	WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
	abc.moveToElement(email).click().sendKeys("santhosh00007@gmail.com").build().perform();
	
	WebElement pass = driver.findElement(By.xpath("//*[@id='pass']"));
	abc.moveToElement(pass).click().sendKeys("123456").build().perform();
	
	Thread.sleep(3000);
	
	WebElement login =driver.findElement(By.xpath("//*[@id='loginbutton']"));
	
	abc.moveToElement(login).click().build().perform();
	System.out.println("After Swithcing to Parent window:");
	
	driver.switchTo().window(parentId);
	
	System.out.println(driver.getTitle());
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
}
}
