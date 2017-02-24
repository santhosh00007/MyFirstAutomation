package basics;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesPractise {
public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.spotify.com/us/signup/");
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	int number =findFrameNumber(driver,By.xpath("//div[@clsss='recaptcha-checkbox-checkmark']"));
	driver.switchTo().frame(number);
	driver.findElement(By.xpath("//div[@clsss='recaptcha-checkbox-checkmark']")).click();
	/*driver.switchTo().defaultContent();
	int number1 =findFrameNumber(driver,By.xpath("//*[@id='recaptcha-anchor']/div[5]"));
	driver.switchTo().frame(number1);*/
	
}

public static int findFrameNumber(WebDriver driver, By by) throws InterruptedException{
	int i;
	int framecount=driver.findElements(By.tagName("iframe")).size();
	for( i=0; i<framecount; i++ ){
	      driver.switchTo().frame(i);	
		int count=driver.findElements (by).size();
		//Thread.sleep(3000);
		if(count>0){
			
			break;
			
		}else{
			System.out.println("continue looping");
		}
		
		
	}
	
	driver.switchTo().defaultContent();
	return i;
}








}
