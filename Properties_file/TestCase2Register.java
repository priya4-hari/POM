package automationTesting;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjectModel.TestCaseCommonUI;
import PageObjectModel.TestCaseRegisterPage;

public class TestCase2Register extends TestCaseCommonUI{
	static WebDriver driver;
	public static void main(String[] args) {
		TestCaseCommonUI ui = new TestCaseCommonUI();
		ui.propRead();
		driver = ui.driverInit(prop.getProperty("BaseURL"));
		TestCaseRegisterPage Tr1 = new TestCaseRegisterPage(driver);
		Tr1.FillFN("FName1");
		Tr1.FillLN("LName1");
		Tr1.emailAdd("email2");
		Tr1.phoneAdd("phoneNo");
		Tr1.locateByXpathClick(prop.getProperty("gender2"));
		Tr1.locateByXpathClick(prop.getProperty("Hobby21"));
		Tr1.locateByXpathClick(prop.getProperty("Hobby22"));
		Tr1.locateByXpathClick(prop.getProperty("langClick"));
		Tr1.language(prop.getProperty("language2"));
		Tr1.Select(prop.getProperty("skill2"),prop.getProperty("skillXpath"));
		Tr1.locateByXpathClick(prop.getProperty("comboBoxClick"));
		Tr1.locateByXpath(prop.getProperty("InputComboXpath"),prop.getProperty("InputCombo"));
		Tr1.comboBox(prop.getProperty("comboClick"));
		Tr1.Select(prop.getProperty("year"),prop.getProperty("yearXpath"));
		Tr1.Select(prop.getProperty("month"),prop.getProperty("monthXpath"));
		Tr1.Select(prop.getProperty("Date"),prop.getProperty("DateXpath"));
		Tr1.locateByXpath(prop.getProperty("passXpath"), prop.getProperty("pass1"));
		Tr1.locateByXpath(prop.getProperty("cpassXpath"), prop.getProperty("cpass1"));
		Tr1.locateByXpathClick(prop.getProperty("refreshBut"));
		String m = Tr1.verify(prop.getProperty("FNameXpath"));
		Assert.assertEquals(m, "");
		ui.driverClose();
	}

}
