package SoftwareTestingTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndNavigationTest {
	
	 public static void main(String[] args) throws InterruptedException {

	        // Step 1: Launch Browser
	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Step 2: Open Application
	        driver.get("https://demowebshop.tricentis.com/");

	        // Step 3: Click on Login Link
	        driver.findElement(By.linkText("Log in")).click();

	        // Step 4: Enter Email
	        driver.findElement(By.id("Email")).sendKeys("rohanranpise143@gmail.com");

	        // Step 5: Enter Password
	        driver.findElement(By.id("Password")).sendKeys("Rohan@123");

	        // Step 6: Click Login Button
	        driver.findElement(By.cssSelector("input[value='Log in']")).click();

	        Thread.sleep(2000);

	        // Step 7: Navigate to Computers
	        WebElement searchfield = driver.findElement(By.name("q"));
	        searchfield.sendKeys("Mobiles");
	        
	        driver.findElement(By.className("button-1")).click();
	        
	        driver.close();
	    
	        
	 }

}
