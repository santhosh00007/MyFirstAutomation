package basics;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SuseLabTest {
	
	@Test
	public void setup () throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities().firefox();
		dc.setCapability("version", "5");
		dc.setCapability("platform", "XP");
WebDriver driver = new RemoteWebDriver(new URL("http://santhosh00007:94d46354-9adb-429b-ad82-9194e2a410bc@ondemand.saucelabs.com:80/wd/hub"), dc);
/*driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());*/

driver.get("https://www.facebook.com/");
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

//	Thread.sleep(3000);

WebElement login =driver.findElement(By.xpath("//*[@id='loginbutton']"));

abc.moveToElement(login).click().build().perform();
System.out.println("After Swithcing to Parent window:");

driver.switchTo().window(parentId);

System.out.println(driver.getTitle());

driver.close();


		
	}

}
