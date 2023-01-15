package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.Utils.AppConstants;
import com.qa.opencart.Utils.AppErrors;
import com.qa.opencart.base.BeseTest;

public class LoginPageTest extends BeseTest  {
	
	@Test(priority=1)
	public void loginpageTitleTest() {
		String actTitle=loginpage.getLoginPageTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, AppConstants.LOGIN_PAGE_TITLE,AppErrors.NO_TITLE_MATCHED);
	}
	
	@Test(priority=2)
	public void loginpageUrlTest() {
		String actUrl = loginpage.getLoginPageUrl();
		System.out.println(actUrl);
		Assert.assertTrue(actUrl.contains(AppConstants.LOGIN_PAGE_FRACTION_URL),AppErrors.NO_URL_MATCHED);
	}
	
	@Test(priority=3)
	public void forgotPWLinkExistTest() {
		Assert.assertTrue(loginpage.isforgotPWdLinkExist());
	}

	@Test(priority=4)
	public void loginTest() {
	accPage= loginpage.doLogin("asif01@gmail.com","Asif@123");
	Assert.assertTrue(accPage.isLogOutExist(),AppErrors.LOGIN_UNSUCCESSFUL);
	}
}
