package co.heliverse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KING\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://beta.realcurators.io");
		
		Thread.sleep(2000);
		
		//login attempt
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		driver.findElement(By.id(":r6:")).sendKeys("harshit@heliverse.com");
		driver.findElement(By.id(":r7:")).sendKeys("ABC123abc");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id(":r8:")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://beta.realcurators.io");
		
		//register attempt
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/button[1]/div[1]/*[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body/div[2]/div[3]/li[1]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Get started')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Rohit");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Sharma");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("rohit@heliverse.com");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("rohit123rr");
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/button[1]/*[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/button[1]/*[1]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/button[1]")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.name("email")).sendKeys("rohit@heliverse.com");
		
		WebElement w = driver.findElement(By.name("password"));
		w.sendKeys("rohit123rr");
		w.sendKeys(Keys.ENTER);
		
		
		
		
	}

}
