package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\crome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		//driver.findElement(By.name("email")).sendKeys("roh@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("roh@n");
		//driver.findElement(By.name("login")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();     //xpath ,attribute, index
		//Thread.sleep(2000);
		
		
		
		
		
	}

}
