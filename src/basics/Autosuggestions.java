package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestions {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebDriverWait wd = new WebDriverWait(driver, 10);
	
	driver.get("https://fantasycricket.dream11.com/in/");
	driver.findElement(By.xpath("//*[@id='m_rtxtEmail1']")).sendKeys("san");
	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='m_frmRegister']/div[1]/ul")));
	
	driver.findElement(By.xpath("//*[@id='m_frmRegister']/div[1]/ul/li[2]/p")).click();
	
	
	
	
}

}
