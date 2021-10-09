import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddingItemsToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prachi\\eclipse-workspace\\Introduction\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String[] veggiesNeeded= {"Beetroot","Cucumber","Carrot"};
		int k=0;
		
		List<WebElement> products=driver.findElements(By.xpath("//h4[@class='product-name']"));
		//format it to get actual vegetable name
		//convert array to arraylist
		//check whether name you extracted is present in arraylist or not
		
		for(int i=0;i<products.size();i++)

		{
			
			String[] name= products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List allItemsNeeded= Arrays.asList(veggiesNeeded);
			
			
			if(allItemsNeeded.contains(formattedName))
		    {
				k++;
				System.out.println(formattedName  );
			driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
			 if(k==3)
			 {
		      break;
			}
					}
	} 
		driver.findElement(By.xpath("//a[@class='cart-icon']//img")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		
	WebElement staticdropdown= driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"));
	 
		Select dropdown= new Select(staticdropdown);
		dropdown.selectByValue("India");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		System.out.println(driver.findElement(By.xpath("//input[@class='chkAgree']")).isSelected());
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@class='chkAgree']")).isSelected());
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		
		
	}
}


