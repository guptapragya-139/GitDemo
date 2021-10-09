import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropdownLoopingUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
//Dropdowns		
		// on the webpage we opened, we got static dropdown only
		/*
		 * WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		 *  Select dropdown=new Select(staticDropdown); 
		 *  dropdown.selectByIndex(4);
		 */

		// When we have to click on +sign (or any other sign to add) for n no. of times
		// While Loop
		/*
		 * int i=1; while(i<5) {
		 * driver.findElement(By.id("hrefIncAdt")).click();//4times i++; }
		 */

		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//to
		// print the default value before selecting an option from dropdown

		/*
		 * For Loop for(int i=1;i<5;i++) {
		 * driver.findElement(By.id("hrefIncAdt")).click(); }
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 */// to print selected value

//Checkboxes 
		System.out.println(
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());// will either give true por false,here it will give false since no checkbox is selected
																													
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();// to click the
																										// checkbox
		System.out.println(
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());// will give true as an o/p since checkbox is selected
																													

		// Counting the number of checkboxes
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());// to get the number of
																								// checkboxes

		// Enabled and Disabled
		System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']//parent::div")).getAttribute("style"))  ;//o/p should be false ideally but on this site since thats enabled it will be true

		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1mf7evn r-1otgn73'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']//parent::div")).getAttribute("style"));
		Assert.assertTrue(true);//to verify if our script passes or fails--> in this case it should pass and to fail the script write Assert.assertTrue(false), the script will fail
		//to get the value of attribute
		
		
			if(driver.findElement(By.xpath("//div[text()='Return Date']//parent::div")).getAttribute("style").contains("0.5"))
			{
				System.out.println("its enabled");
				Assert.assertTrue(true);
				
			}
			
			else
			{
				Assert.assertTrue(false);
				
			}

		}

	}


