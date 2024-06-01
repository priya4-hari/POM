package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCaseRegisterPage extends TestCaseCommonUI{
	WebDriver driver;
	public TestCaseRegisterPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void FillFN(String fName)
	{
		locateByXpath(prop.getProperty("FNameXpath"),prop.getProperty(fName));
	}
	public void FillLN(String lName)
	{
		locateByXpath(prop.getProperty("LNameXpath"),prop.getProperty(lName));
	}
	public void emailAdd(String email)
	{
		locateByXpath(prop.getProperty("emailXpath"),prop.getProperty(email));
	}
	public void phoneAdd(String phone)
	{
		locateByXpath(prop.getProperty("phoneXpath"),prop.getProperty(phone));
	}
	public void locateByXpath(String path,String value)
	{
		driver.findElement(By.xpath(path)).sendKeys(value);
	}
	public void Select(String val,String path)
	{
		Select sel = new Select(driver.findElement(By.xpath(path)));
		sel.selectByVisibleText(val);
	}
	public void language(String lan)
	{
		List<WebElement> lang = driver.findElements(By.xpath(prop.getProperty("langCommon")));
		int count=0;
		for(WebElement ele:lang)
		{
			count++;
			String s=ele.getText();
			if(lan.equals(s))
			{
				lang.get(count).click();
				break;
			}
		}
	}
	public String verify(String path)
	{
		String s1 = driver.findElement(By.xpath(path)).getText();
		return s1;
	}
	public void comboBox(String path)
	{
		driver.findElement(By.xpath(path)).sendKeys(Keys.ENTER);
	}
	public void locateByXpathClick(String path) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(path)).click();
	}
}
