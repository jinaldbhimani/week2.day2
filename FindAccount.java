package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();		
		driver.get( "http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Find Accounts")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account" );
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']//a)[1]")).click();
		//String name = driver.findElement(By.xpath("(//input[@name='accountName'])[1]")).getText();
		//System.out.println("name");

		
//confused to get text
		

		
		
		

	}

}
