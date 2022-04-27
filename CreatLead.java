package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatLead {

	public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver=new ChromeDriver();
       driver.get("http://leaftaps.com/opentaps/control/login");
   	   driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	   driver.findElement(By.id("password")).sendKeys("crmsfa");
	   driver.findElement(By.className("decorativeSubmit")).click();
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Create Lead")).click();
	   driver.findElement(By.xpath("(//input[contains(@id,'companyName')][1])")).sendKeys("TestLeaf");
	   driver.findElement(By.xpath("(//input[contains(@id,'firstName')])[1]")).sendKeys("Jinal");
	   driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Bhimani");
	   driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("sevya");
	   driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("savaliya");
	   driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing ");
	   driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("i am working as Tester ");
	   driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("jinal93bhimani@gmail.com ");
	   WebElement findElement = driver.findElement(By.name("generalStateProvinceGeoId"));
	   Select province=new Select(findElement);
	   province.selectByVisibleText("New York");
	   driver.findElement(By.name("submitButton")).click();

	   

	   


	  

	   

	

	   

	   
	   
	}

}
