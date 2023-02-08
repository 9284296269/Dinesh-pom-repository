package mainjava;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashBoardPage extends BaseTest {																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
	//All locators of page
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement titleDashBoard;
	
	//Initialization of locators/variables
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
//all method on page
	/*
	 *Author : Dinesh Deore
	 *Date : 05 Feb 2023
	 *Dicription : This test method use to verify dashboard page title
	 *Parameter return : String
	 */
	public String titleOfDashBoardPage() {
		return titleDashBoard.getText();
	}
}
