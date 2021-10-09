import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class AirindiaFlightBooking {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.airindia.in/Book-Flight.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		
		//Oneway trip
		driver.findElement(By.xpath("(//label[@class='label'])[1]")).click();//radio button
		driver.findElement(By.xpath("//label[@for='ddlFromLocation1']//preceding-sibling::input")).sendKeys("Bho");//from location
		Thread.sleep(5000);
		WebElement fromLocation= driver.findElement(By.xpath("//a[text()='Bhopal, Raja Bhoj Airport, BHO, India']"));
		
		Actions a= new Actions(driver);
		a.moveToElement(fromLocation).click().build().perform();
		
		
		driver.findElement(By.cssSelector("input#to")).sendKeys("Del");//to location
		Thread.sleep(5000);
		WebElement toLocation=driver.findElement(By.xpath("//a[text()='Delhi, Indira Gandhi International Airport, DEL, India']"));
		a.moveToElement(toLocation).click().build().perform();
		
		//*****Screenshot*******
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Prachi\\screenshot.png"));
		
		
		driver.findElement(By.xpath("//input[@title='Departing']")).click();
		WebElement date= driver.findElement(By.cssSelector("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']//a"));
		Thread.sleep(5000);
		a.moveToElement(date).click().build().perform();
		
		driver.findElement(By.xpath("//input[@id='rdrules1']//following-sibling::ins")).click();
		
	
		
		
		
		
		
		WebElement staticDropdown=driver.findElement(By.id("concessionaryType1"));
		Select dropdown=new Select(staticDropdown);
		
		dropdown.selectByValue("SeniorCitizen");
		
		
		
		
		
		
		
		
		
		
	}

}
