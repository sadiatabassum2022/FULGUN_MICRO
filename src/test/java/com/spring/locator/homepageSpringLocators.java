package com.spring.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spring.utility.base_class_spring;

public class homepageSpringLocators extends base_class_spring {
	public homepageSpringLocators() {
		PageFactory.initElements(driver,this);
		
		}
		//signin button
		@FindBy(how=How.XPATH, using="//a[@class='login']")
		public WebElement siginbutton;
		
		//women category
		@FindBy(how=How.XPATH, using="//a[@title='Women']")
		public WebElement womenCategory;
		
		@FindBy(how=How.XPATH, using="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a")
		public WebElement tshirt;
		
}
