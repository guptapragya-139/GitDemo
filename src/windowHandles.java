



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
    driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
    Set<String> window=driver.getWindowHandles();// we have stored all the window id's in this object named window
   // java.util.Iterator<String> i =window.iterator();
    Iterator<String> i =window.iterator();
    String parent=i.next();
    String child= i.next();
    driver.switchTo().window(child);
   
    System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());//since we need to break the email id text and extract the exact email id, so we will store this sentence in a variable named emailid
    
    driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
    String emailId= driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
    driver.switchTo().window(parent);
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(emailId);
    
    

	}

}
