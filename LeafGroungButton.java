package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroungButton {

	public static void main(String[] args) {
		   WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://leafground.com/pages/Button.html");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.manage().window().maximize();
		   driver.findElement(By.id("home")).click();
		  System.out.println(driver.findElementById("position").getLocation()); //driver.findElement(By.id("position")).getLocation();
			

	       
			
	}

}
