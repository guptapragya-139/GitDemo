import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.cssSelector("iframe.demo-frame")).size());
		
		Actions a=new Actions(driver);
		WebElement source= driver.findElement(By.cssSelector("div#draggable"));
		WebElement target= driver.findElement(By.cssSelector("div#droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		
	}

}
