package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.CommonUI;
import PageObjectModel.RegisterCommon;

public class RegisterTestcase3 {

	public static void main(String[] args) {
		CommonUI c3 = new CommonUI();
		WebDriver driver = c3.driverInit("https://demo.automationtesting.in/Register.html");
		RegisterCommon r3 = new RegisterCommon(driver);
		r3.firstNM("Ramesh");
		r3.lastNM("abc");
		r3.emailAdd("ram123@gmail.com");
		r3.phone("8797657993");
		r3.clicking("input[value='Male']");
		r3.clicking("input[id='checkbox2']");
		r3.clicking("input[id='checkbox3']");
		r3.lang("English");
		r3.DropDown("select[ng-model='Skill']", "CSS");
		r3.Combo("Hong Kong");
		r3.DropDown("select[ng-model='yearbox']", "2001");
		r3.DropDown("select[ng-model='monthbox']", "May");
		r3.DropDown("select[ng-model='daybox']", "19");
		r3.cssLocate("input[ng-model='Password']", "Hari@2006");
		r3.cssLocate("input[ng-model='CPassword']", "Hari@2006");
		r3.clicking("button[id='Button1']");
		r3.verify("input[placeholder='First Name']");
		c3.driverClose();
	}

}
