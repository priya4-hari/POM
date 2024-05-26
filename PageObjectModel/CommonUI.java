package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonUI {
	WebDriver driver = new ChromeDriver();
	public WebDriver driverInit(String url)
	{
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver;
	}
	public void driverClose()
	{
		driver.close();
	}

}
