package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeOfFooterDection {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com/");
		
		//Count of the Links in the Entire Page:
		
		System.out.println("Links in the Entire Page:");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Count of the Links in the Footer Section of the  Page:
		
		WebElement footer = driver.findElement(By.xpath("//*[@id='footerFragment']/div"));
		System.out.println("Links in the Footer Section Page:");
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement column = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]"));
		System.out.println("Links in the 2nd column :");
		System.out.println(column.findElements(By.tagName("a")).size());
		//System.out.println(column.findElements(By.tagName("a")).get(0).getText());
		
		for (int i=0;i<column.findElements(By.tagName("a")).size();i++) {
			
			//System.out.println(column.findElements(By.tagName("a")).get(i).getText());
			
			if(column.findElements(By.tagName("a")).get(i).getText().contains("Learn to sell")){
				System.out.println("Before clicking on:");
			          String before = driver.getTitle();
			
			          column.findElements(By.tagName("a")).get(i).click();
			          String after = driver.getTitle();
				
			          break;
							
		}
		
    
	}
	

}
}
