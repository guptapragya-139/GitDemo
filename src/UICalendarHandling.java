import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UICalendarHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		//Select Month-->while loop runs till the condition is true as and when it becomes false the loop ends
		while(!driver.findElement(By.cssSelector("div.datepicker-days th.datepicker-switch")).getText().contains("November 2021"));
		driver.findElement(By.cssSelector("div.datepicker-days th.next")).click();
		
		
		//Select Date-->for loop runs till the situation is false as and when situation becomes true we need to break the loop using break
		//driver.findElement(By.cssSelector(".active.day")).click();
		int totalNumberOfDates= driver.findElements(By.cssSelector("td.day")).size();
		String actualDate= "25";
		
		
		for (int i=0; i<totalNumberOfDates; i++)
		{
		String dateValue= driver.findElements(By.cssSelector("td.day")).get(i).getText();
		if(dateValue.equals(actualDate))
		{
			driver.findElements(By.cssSelector("td.day")).get(i).click();
			break;
		}
		
		
			
			
		}
		
		
	}

}
