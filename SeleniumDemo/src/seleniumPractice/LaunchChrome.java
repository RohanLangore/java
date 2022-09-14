package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\crome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/sortable");
		Thread.sleep(1000);
		driver.manage().window().maximize();	
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("(//*[@id=\"demo-tab-grid\"])")).click();
		
	}

}
