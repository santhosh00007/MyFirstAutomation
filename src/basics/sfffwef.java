package basics;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.os.WindowsUtils;

import com.sun.jna.platform.FileUtils;

public class sfffwef {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//FirefoxProfile profile = new FirefoxProfile();
		//profile.setAcceptUntrustedCertificates(false);
		
		//WebDriver driver = new FirefoxDriver (profile);
		
		
		//WindowsUtils.tryToKillByName("notepad.exe");
		driver.get("https://www.google.com");
		/*Set<Cookie> cookie= driver.manage().getCookies();
		System.out.println(cookie.size());
		//driver.manage().deleteAllCookies();*/
		
		File scrFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(scrFile, new File("C:\\Users\\hp\\Desktop"));
		
		
	}

}
