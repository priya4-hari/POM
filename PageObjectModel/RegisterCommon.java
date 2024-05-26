package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterCommon {
	WebDriver driver;
	public RegisterCommon(WebDriver driver) {
		this.driver = driver;
	}
	public void firstNM(String value)
	{
		cssLocate("input[placeholder='First Name']",value);
	}
	public void lastNM(String value)
	{
		cssLocate("input[placeholder='Last Name']",value);
	}
	public void emailAdd(String Emailadd)
	{
		cssLocate("input[ng-model='EmailAdress']",Emailadd);
	}
	public void phone(String phone)
	{
		cssLocate("input[ng-model='Phone']",phone);
	}
	public void lang(String val)
	{
		driver.findElement(By.id("msdd")).click();
		NonSelect("a[class='ui-corner-all']",val);
	}
	public void NonSelect(String css,String val)
	{	
		List<WebElement> ele = driver.findElements(By.cssSelector(css));
		for(int i=0;i<ele.size();i++)
		{
			String ele1 = ele.get(i).getText();
			if(ele1.equals(val))
			{
					ele.get(i).click();
					break;
				}
		}
	}
	public void DropDown(String s,String val)
	{
		Select sel = new Select(driver.findElement(By.cssSelector(s)));
		sel.selectByVisibleText(val);
	}
	public void Combo(String country)
	{
		clicking("span[role='combobox']");
		WebElement k = cssLocate1("input[class='select2-search__field']");
		k.sendKeys(country);
		k.sendKeys(Keys.ENTER);
	}
	public void clicking(String css)
	{
		driver.findElement(By.cssSelector(css)).click();
	}
	public void cssLocate(String css,String value)
	{
		driver.findElement(By.cssSelector(css)).sendKeys(value);
	}
	public WebElement cssLocate1(String css)
	{
		WebElement key = driver.findElement(By.cssSelector(css));
		return key;
	}
	public void verify(String css)
	{
		String t = driver.findElement(By.cssSelector(css)).getText();
		try
		{
			Assert.assertEquals(t, "");
			System.out.println("Registered Successfully!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
