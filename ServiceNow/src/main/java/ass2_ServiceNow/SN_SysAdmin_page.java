package ass2_ServiceNow;

public class SN_SysAdmin_page extends SN_openURL  {

	public SN_SysAdmin_page searchFilter(String filterData) throws InterruptedException {
		driver.findElementByXPath("//input[@id='filter']").sendKeys(filterData);
		Thread.sleep(3000);
		return this;
	}
	
	public SN_newRecord clickCreate() throws InterruptedException {
		driver.findElementByXPath("(//div[@class='sn-widget-list-title'])[43]").click();
		Thread.sleep(3000);
		return new SN_newRecord();
	}
}
