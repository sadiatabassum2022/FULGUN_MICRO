package com.spring.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spring.utility.base_class_spring;

public class globalsqa_locator extends base_class_spring {

	public globalsqa_locator() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH, using="//a[text()= 'Tabs']")
	public WebElement tab;
	
	@FindBy(how=How.XPATH, using= "//iframe[@class=\"demo-frame lazyloaded\"]")
	public WebElement iframe;
	
	@FindBy(how=How.XPATH, using= "//h3[text()='Section 1']")
	public WebElement section;
	
	@FindBy (how=How.XPATH, using= "//li[@ id=\"Re-Size Accordion\"]")
	public WebElement resize;
	
	@FindBy (how=How.XPATH, using= "//li[@id=\"Simple Accordion\"]")
	public WebElement simple;
	
	@FindBy (how=How.XPATH, using= "//h3[text()='Section 2']")
	public WebElement section2;
	
	@FindBy (how=How.XPATH, using="//li[@ id=\"Toggle Icons\"]")
	public WebElement toggle;
	
	@FindBy(how=How.XPATH, using= "//*[@id=\"ui-id-5\"]")
	public WebElement sec3; //not working
	
//dragndrop
	
	@FindBy (how=How.XPATH, using= "//a[text()=\"DragAndDrop\"]")
	public WebElement clickdnd;
	
	@FindBy (how=How.XPATH, using="//img[@src=\"images/high_tatras_min.jpg\"]")
	public WebElement tetras1;
	
	@FindBy (how=How.XPATH, using="//div[@ id=\"trash\"]")
	public WebElement trash;
	
	@FindBy (how=How.XPATH, using="//div[@ id=\"trash\"]")
	public WebElement clicktrash;
	
// multiple window 
	@FindBy (how=How.XPATH, using="//a[text()='Windows']")
	public WebElement windows;
	
	@FindBy (how=How.XPATH, using="/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/a")
	public WebElement clickhereoption;
	
	@FindBy (how=How.XPATH, using="//li[text()='Open New Window']")
	public WebElement opennewwindow;
	
	@FindBy (how=How.XPATH, using="/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/a")
	public WebElement clickhere;
	
	@FindBy (how=How.XPATH, using="//li[@id=\"iFrame\"]")
	public WebElement clickframe;
	
}
