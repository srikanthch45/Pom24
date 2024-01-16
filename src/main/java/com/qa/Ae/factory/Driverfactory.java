package com.qa.Ae.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	
	public WebDriver driver;
	public Properties prop;
	
	
	public WebDriver initdriver(String browser) {
		
		System.out.println("browser name is:"+browser);
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("safari")) {
			driver=new SafariDriver();
			
			
		}
		else {
			System.out.println("please pass the correct browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://automationexercise.com/");
		return driver;
	}

	public Properties initproperties() {
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("./src\\test\\resources\\config\\config properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
