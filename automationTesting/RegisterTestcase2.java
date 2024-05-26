package automationTesting;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModel.CommonUI;
import PageObjectModel.RegisterCommon;
public class RegisterTestcase2 {
	public static void main(String[] args)
	{
		CommonUI c2 = new CommonUI();
		WebDriver driver = c2.driverInit("https://demo.automationtesting.in/Register.html");
		RegisterCommon r2 = new RegisterCommon(driver);
		r2.firstNM("Mani");
		r2.lastNM("abc");
		r2.emailAdd("Mani12@gmail.com");
		r2.phone("8790654763");
		r2.clicking("input[value='FeMale']");
		r2.clicking("input[id='checkbox2']");
		r2.clicking("input[id='checkbox3']");
		r2.lang("English");
		r2.lang("French");
		r2.DropDown("select[ng-model='Skill']", "APIs");
		r2.Combo("Denmark");
		r2.DropDown("select[ng-model='yearbox']", "2001");
		r2.DropDown("select[ng-model='monthbox']", "May");
		r2.DropDown("select[ng-model='daybox']", "19");
		r2.cssLocate("input[ng-model='Password']", "Hari@2006");
		r2.cssLocate("input[ng-model='CPassword']", "Hari@2006");
		r2.clicking("button[id='Button1']");
		r2.verify("input[placeholder='First Name']");
		c2.driverClose();
	}
}
