package automationTesting;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import PageObjectModel.TestCaseCommonUI;
import PageObjectModel.TestCaseRegisterPage;
public class TestCase1Register extends TestCaseCommonUI{
	static WebDriver driver;
	public static void main(String[] args)
	{
		TestCaseCommonUI ui = new TestCaseCommonUI();
		ui.propRead();
		driver = ui.driverInit(prop.getProperty("BaseURL"));
		TestCaseRegisterPage Tr = new TestCaseRegisterPage(driver);
		Tr.FillFN("FName");
		Tr.FillLN("LName");
		Tr.emailAdd("email1");
		Tr.phoneAdd("phoneNo");
		Tr.locateByXpathClick(prop.getProperty("gender1"));
		Tr.locateByXpathClick(prop.getProperty("Hobby11"));
		Tr.locateByXpathClick(prop.getProperty("Hobby12"));
		Tr.locateByXpathClick(prop.getProperty("langClick"));
		Tr.language(prop.getProperty("language1"));
		Tr.Select(prop.getProperty("skill1"),prop.getProperty("skillXpath"));
		Tr.locateByXpathClick(prop.getProperty("comboBoxClick"));
		Tr.locateByXpath(prop.getProperty("InputComboXpath"),prop.getProperty("InputCombo"));
		Tr.comboBox(prop.getProperty("comboClick"));
		Tr.Select(prop.getProperty("year"), prop.getProperty("yearXpath"));
		Tr.Select(prop.getProperty("month"), prop.getProperty("monthXpath"));
		Tr.Select(prop.getProperty("Date"), prop.getProperty("DateXpath"));
		Tr.locateByXpath(prop.getProperty("passXpath"), prop.getProperty("pass"));
		Tr.locateByXpath(prop.getProperty("cpassXpath"), prop.getProperty("cpass"));
		Tr.locateByXpathClick(prop.getProperty("refreshBut"));
		String m = Tr.verify(prop.getProperty("FNameXpath"));
		Assert.assertEquals(m, "");
		ui.driverClose();
	}

}
