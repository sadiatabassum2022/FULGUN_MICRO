package StepDefinitionSpring;

import com.spring.action.categorypageSpringActions;
import com.spring.action.homepageSpringActions;
import com.spring.action.productpageSpringActions;
import com.spring.utility.base_class_spring;

import cucumber.api.java.en.Then;

public class cartSpring extends base_class_spring{
	homepageSpringActions HomepageSpringActions = new homepageSpringActions ();
	categorypageSpringActions CategorypageSpringActions = new categorypageSpringActions ();
	productpageSpringActions ProductpageSpringActions = new productpageSpringActions();
	
	@Then("^Mouse Hover on Women category$")
	public void mouse_Hover_on_Women_category() throws Throwable {
		HomepageSpringActions.MouseHoveronWomencategory();
	}

	@Then("^Click  Tshirt$")
	public void click_Tshirt() throws Throwable {
		HomepageSpringActions.ClickTshirt();  
	}
	
	@Then("^Select highest price from dropdown$")
	public void Select_highest_price_from_dropdown() throws Throwable {
		CategorypageSpringActions.Selecthighestpricefromdropdown();
		
	}

	@Then("^Mouse hover and click Quick view tshirt$")
	public void mouse_hover_and_click_Quick_view_tshirt() throws Throwable {
		CategorypageSpringActions.MousehoverandclickQuickviewtshirt();
		Thread.sleep(3000);
	}

	@Then("^Click blue Tshirt$")
	public void click_blue_Tshirt() throws Throwable {
		ProductpageSpringActions.ClickblueTshirt();
		Thread.sleep(3000);
	}

	@Then("^Enter five quantity$")
	public void enter_five_quantity() throws Throwable {
	    
	}

	@Then("^Click add to Cart$")
	public void click_add_to_Cart() throws Throwable {
	   
	}

	@Then("^Click proceed to checkout button$")
	public void click_proceed_to_checkout_button() throws Throwable {
	    
	}

	@Then("^Verify product added to cart$")
	public void verify_product_added_to_cart() throws Throwable {
	    
	}

}
