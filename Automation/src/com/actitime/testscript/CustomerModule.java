package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerModule {
	
	//@BeforeClass
	@BeforeTest
	public void openBrowser() {
		Reporter.log("open browser",true);
	}
	
	//@AfterClass
	@AfterTest
	public void closeBrowser() {
		Reporter.log("close browser",true);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
	
	
	@Test
	public void editcustomer() {
		Reporter.log("edit customer",true);
	}
	
	@Test
	public void createcustomer() {
		Reporter.log("create customer",true);
	}
	
	
}
