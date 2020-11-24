package Label;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa2.slots.partyslots.de/de/slots");
		System.out.println(driver.getTitle());
	}

}
	