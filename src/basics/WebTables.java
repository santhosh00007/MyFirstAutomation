package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://www.espncricinfo.com/ci/engine/match/415281.html");
		WebElement table= driver.findElement(By.xpath("//*[@id='full-scorecard']/div[2]/div/table[1]"));
		
		//finding number of rows:
		List<WebElement> noofrows = table.findElements(By.tagName("tr"));
		System.out.println("number of rows:"+ noofrows.size());
		
		//finding no of columns in each row:
		int i=0;
		for(WebElement eachrow:noofrows){
			
			List<WebElement> eachcolumn = eachrow.findElements(By.tagName("td"));
			i++;
			System.out.println("no of columns in "+i+"th row are"+eachcolumn.size());
			//for finding cell value
			for (WebElement text:eachcolumn){
				System.out.println(text.getText());
			
		}
		
		
		
		
	}
	

}
}
