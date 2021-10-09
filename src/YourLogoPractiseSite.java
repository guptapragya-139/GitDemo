import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourLogoPractiseSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://phptravels.com/hotels-module-features/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Demo']")).click();
		
		
		driver.findElement(By.xpath("//a[@href='//www.phptravels.net']")).click();
		Thread.sleep(3000);
		//driver.switchTo().window("PHPTRAVELS - PHPTRAVELS"); with alone this we were getting navigated back to parent window
		Set<String> window =driver.getWindowHandles();//set is a storing variable
		
      java.util.Iterator<String> i =window.iterator();
      String parent= i.next();
      String child= i.next();
      driver.switchTo().window(child);
        
		
		WebElement cityName=driver.findElement(By.xpath("//span[@aria-labelledby='select2-hotels_city-container']/span"));
		
		//CityNAme
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(cityName).click().sendKeys("gwalior").build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@id='select2-hotels_city-results']/li")).click();
		
		//without using action class
		//driver.findElement(By.xpath("//div[@class='input-wrapper']//div//div")).click();
		//driver.findElement(By.xpath("//span[@aria-labelledby='select2-hotels_city-container']/span")).sendKeys("mum");
		
	    
		//Thread.sleep(6000);
	
		//travellers--(1)
		driver.findElement(By.xpath("//span[text()='Rooms ']")).click();
		for (int i1 =1;i1<3;i1++)
				{
			driver.findElement(By.xpath("//div[@class='roomInc']//i")).click();
				}
		
		for (int j =1;j<3;j++)
		{
			driver.findElement(By.xpath("(//div[@class='qtyBtn d-flex align-items-center']//div[2]//i)[2]")).click();
		}
				
		/*  OR--(2)
		WebElement travellers=driver.findElement(By.xpath("(//div[@class='qtyBtn d-flex align-items-center']//div[2]//i)[2]"));
		Actions a1= new Actions(driver);
		a1.moveToElement(travellers).click().build().perform();*/
		System.out.println(driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-btn travellers waves-effect']")).getText());
		
		
		/*Checkin
				driver.findElement(By.xpath("//input[@id='checkin']")).click();
				driver.findElement(By.xpath("//td[@class='day  active']")).click();
				System.out.println(driver.findElement(By.xpath("//input[@id='checkin']")).getText());
				driver.findElement(By.xpath("(//td[@class='day  active'])[2]")).click();
				//driver.findElement(By.xpath("//td[@class='day  active']")).click();    */
		
		
				
		//Search 
				//driver.findElement(By.xpath("(//button[@id='submit']//span//i)[1]")).click();
		
		driver.findElement(By.cssSelector("input#checkin")).click();
		
				
		  
	}

}
