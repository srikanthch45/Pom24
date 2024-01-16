package com.qa.Ae.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Ae.utils.Elementutil;

public class Homepage {
	
	private  WebDriver driver;
	private Elementutil eu;
	//By locators
	private By product=By.xpath("//a[text()=' Products']");
	private By cartt=By.linkText("Cart");
	
	
	
	// constructor
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		eu =new Elementutil(driver);
		
		
	}
	
	//actions or functionality
	
	public String gethomepagetitle() {
		 return driver.getTitle();
		 
		
		 
	}
	
	public String gethomepageurl() {
		return driver.getCurrentUrl();
		
	}
	
	public boolean productlinkexist() {
		return waitforelementpresent(product,10).isDisplayed();
	}
	
	public boolean cartlinkexist() {
		//return waitforelementpresent(cartt, 5).isDisplayed();
		return eu.waitForElementVisible(cartt, 5).isDisplayed();
	}

	public  WebElement waitforelementpresent(By locator,int time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		return wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
	}
}
