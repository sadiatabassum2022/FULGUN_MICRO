package StepDefinitionSpring;

import com.spring.action.bofapage_action;
import com.spring.utility.base_class_spring;

import cucumber.api.java.en.Then;

public class bofaspring extends base_class_spring {
	bofapage_action Bofapage_action= new bofapage_action();
	
	@Then("^click on home loan$")
	public void click_on_home_loan() throws Throwable {
		Bofapage_action.clickonhomeloan();
	}

	@Then("^click find a home$")
	public void click_find_a_home() throws Throwable {
		Bofapage_action.clickfindahome();
	}

	@Then("^click on new constraction$")
	public void click_on_new_constraction() throws Throwable {
		Bofapage_action.clickonnewconstraction();
	}

	@Then("^click monthly payment$")
	public void click_monthly_payment() throws Throwable {
		Bofapage_action.clickmonthlypayment();
	}


}
