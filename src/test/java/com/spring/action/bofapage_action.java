package com.spring.action;

import java.util.Set;

import com.spring.locator.bofapage_locator;
import com.spring.utility.base_class_spring;

public class bofapage_action extends base_class_spring{
	bofapage_locator Bofapage_locator = new bofapage_locator();
	
	public void clickonhomeloan() {
		Bofapage_locator.homeloan.click();
	}
	public void clickfindahome() {
		Bofapage_locator.findahome.click();
	}
	public void clickonnewconstraction () throws Exception {
		Bofapage_locator.newconstraction.click();
		
//		// Single window handle
//			String parentwindow = driver.getWindowHandle();
//			// 26 Switch to window
//			driver.switchTo().window(parentwindow);
			Thread.sleep(10000);
	}
	public void clickmonthlypayment() {
		Bofapage_locator.prequaity.click();
		
	}
}
