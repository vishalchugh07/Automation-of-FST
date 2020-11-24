package Label;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main extends ReadData {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa2.casino.pa.borgataonline.com/en/games");
		System.out.println(driver.getTitle());
//cookies //driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		WebElement email=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		email.sendKeys("miney@yopmail.com");
		password.sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@class='login w-100 btn btn-primary']")).click();
		//driver.quit();
	
	}

}
	