package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver mahindriver = new ChromeDriver();
		mahindriver.get("https://www.selenium.dev/");
		mahindriver.manage().window().maximize();
		Thread.sleep(2000);
		for (int i =2; i<=6 ;i++) {
			mahindriver.findElement(By.xpath("//li[@class='nav-item mr-4 mb-2 mb-lg-0']["+i+"]//a")).click();
			Thread.sleep(2000);
			mahindriver.navigate().back();
			Thread.sleep(2000);

		}
		
		

	}

}
