package com.qa.Ae.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aq.Ae.base.Basetest;

public class Homepagetest extends Basetest {
	
	
	@Test
	public void homepagetitletest() {
		String title=home.gethomepagetitle();
		Assert.assertEquals(title, "Automation Exercise");
	}
	
	@Test
	
	public void homepageurltest() {
		String url=home.gethomepageurl();
		Assert.assertEquals(url,"https://automationexercise.com/");
	}
	@Test
	
	public void homepageproductslinktest() {
		boolean flag=home.productlinkexist();
		Assert.assertTrue(flag);
	}
	@Test
	public void homepagecartlinktest() {
		boolean flag=home.cartlinkexist();
		Assert.assertTrue(flag);
	
	}

}
