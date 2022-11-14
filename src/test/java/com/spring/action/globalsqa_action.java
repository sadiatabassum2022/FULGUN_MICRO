package com.spring.action;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.spring.locator.globalsqa_locator;
import com.spring.utility.base_class_spring;

import cucumber.api.java.en.Then;

public class globalsqa_action extends base_class_spring {
	globalsqa_locator Globalsqa_locator = new globalsqa_locator();
	
public void clickontabsbutton() throws Exception { 
	 ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	 Thread.sleep(3000);
	Globalsqa_locator.tab.click();
}
 public void clicksectionone() throws Exception {
	 driver.switchTo().frame(Globalsqa_locator.iframe);
	 Thread.sleep(3000);
	 Globalsqa_locator.section.click(); 
	 Thread.sleep(3000); 
 }
 
public void clickonReSizeAccordion () throws Exception {
	driver.switchTo().defaultContent();
	 Thread.sleep(3000);
	Globalsqa_locator.resize.click();
	 Thread.sleep(3000);
	 Globalsqa_locator.simple.click(); 
	 Thread.sleep(3000);
	 driver.switchTo().frame(Globalsqa_locator.iframe);
	 Thread.sleep(3000);
	 Globalsqa_locator.section2.click();
	 Thread.sleep(3000);
	driver.switchTo().defaultContent();
	 Thread.sleep(3000);
	 Globalsqa_locator.toggle.click();
	 Thread.sleep(3000);
	 driver.switchTo().frame(Globalsqa_locator.iframe);
	 Thread.sleep(3000);
	 Globalsqa_locator.sec3.click();
	 Thread.sleep(3000);
	 
}
public void clickonhovers() {
	Globalsqa_locator.clickdnd.click();
}

public void mouseoveronimages() throws Exception {
	
}
//drag n drop
public void clickondraganddrop() throws Exception {
	((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	 Thread.sleep(3000);
	Globalsqa_locator.clickdnd.click();
}
public void performdragndrop() throws Exception {
	Actions acttn = new Actions(driver);
	driver.switchTo().frame(Globalsqa_locator.iframe);
	 Thread.sleep(3000);
	WebElement src = Globalsqa_locator.tetras1;
	WebElement tgt = Globalsqa_locator.trash;
	acttn.dragAndDrop(src, tgt).perform();
	 Thread.sleep(3000);
}

public void clicktrash() throws Exception {
	Globalsqa_locator.clicktrash.click();
	 Thread.sleep(3000);
}

public void findbrokenlines() throws IOException, Exception  {
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	// 21. Find out number of links
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	System.out.println("Number of link:" + alllinks.size());
	// 22. Print all links name
			for (int i = 0; i < alllinks.size(); i++) {
				System.out.println(alllinks.get(i).getAttribute("href"));
			
	// 23. Broken links

				WebElement elements = alllinks.get(i);
				String urll = elements.getAttribute("href");
				URL link = new URL(urll);
				// create a connection using url object 'link'
				HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
				// establish connection
				httpConn.connect();
				int rescode = httpConn.getResponseCode(); // return response if res code is above 400 :broken
				if (rescode >= 400) {
					System.out.println(url + " - " + "is broken link");
				} else {
					System.out.println(url + " -  " + "is valid link");
				}
				 Thread.sleep(5000);
			}
}

public void clickonwindows() throws Exception {
	 ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	// Thread.sleep(3000);
	 WebDriverWait wait = new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.elementToBeClickable(Globalsqa_locator.windows));
	//Globalsqa_locator.windows.click();
	 //or

JavascriptExecutor ex = (JavascriptExecutor)driver;
 ex.executeScript("arguments[0].click()",Globalsqa_locator.windows);
	System.out.println("explicite wait");
}
public void Clickonclickhereoption() throws Exception {
	Globalsqa_locator.clickhereoption.click();
	Thread.sleep(3000);
//	Set<String> window =driver.getWindowHandles();
//	   Iterator <String> ite = window.iterator();
//	        String mainwindow = ite.next();
//	        String secondwindow = ite.next();
//	       // String thirdwindow = ite.next();
//	        driver.switchTo().window(child1);
//	        System.out.println("child window");
//	        Thread.sleep(3000);
//	        driver.switchTo().window(mainwindow);
//	        System.out.println("mainwindow");
//	        Thread.sleep(3000);
//	        driver.switchTo().window(secondwindow);
//	        System.out.println("secondwindow");
//	        Thread.sleep(3000);
}
public void Clickonopennewwindow() throws Exception {
//	Globalsqa_locator.opennewwindow.click();
//	Thread.sleep(3000);
}
public void clickonclickhere() throws Exception {
     
//        Globalsqa_locator.clickhere.click();
//        Thread.sleep(3000);
//        Set<String> window =driver.getWindowHandles();
//   Iterator <String> ite = window.iterator();
//        String parent = ite.next();
//        String child1 = ite.next();
//        String child2 = ite.next();
//        driver.switchTo().window(child1);
//        System.out.println("child window");
//        Thread.sleep(3000);
//        driver.switchTo().window(parent);
//        
//        Thread.sleep(3000);
        
		
//		Globalsqa_locator.clickframe.click();
//		 Thread.sleep(3000);
		 }

}
