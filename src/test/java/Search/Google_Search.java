package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google_Search {
		
		@Test
		public void Verify_Search() throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[name='q'")).click();
			driver.findElement(By.xpath("//input[name='q'")).sendKeys("Dhaka wiki");
			driver.findElement(By.xpath("//input[name='btnK'")).submit();
			// By Borkot
			driver.quit();
			
			
	  }

}
