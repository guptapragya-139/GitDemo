import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);// driver here will use the capabilities of action class
		
		//1.)moves to specific element(but if we need to perform multiple actions on same element we will create a variable for that web Element which will store the location of that element) 
        //a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build().perform();
        
        //To enter a text in caps
        //a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("prachi").doubleClick().build().perform();
	
        //context or right click
        a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-orders']"))).contextClick().build().perform();
	
        
	}
	

}
