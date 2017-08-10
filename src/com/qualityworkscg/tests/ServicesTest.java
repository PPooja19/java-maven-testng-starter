package com.qualityworkscg.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ServicesTest extends AbstractTest{
	
	@Test
	public void verifyNavigationMobileAutomation () throws InterruptedException{
		page.clickServices();
		Thread.sleep(1000);
		page.clickMobileAutomation();
		Thread.sleep(2000);
		Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | Mobile and Web Automation", "Testing if title is QualityWorks Consulting Group | Mobile and Web Automation");
	}
	
	@Test
	public void verifyNavigationDevOpsConsultancy () throws InterruptedException{
		page.clickServices();
		Thread.sleep(1000);
		page.clickDevOpsConsultancy();
		Thread.sleep(2000);
		Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | DevOps Consultancy", "Testing if title is QualityWorks Consulting Group | Mobile and Web Automation");
	}
	
	@Test
	public void verifyNavigationSoftwareDevelopment () throws InterruptedException{
		page.clickServices();
		Thread.sleep(1000);
		page.clickSoftwareDevelopment();
		Thread.sleep(2000);
		Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | Software Development Consultancy", "Testing if title is QualityWorks Consulting Group | Mobile and Web Automation");
	}
	
	@Test
	public void verifyNavigationAgileCoaching () throws InterruptedException{
		page.clickServices();
		Thread.sleep(1000);
		page.clickAgileCoaching();
		Thread.sleep(2000);
		Assert.assertEquals(page.getTitle(), "QualityWorks Consulting Group | Agile Coaching and Training", "Testing if title is QualityWorks Consulting Group | Mobile and Web Automation");
	}

}
