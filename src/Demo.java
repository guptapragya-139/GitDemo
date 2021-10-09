import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //selenium code-
		
		//Create Driver Object 
		
		//We will strictly impliment methods of WebDriver 
		
		/* Class name= ChromeDriver
		 X driver= new X();
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://google.com");
		driver.get("http://en-gb.facebook.com");
		//driver.findElement(By.xpath("//*[text() = 'English (US)']")).click();
		driver.findElement(By.name("email")).sendKeys("guptaprachi0304@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Merif@mily0304");
		//driver.findElement(By.linkText("forgot password?")).click();
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
