package com.spring.action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.spring.locator.southWest_locator;
import com.spring.utility.base_class_spring;

public class southWest_action extends base_class_spring {
	southWest_locator SouthWest_locator = new southWest_locator();
	
	public void SelectDeparturedateandReturndate() throws Exception {
		
	//scroll
	((JavascriptExecutor) driver).executeScript("scroll(0,400)");
	JavascriptExecutor date = (JavascriptExecutor) driver;
	Thread.sleep(3000);
	
//departturedate 
	WebElement depart  = SouthWest_locator.departure;
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].value='12/01/2022';", depart);
	Thread.sleep(5000);
	
//returndate
	WebElement returnss = SouthWest_locator.returns;
	jse.executeScript("arguments[0].value='12/20/2022';", returnss);
	Thread.sleep(5000);
	
	//or
//	date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='11/21/2022'");
//	Thread.sleep(5000);
//	date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='12/01/2022'");
	
	
	}
	
}
