package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrwoserInvocation {
public static void main(String[] args)  {

	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.qaclickacademy.com/");// to hit the url in browser
	System.out.println(driver.getTitle());
	//System.out.println(driver.getPageSource());
	System.out.println(driver.getCurrentUrl());
	driver.close();*/
	//System.setProperty(key, value)
	WebDriver driver =new InternetExplorerDriver();
	driver.get("https://www.google.com");
	
	
	
	
	
	
}	
	


}
