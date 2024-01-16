package com.aq.Ae.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.Ae.factory.Driverfactory;
import com.qa.Ae.pages.Homepage;

public class Basetest {
	
	public Driverfactory df;
	public WebDriver driver;
	public Homepage home;
	
	@BeforeTest
	
	public void setup() {
		df=new Driverfactory();
		driver=df.initdriver("chrome");
		home=new Homepage(driver);
		
		
	}
	
	@AfterTest
	public void teardown(){
		
		driver.quit();
		
	}

}
