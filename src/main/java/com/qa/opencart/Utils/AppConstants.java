package com.qa.opencart.Utils;

import java.util.Arrays;
import java.util.List;

public class AppConstants {
	
	public static final String LOGIN_PAGE_TITLE="Account Login";
	public static final String LOGIN_PAGE_FRACTION_URL="route=account/login";
	
	public static final String ACCOUNT_PAGE_TITLE = "My Account";
	public static final CharSequence ACC_PAGE_FRACTIONAL_URL = "account/account";
	public static final List<String> EXPECTED_ACC_HEADER_LIST=(List<String>) Arrays.asList("My Account","My Orders","My Affiliate Account","Newsletter");
	
}
