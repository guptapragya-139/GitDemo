import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoanframeLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.loanframe.com/");
		driver.findElement(By.xpath("//button[contains(text(), 'Get A Loan')]")).click();
		
		
		driver.findElement(By.className("select-box")).click();
		
		//Select businessDropdown= new Select(driver.findElement(By.xpath("//selectbox[@name='type']")));
		//businessDropdown.deselectByVisibleText("Proprietorship");
		driver.findElement(By.xpath("//div[contains(text(), 'Proprietorship')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='line line2 hairline']/span[1]/input[1]")).sendKeys("10");
		driver.findElement(By.xpath("//span[@class='line line3 hairline']/span[1]/input[1]")).sendKeys("474002");
		
		driver.findElement(By.xpath("//span[@class='line line4 hairline']/inlineeditbox/span[1]/input[1]")).sendKeys("2500000");
		
		////span[@class='line line5 hairline']/inlineeditbox/span[1]/input[1]-->months
		driver.findElement(By.xpath("//span[@class='line line5 hairline']/inlineeditbox/span[1]/input[1]")).sendKeys("11");
		//(//span[@class='select-box'])[2]-->select type 
		driver.findElement(By.xpath("(//span[@class='select-box'])[2]"));
		driver.findElement(By.xpath("//div[contains(text(), 'working capital')]")).click();
		////div[contains(text(), 'working capital')]-->working capital
		////span[@class='line line7 hairline']/inlineeditbox/span[1]/input[1]-->current annual revenue
		////span[@class='line line8 hairline']/inlineeditbox/span[1]/input[1]-->profit
		////button[contains(text(), 'Continue')]-->xpath
			////div[@class='btn-group form-group']/inlineeditbox/span[1]/input[1]
		////button[contains(text(), 'Apply Now')]--
		
		
		
		
		
		
	}

}
