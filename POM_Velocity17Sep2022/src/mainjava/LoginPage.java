package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
	@FindBy(xpath = "//*[text()='login']")
	WebElement txtLoginPage;
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="button")
	WebElement btnLogin;
	
	// Initialization of locators/variables
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
			}
	
	// methods required to perform test steps
	
	/*
	 *Author : Dinesh Deore
	 *Date : 05 Feb 2023
	 *Dicription : This test method use to verify login page title
	 *Parameter return : String
	 */
	public String titleOfLoginPage(){
		return txtLoginPage.getText();
	}
	
	/*
	 *Author : Dinesh Deore
	 *Date : 05 Feb 2023
	 *Dicription : This test method use to verify current url of page 
	 *Parameter return : String
	 */
	public String urlOfPage() {
		return driver.getCurrentUrl();
	}
	/*
	 *Author : Dinesh Deore
	 *Date : 05 Feb 2023
	 *Dicription : This test method use to ste usernamevalue
	 */
	public void setUserName(String usrName) {
	userName.sendKeys(usrName);
	}
	/*
	 *Author : Dinesh Deore
	 *Date : 05 Feb 2023
	 *Dicription : This test method use to ste passwordvalue
	 *Parameter return : String
	 */
	public void setPassword(String password) {
		pass.sendKeys(password);
	}
	/*
	 *Author : Dinesh Deore
	 *Date : 05 Feb 2023
	 *Dicription : This test method use to click on login button
	 */
	public void clickLoginBtn() {
		btnLogin.click();
		
	}
	/*
	 *Author : Dinesh Deore
	 *Date : 05 Feb 2023
	 *Dicription : This test method use to click on login button
	 *Parameter return : String
	 */
	public String getBuildTitle() {
		return driver.getTitle();
	}
}