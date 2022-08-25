package com.spring.action;

import org.testng.Assert;

import com.spring.locator.signinpageSpringLocators;
import com.spring.utility.base_class_spring;

public class signinpageSpringActions extends base_class_spring {
	signinpageSpringLocators SigninpageSpringLocators = new signinpageSpringLocators();
	
public void	Verifyspringusersigninhasbeensuccessful() throws Exception {
	boolean verify = SigninpageSpringLocators.accountuser.isDisplayed();
	Assert.assertTrue(verify);
	Thread.sleep(3000);
}
	
	

}
