package PageObjectModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseCommonUI {
	
	WebDriver driver;
	public static Properties prop;
	FileInputStream input;
	public void propRead()
	{
		try {
			prop = new Properties();
			input = new FileInputStream("C:\\Eclipse_Projects\\automationTesting\\src\\main\\resources\\input.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			System.out.println("File not found ");
		} catch (IOException e) {
			System.out.println("Input output exception");
		}
		
	}
	public WebDriver driverInit(String URL) {
		//propRead();
		 driver = new ChromeDriver();
		driver.get(URL);
		return driver;
	}
	public void driverClose()
	{
		driver.close();
	}
}
