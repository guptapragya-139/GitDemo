import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.xpath("//a[@value='BHO']")).click();
		//driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();
		
		//Parent-Child Relationship(to be used in place of indexes-->but here we use only xpath)
		
		driver.findElement(By.xpath("//td[@class='mapbg']//a[@value='JAI']")).click();//other way to write xpath for 'to city' using parent child relationship
		
		
		
		
		
	}

}
