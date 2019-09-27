package ass2_ServiceNow;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SN_TC_01 extends SN_openURL  {
	
	@BeforeClass
	public void setData() {
		excelFileName="ServicN";
	}
	
	
	@Test(dataProvider="SNData")
	public void SN_createIncident(String username, String password, String filterData, String callerName, String shortDes) throws InterruptedException {

		SN_clickLogin incident = new SN_clickLogin();
		incident.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.searchFilter(filterData)
		.clickCreate()
		.getGId()
		.enterCallerName(callerName)
		.enterShrtDes(shortDes)
		.clickSubmit()
		.searchIncident()
		.incidentVerification();
		
		
	}
}

/*//Login
		SN_clickLogin Login =new SN_clickLogin(); 
		Login.enterUserName();
		Login.enterPassword();
		Login.clickLogin();
	
	 // select Incident
		SN_SysAdmin_page FI = new SN_SysAdmin_page();
		FI.searchIncident(10);
		
	// click new
		SN_Incident_Page Inc = new SN_Incident_Page();
		Inc.clickNew();
		
	//create new 
		SN_newRecord Cnew =new SN_newRecord();
		Cnew.getGId();
		Cnew.enterCallerName();
*/	