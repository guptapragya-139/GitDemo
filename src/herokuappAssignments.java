import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class herokuappAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		//nestedFrames
		
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		//driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name='frameset-middle']")));
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name='frameset-middle']//frame[2]")));
		//System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		
		
		
		driver.switchTo().frame("frame-top");  
		driver.switchTo().frame("frame-middle");
		String m=driver.findElement(By.id("content")).getText();
		System.out.println(m);
		
		
		
		
		
		
		
		
	}

}
