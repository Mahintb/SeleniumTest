package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver mahindriver = new ChromeDriver();
		mahindriver.get("https://www.saucedemo.com");
		mahindriver.manage().window().maximize();
		Thread.sleep(2000);
		
		mahindriver.findElement(By.xpath("//Input[@data-test='username']")).sendKeys("standard_user");
		Thread.sleep(2000);
		mahindriver.findElement(By.xpath("//Input[contains(@data-test,'pass')]")).sendKeys("secret_sauce");
		mahindriver.findElement(By.xpath("//Input[@type='submit' or @value='LOGIN']")).click();
		
 String text = mahindriver.findElement(By.xpath("//span[text()='Products']")).getText();
  System.out.println(text);

		Thread.sleep(2000);
		mahindriver.close();
	}

}
