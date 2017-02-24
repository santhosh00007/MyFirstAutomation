package basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FromsSubmit {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.spicejet.com/");
	
	/*driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='DEL']")).click();*/
	
	Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
	dropdown.selectByVisibleText("3 Adults");
	dropdown.selectByValue("9");
	driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).click();
	System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	
	
	
	
	
	
	
	
	
	
	
}
}
