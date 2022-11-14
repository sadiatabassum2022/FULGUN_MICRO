package com.spring.action;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.spring.locator.herokrapp_locator;
import com.spring.utility.base_class_spring;

public class herokuapp_action extends base_class_spring {
	herokrapp_locator Herokrapp_locator =  new herokrapp_locator();
	
	public void clickoncontextMenu() {
		Herokrapp_locator.contextMenu.click();
	}
	public void rightclickonthegivenboxandacceptOKpopupalert() throws Exception {
		WebElement admin =Herokrapp_locator.rightClickBox ;
        Actions act = new Actions(driver);
        Thread.sleep(3000);
        act.contextClick(admin).build().perform();              //Right Click = Single Click
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
	}
//basic auth	
	public void clickonBasicAuth() {
		Herokrapp_locator.BasicAuth.click();
	}
	
	public void enterusernamepassinpopup() throws Exception {
		String t = "admin";
		String s = "https://" + t + ":" + t + "@" + "the-internet.herokuapp.com/basic_auth";
		Thread.sleep(3000);
		driver.get(s);
		// identify and get text after authentication of popup
	      String m = driver.findElement(By.cssSelector("p")).getText();
	      System.out.println("Text after pop-up authentication: " + m);
	      Thread.sleep(3000);
	}
	
	//file upload
	public void clickonfileupload() {
		Herokrapp_locator.file.click();
	}
	public void clickonchoosefile() throws Exception {
		// FILE UPLOADING USING SENDKEYS ....
		   WebElement browse = Herokrapp_locator.choosefile;
		   //click on ‘Choose file’ to upload the desired file
		   browse.sendKeys("C:\\Users\\tabas\\OneDrive\\Pictures\\bbm.png"); //Uploading the file using sendKeys
		   System.out.println("File is Uploaded Successfully");
		   Thread.sleep(3000);
	}
	public void clickupload() throws Exception {
		Herokrapp_locator.upload.click();
		  Thread.sleep(3000);
	}
	public void  clickondropdown() {
		Herokrapp_locator.drop.click();
	}
	public void clickondropdownmenu() throws Exception {
		WebElement dropdown = Herokrapp_locator.select ;

		Select sl = new Select(dropdown);
//		sl.selectByVisibleText("Baby");
//		sl.selectByValue("267");
		sl.selectByIndex(2);
		Thread.sleep(2500);
	}
	
//frame	
	public void clickonframes() {
		Herokrapp_locator.frames.click();
	}
	
	public void clickonnestedframes () {
		Herokrapp_locator.nestedframe.click();
	}
	
	public void workonframe() throws Exception {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
   	 Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
   	 System.out.println("No. of iframes on the page are " + noOfFrames);
		
		
// or,
//		driver.switchTo().frame("frame-bottom");
//    	Thread.sleep(3000);
//    	WebElement text = HerokuappLocator.Bottomtext;
//    	text.getText();
//		System.out.println(text);

		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.switchTo().frame("frame-left");
		Thread.sleep(3000);
		String left = Herokrapp_locator.lefttext.getText();
		System.out.println(left);
		
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame-middle");
		Thread.sleep(3000);
		String mdl = Herokrapp_locator.middlettext.getText();
		System.out.println(mdl);
		
		driver.switchTo().parentFrame();
		Thread.sleep(3000);

		driver.switchTo().frame("frame-left");
		Thread.sleep(3000);
		String let = Herokrapp_locator.lefttext.getText();
		System.out.println(let);
		
		driver.switchTo().defaultContent();
		
//		driver.switchTo().parentFrame();
//		Thread.sleep(3000);
		
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		String bttm = Herokrapp_locator.Bottomtext.getText();
		System.out.println(bttm);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		Thread.sleep(3000);
			
	}
// checkbox
	public void clickoncheckbox() throws Exception {
		Herokrapp_locator.chkbx.click();
		Thread.sleep(3000);
	}
	public void selectoncheckboxesoption() throws Exception {
//		Herokrapp_locator.chkbx1.click();
//		Thread.sleep(3000);
//		Herokrapp_locator.chkbx2.click();
//		Thread.sleep(3000);
	}
	
	
	public void verifycheckboxdisplayedselectedenabled () throws Exception {

//isSelected
	WebElement checkBoxElement = Herokrapp_locator.chkbx1;
	boolean isSelected = checkBoxElement.isSelected();
	Thread.sleep(3000);
			
	//performing click operation if element is not checked
	if(isSelected == false) {
		checkBoxElement.click();
		Thread.sleep(3000);
	}

	
// Validate checkbox using isEnabled() and then click
	WebElement chckBxEnable = Herokrapp_locator.chkbx1;
	boolean isEnabled = chckBxEnable.isEnabled();
	Thread.sleep(3000);

	// performing click operation if element is enabled
	if (isEnabled == true) {
		chckBxEnable.click();
		Thread.sleep(3000);
	}
		
//Validate Checkbox using isDisplayed() and click
		
//		WebElement checkBoxE = Herokrapp_locator.chkbx2 ;
//		boolean isDisplayed = checkBoxE.isDisplayed();
//		Thread.sleep(3000);
//
//		// performing click operation if element is displayed
//		if (isDisplayed == true) {
//			checkBoxElement.click();
//			Thread.sleep(3000);
//		}
	}
	
	public void getcurrentlinkandalllinksincludingthetotal() {
		
	//currentlink
System.out.println(driver.getCurrentUrl());

//alllinksincludingthetotal

List <WebElement> listoflink = driver.findElements(By.tagName("a"));
System.out.println(listoflink.size());

for(int i =0; i <listoflink.size();i++) {
	System.out.println(listoflink.get(i).getAttribute("href"));
}	
	}
	
	public void getpageresourcesandpagetitle() {
	//getpageresources
		System.out.println(driver.getPageSource());
		
	//pagetitle
		System.out.println(driver.getTitle());
	}
	
	public void Clickformauthentication() {
		Herokrapp_locator.form.click();
	}

	public void enterusernameandpassword() {
		Herokrapp_locator.user.sendKeys("tomsmith");
		String usern= Herokrapp_locator.user.getAttribute("value");
		System.out.println(usern);
		
		Herokrapp_locator.pass.sendKeys("SuperSecretPassword!");
		String pass= Herokrapp_locator.pass.getAttribute("value");
		System.out.println(pass);
	}
	
	public void clicklogin() {
		Herokrapp_locator.login.click();
	}
	
	public void clickonhovers() {
		Herokrapp_locator.hover.click();
	}
	public void mouseoveronimages() throws Exception {
		
		
		 Actions act = new Actions(driver);
 WebElement admin = Herokrapp_locator.clickimage;
	act.moveToElement(admin).build().perform(); // mouse over to admin tab
				Thread.sleep(2000);
	}
	
//drag & drop
	public void clickondraganddrop() throws Exception {
		Herokrapp_locator.dnd.click();
		Thread.sleep(2000);
	}
	public void performdrag() throws Exception {
//		Actions acttn = new Actions(driver);
//		WebElement src = Herokrapp_locator.clickA;
//		WebElement tgt = Herokrapp_locator.clickB;
//		acttn.dragAndDrop(src, tgt).perform();
//		Thread.sleep(2000);
		
//or
		WebElement From = Herokrapp_locator.clickA;
		WebElement To = Herokrapp_locator.clickB;
		 Actions builder = new Actions(driver);
	      Action dragAndDrop = builder.clickAndHold(To).moveToElement(From).release(From).build();
	      
	      dragAndDrop.perform();
	  	Thread.sleep(2000);
		
	}
}

