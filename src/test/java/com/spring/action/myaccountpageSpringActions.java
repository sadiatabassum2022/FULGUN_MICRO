package com.spring.action;

import com.spring.locator.myaccountpageSpringLocators;

public class myaccountpageSpringActions {
	myaccountpageSpringLocators MyaccountpageSpringLocators = new myaccountpageSpringLocators();
	
public void UserCredential (String e, String p) {
	MyaccountpageSpringLocators.email.sendKeys(e);
	MyaccountpageSpringLocators.password.sendKeys(p);
	MyaccountpageSpringLocators.clicksignin.click();
	
}
	
	
	
	
	
}
