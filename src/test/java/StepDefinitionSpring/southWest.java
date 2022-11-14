package StepDefinitionSpring;


import com.spring.action.southWest_action;
import com.spring.utility.ScreenShots_spring;
import com.spring.utility.base_class_spring;

import cucumber.api.java.en.Then;

public class southWest extends base_class_spring {
	southWest_action SouthWest_action = new southWest_action();
	
	@Then("^Select Departure date and Return date$")
	public void select_Departure_date_and_Return_date() throws Throwable {
		SouthWest_action.SelectDeparturedateandReturndate();
		ScreenShots_spring.takescreenshot(driver, "Verify product description");
	}
	
}
