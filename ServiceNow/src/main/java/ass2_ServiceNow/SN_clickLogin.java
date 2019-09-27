package ass2_ServiceNow;

public class SN_clickLogin extends SN_openURL {

	//enter username
	public SN_clickLogin enterUserName(String username)
	{
		driver.switchTo().frame(0);
		driver.findElementByXPath("//input[@name='user_name']").sendKeys(username);
		return this;
	}

	//enter password
	public SN_clickLogin enterPassword(String password)
	{
		driver.findElementByXPath("//input[@id='user_password']").sendKeys(password);
		return this;
	}

	//click login button
	public SN_SysAdmin_page clickLogin()

	{
		//driver.switchTo().frame(1);
		driver.findElementByXPath("//button[@id='sysverb_login']").click();
		return new SN_SysAdmin_page();
	}
}
