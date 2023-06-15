package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
WebDriver mahindriver = new ChromeDriver();
mahindriver.get("https://www.google.com");
mahindriver.manage().window().maximize();
String title= mahindriver.getTitle();
System.out.println(title);
Thread.sleep(2000);
String URL=mahindriver.getCurrentUrl();
System.out.println(URL);

mahindriver.navigate().to("https://stackoverflow.com/");
Thread.sleep(2000);
 title= mahindriver.getTitle();
System.out.println(title);
URL=mahindriver.getCurrentUrl();
System.out.println(URL);

mahindriver.navigate().back();
Thread.sleep(2000);
 title= mahindriver.getTitle();
System.out.println(title);
URL=mahindriver.getCurrentUrl();
System.out.println(URL);

mahindriver.navigate().forward();
Thread.sleep(2000);
 title= mahindriver.getTitle();
System.out.println(title);
URL=mahindriver.getCurrentUrl();
System.out.println(URL);

mahindriver.navigate().refresh();
Thread.sleep(2000);

mahindriver.close();
	}

}
