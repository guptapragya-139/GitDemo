import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class PractiseExerciseSelectCB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prachi\\eclipse-workspace\\Introduction\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement requiredCheckboxOption=driver.findElement(By.id("checkBoxOption3"));
		requiredCheckboxOption.click();
		System.out.println(requiredCheckboxOption.getText());
		
		
		//to scroll window down
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//to fetch data from a column in a table and converting stored string to integer and then sum the integers together
		int sum=0;
	List<WebElement> values=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
	for (int i=0; i<values.size();i++)
		
		
		
		
		
	{
	sum=sum+ Integer.parseInt((values.get(i).getText()));
		
	}
		
     System.out.println(sum);
     System.out.println(driver.findElement(By.className("totalAmount")).getText());
    int totalValue= Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
    Assert.assertEquals(sum, totalValue);
	}

}
