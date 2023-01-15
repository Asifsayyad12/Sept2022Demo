package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;

public class BeseTest {
	
	DriverFactory df;
	WebDriver driver;     //initDriver return type WebDriver
	protected LoginPage loginpage;     //inharit method in child class
	protected AccountsPage accPage;
	
	@BeforeTest
	public void setup() {
		df=new DriverFactory();
		driver=	df.initDriver("chrome");
		loginpage=new LoginPage(driver);
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
