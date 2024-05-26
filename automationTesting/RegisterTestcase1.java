package automationTesting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjectModel.CommonUI;
import PageObjectModel.RegisterCommon;

public class RegisterTestcase1 {
	public static void main(String[] args)
	{
		CommonUI c1 = new CommonUI();
		WebDriver driver = c1.driverInit("https://demo.automationtesting.in/Register.html");
		RegisterCommon r1 = new RegisterCommon(driver);
		r1.firstNM("Hari");
		r1.lastNM("abc");
		r1.emailAdd("Hari12@gmail.com");
		r1.phone("8769543574");
		r1.clicking("input[value='FeMale']");
		r1.clicking("input[id='checkbox2']");
		r1.clicking("input[id='checkbox3']");
		r1.lang("French");
		r1.DropDown("select[ng-model='Skill']", "C");
		r1.Combo("India");
		r1.DropDown("select[ng-model='yearbox']", "2001");
		r1.DropDown("select[ng-model='monthbox']", "May");
		r1.DropDown("select[ng-model='daybox']", "19");
		r1.cssLocate("input[ng-model='Password']", "Hari@2006");
		r1.cssLocate("input[ng-model='CPassword']", "Hari@2006");
		r1.clicking("button[id='Button1']");
		r1.verify("input[placeholder='First Name']");
		c1.driverClose();
	}

}
