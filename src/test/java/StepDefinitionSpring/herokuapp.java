package StepDefinitionSpring;

import com.spring.action.herokuapp_action;

import cucumber.api.java.en.Then;

public class herokuapp {
	herokuapp_action Herokuapp_action = new herokuapp_action();
	@Then("^click on context Menu$")
	public void click_on_context_Menu() throws Throwable {
		Herokuapp_action.clickoncontextMenu();
	}

	@Then("^right click on the given box and accept OK popup alert$")
	public void right_click_on_the_given_box_and_accept_OK_popup_alert() throws Throwable {
		Herokuapp_action.rightclickonthegivenboxandacceptOKpopupalert();
	}
	
	//basic auth	
	@Then("^click on Basic Auth$")
	public void click_on_Basic_Auth() throws Throwable {
		Herokuapp_action.clickonBasicAuth();
	}

	@Then("^enter username pass in pop up$")
	public void enter_username_pass_in_pop_up() throws Throwable {
		Herokuapp_action.enterusernamepassinpopup();
	}
	//file upload
	@Then("^click on file upload$")
	public void click_on_file_upload() throws Throwable {
		Herokuapp_action.clickonfileupload();
	}

	@Then("^click on choose file$")
	public void click_on_choose_file() throws Throwable {
		Herokuapp_action.clickonchoosefile();
	}

	@Then("^click upload$")
	public void click_upload() throws Throwable {
		Herokuapp_action.clickupload();
	}
//dropdown
	@Then("^click on dropdown$")
	public void click_on_dropdown() throws Throwable {
		Herokuapp_action.clickondropdown();
	}

	@Then("^click on dropdown menu$")
	public void click_on_dropdown_menu() throws Throwable {
		Herokuapp_action.clickondropdownmenu();
	}
//frame
	@Then("^click on frames$")
	public void click_on_frames() throws Throwable {
		Herokuapp_action.clickonframes();
	}

	@Then("^click on nested frames$")
	public void click_on_nested_frames() throws Throwable {
		Herokuapp_action.clickonnestedframes();
	}

	@Then("^work on frame$")
	public void work_on_frame() throws Throwable {
		Herokuapp_action.workonframe();
	}

//checkbox
	@Then("^click on checkbox$")
	public void click_on_checkbox() throws Throwable {
		Herokuapp_action.clickoncheckbox();
	}

	@Then("^select on checkboxes option$")
	public void select_on_checkboxes_option() throws Throwable {
		Herokuapp_action.selectoncheckboxesoption();
	}
	
	@Then("^verify checkbox displayed selected enabled$")
	public void verify_checkbox_displayed_selected_enabled() throws Throwable {
		Herokuapp_action.verifycheckboxdisplayedselectedenabled();
	}

//get current
	@Then("^get current link and all links including the total$")
	public void get_current_link_and_all_links_including_the_total() throws Throwable {
		//Herokuapp_action.getcurrentlinkandalllinksincludingthetotal();
	}

	@Then("^get page resources and page title$")
	public void get_page_resources_and_page_title() throws Throwable {
		Herokuapp_action.getpageresourcesandpagetitle();
	}

//login authen
	@Then("^Click form authentication$")
	public void click_form_authentication() throws Throwable {
		Herokuapp_action.Clickformauthentication();
	}
	@Then("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
		Herokuapp_action.enterusernameandpassword();
	}

	@Then("^click login$")
	public void click_login() throws Throwable {
		Herokuapp_action.clicklogin();
	}
	//hovers
	@Then("^click on hovers$")
	public void click_on_hovers() throws Throwable {
		Herokuapp_action.clickonhovers();
	}

	@Then("^mouseover on images$")
	public void mouseover_on_images() throws Throwable {
		Herokuapp_action.mouseoveronimages();
	}
//drag and drop
	@Then("^click on draganddrop$")
	public void click_on_draganddrop() throws Throwable {
		Herokuapp_action.clickondraganddrop();
	}

	@Then("^perform drag$")
	public void perform_drag() throws Throwable {
		Herokuapp_action.performdrag();
	}

}
