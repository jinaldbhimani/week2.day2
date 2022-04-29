package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTcreateaccount {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		WebElement dropdown = driver.findElement(By.id("currencyUomId"));
		Select currency=new Select(dropdown);
		currency.selectByValue("INR");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("RBC");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("St.marys");
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[5]")).sendKeys("20000");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		 
	      
		  
String error = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		System.out.println(error);
		if (error.contains(" "))
				{
			System.out.println("error msg is displayed");
			}
		else {
			System.out.println("error msg is displayed");
		}
		String title = driver.getTitle();
	}

}
