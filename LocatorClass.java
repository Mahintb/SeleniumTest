package testpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver mahindriver = new ChromeDriver();
		mahindriver.get("https://www.saucedemo.com");
		mahindriver.manage().window().maximize();
		
//		WebElement usernameInput = mahindriver.findElement(By.id("user-name"));
//		usernameInput.sendKeys("standard_user");
//		
//		mahindriver.findElement(By.name("password")).sendKeys("secret_sauce");
//		mahindriver.findElement(By.id("login-button")).click();
		
		List<WebElement> InputTagElements = mahindriver.findElements(By.tagName("input"));
		InputTagElements.get(0).sendKeys("standard_user");
		Thread.sleep(2000);
		InputTagElements.get(1).sendKeys("secret_sauce");
		Thread.sleep(2000);
		InputTagElements.get(2).click();

		
		Thread.sleep(2000);
		mahindriver.close();

	}

}
