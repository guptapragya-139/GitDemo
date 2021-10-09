
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginLoanFrame1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.loanframe.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(), 'Get A Loan')]")).click();
		
		
		driver.findElement(By.className("select-box")).click();
		
		driver.findElement(By.xpath("//div[contains(text(), 'Proprietorship')]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='line line2 hairline']/span[1]/input[1]")).sendKeys("10");
		driver.findElement(By.xpath("//span[@class='line line3 hairline']/span[1]/input[1]")).sendKeys("474002");
		
		driver.findElement(By.xpath("//span[@class='line line4 hairline']/inlineeditbox/span[1]/input[1]")).sendKeys("2500000");
		
		driver.findElement(By.xpath("//span[@class='line line5 hairline']/inlineeditbox/span[1]/input[1]")).sendKeys("11");
		driver.findElement(By.xpath("//span[text()='select ']")).click();
		driver.findElement(By.xpath("//div[text()='repay existing loan']")).click();
		driver.findElement(By.xpath("//span[@class='line line7 hairline']/inlineeditbox/span[1]/input[1]")).sendKeys("2000000");
		driver.findElement(By.xpath("//span[@class='line line8 hairline']//inlineeditbox//span//input")).sendKeys("1000000");
		driver.findElement(By.xpath("//button[text()=' Continue ']")).click();
		
		
		//Next Screen :don't have scenario
		driver.findElement(By.xpath("//span[text()='have ']")).click();
        driver.findElement(By.xpath("//div[text()=\"don't have\"]")).click();
		
		//Have Scenario
		//driver.findElement(By.xpath("//span[starts-with(text(),' that has ')]//div//inlineeditbox//span//input")).sendKeys("2500000");
		
		//Apply Now Button
		driver.findElement(By.xpath("//button[text()=' Apply Now ']")).click();
		
		
		driver.switchTo().activeElement();
		Thread.sleep(1000);
		
		//Registration through email
		driver.findElement(By.xpath("//button[text()=' Email ']")).click();
		//driver.switchTo().activeElement();
	    //Thread.sleep(1000);
		
		//Details for registration through email
	    driver.findElement(By.xpath("//label[text()=' First Name']//preceding-sibling::input")).sendKeys("Khushboo");
	    driver.findElement(By.xpath("//label[text()=' Last Name']//preceding-sibling::input")).sendKeys("Shah");
	    driver.findElement(By.xpath("//label[text()=' Email Address']//preceding-sibling::input")).sendKeys("KS139@gmail.com");
	    driver.findElement(By.xpath("//label[text()=' New Password']//preceding-sibling::input")).sendKeys("Password@139");
	    driver.findElement(By.xpath("//label[text()=' Confirm Password']//preceding-sibling::input")).sendKeys("Password@139");
	    driver.findElement(By.xpath("//label[starts-with(text(),'By clicking')]//input")).click();
	    driver.findElement(By.xpath("(//button[text()=' CONTINUE '])[2]")).click();
	    //driver.findElement(By.xpath("(//button[text()=' BACK '])[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//label[text()=' mobile number']//preceding-sibling::input")).sendKeys("1234567890");
		
		
		
  }
}
