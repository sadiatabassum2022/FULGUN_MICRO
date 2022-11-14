package StepDefinitionSpring;

import com.spring.action.globalsqa_action;
import com.spring.utility.base_class_spring;

import cucumber.api.java.en.Then;

public class globalsqa extends base_class_spring {
	globalsqa_action Globalsqa_action = new globalsqa_action();
	
	@Then("^click on tabs button$")
	public void click_on_tabs_button() throws Throwable {
		Globalsqa_action.clickontabsbutton();
	}
	
	@Then("^click section one$")
	public void click_section_one() throws Throwable {
		Globalsqa_action.clicksectionone();
	}
	
	@Then("^click on Re-Size Accordion$")
	public void click_on_Re_Size_Accordion() throws Throwable {
		Globalsqa_action.clickonReSizeAccordion();
		
	}
	
//dragndrop
	@Then("^click on drag and drop$")
	public void click_on_drag_and_drop() throws Throwable {
		Globalsqa_action.clickondraganddrop();
	}

	@Then("^perform dragndrop$")
	public void perform_dragndrop() throws Throwable {
		Globalsqa_action.performdragndrop();
	}
	
	@Then("^click trash$")
	public void click_trash() throws Throwable {
		Globalsqa_action.clicktrash();
	}
	
	@Then("^find broken lines$")
	public void find_broken_lines() throws Throwable {
		Globalsqa_action.findbrokenlines();
	}
	
//multiple window	
	@Then("^click on windows$")
	public void click_on_windows() throws Throwable {
		Globalsqa_action.clickonwindows();
	}

	@Then("^Click on click here option$")
	public void click_on_click_here_option() throws Throwable {
		Globalsqa_action.Clickonclickhereoption();
	}

	@Then("^Click on open new window$")
	public void click_on_open_new_window() throws Throwable {
		Globalsqa_action.Clickonopennewwindow();
	}

	@Then("^click on click here$")
	public void click_on_click_here() throws Throwable {
		Globalsqa_action.clickonclickhere();
	}

}
