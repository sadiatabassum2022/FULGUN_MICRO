package com.spring.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spring.utility.base_class_spring;

public class herokrapp_locator extends base_class_spring {
	public herokrapp_locator() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.LINK_TEXT, using = "Context Menu")
	public WebElement contextMenu;
	
	@FindBy(how=How.XPATH , using = "//div[@oncontextmenu=\"displayMessage()\"]")
	public WebElement rightClickBox;
//digest
	@FindBy(how=How.LINK_TEXT, using = "Basic Auth")
	public WebElement BasicAuth;
//file upload
	@FindBy(how=How.LINK_TEXT , using= "File Upload")
	public WebElement file;
	
	
	
	@FindBy(how=How.ID , using= "file-upload")
	public WebElement choosefile;
	
	@FindBy(how=How.ID , using= "file-submit")
	public WebElement upload;
	
	@FindBy (how=How.XPATH , using= "//a[ text()='Dropdown']")
	public WebElement drop;
	
	@FindBy(how=How.ID, using = "dropdown")
	public WebElement select; 
	
	@FindBy(how=How.XPATH,using="//a[text()='Frames']")
	public WebElement frames;
	
	@FindBy(how=How.XPATH, using= "//a[text()='Nested Frames']")
	public WebElement nestedframe;
	
//	@FindBy(how=How.XPATH, using= "/html/body ")
//	public WebElement work;
	
	@FindBy (how=How.XPATH, using = " //body[contains(text(),'BOTTOM')]")
	 public WebElement Bottomtext;
	 
	 @FindBy (how=How.XPATH, using = "//body[contains(text(),'LEFT')]")
	 public WebElement lefttext;
	 
	 @FindBy (how=How.XPATH, using = "//div[@ id=\"content\"]")
	 public WebElement middlettext;
	 
//checkbox
	  @FindBy(how=How.XPATH, using="//a[text()='Checkboxes']")
	  public WebElement chkbx;
	  
	  @FindBy(how=How.XPATH, using="/html/body/div[2]/div/div/form/input[1]")
	  public WebElement chkbx1;
	  
	  @FindBy(how=How.XPATH, using="/html/body/div[2]/div/div/form/input[2]")
	  public WebElement chkbx2;
	  
	  @FindBy(how=How.XPATH, using="//a[text()='Form Authentication']")
	  public WebElement form;
	  
	  @FindBy(how=How.XPATH, using="//input[@id=\"username\"]")
	  public WebElement user;
	
	  @FindBy(how=How.XPATH, using="//input[@id=\"password\"]")
	  public WebElement pass;
	  
	  @FindBy(how=How.XPATH, using="//i[@class=\"fa fa-2x fa-sign-in\"]")
	  public WebElement login;
	  
	  @FindBy(how=How.XPATH, using="//a[text()='Hovers']")
		public WebElement hover;
	  
	  @FindBy(how=How.XPATH, using="/html/body/div[2]/div/div/div[1]/img")
		public WebElement clickimage;
	
	  @FindBy (how=How.XPATH, using= "//a[text()='Drag and Drop']")
       public WebElement dnd;
	  
	  @FindBy (how=How.ID, using= "column-a")
	  public WebElement clickA;
	  
	  @FindBy (how=How.ID, using= "column-b")
	  public WebElement clickB;
	  
	  
}
