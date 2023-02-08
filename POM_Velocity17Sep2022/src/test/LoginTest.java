package test;

import org.testng.Assert;


import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test(priority = 0, groups= {"smoke","regression"}) 
	public void verifyTitleOfLoginPage() {
		String verifyTitleOfLoginPage = loginPage.titleOfLoginPage();
		Assert.assertEquals(verifyTitleOfLoginPage, "Login");
	}
	@Test(priority = 1, groups= {"smoke","regression"})
	public void  verifyUrlOfPage(){
		String verifyUrlOfPage = loginPage.urlOfPage();
	    Assert.assertEquals(verifyUrlOfPage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
    @Test(priority = 2, groups= {"smoke","regression"})
    public void verifyLoginWithCorrectCredentials() {
    	loginPage.setUserName("Admin");
    	loginPage.setPassword("admin123");
    	loginPage.clickLoginBtn();
    	String titleOfDash= dashBoardPage.titleOfDashBoardPage();
		Assert.assertEquals(titleOfDash, "DashBoard");
    }
    @Test(priority = -1, groups= {"smoke","regression"})
    public void verifyBuildTitleName() {
    	String verifyTitleOfBuild = loginPage.getBuildTitle();
    	Assert.assertEquals(verifyTitleOfBuild, "OrangeHRM");
    }
}
