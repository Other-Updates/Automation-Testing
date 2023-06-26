package com.automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DashBoardPage extends LoginPage {
	
	@Test
	public void dashBoardPage () throws InterruptedException {
	// Inspection on DashBoard ---> HomePage
		
	WebElement home = driver.findElement(By.xpath("//i[@class='icomoon-icon-home ']"));
	home.click();
	Thread.sleep(3000);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	String title = driver.getTitle();
	System.out.println(title);
	// click on Inspection field 
	WebElement c1 = driver.findElement(By.xpath("//div[@class='new-dash-tit wo-tit MainWorkInspection']"));
	c1.click();
	Thread.sleep(3000);
	WebElement c2 = driver.findElement(By.xpath("//div[@class='new-dash-tit wo-tit MainWorkOrder']"));
	c2.click();
	Thread.sleep(2000);
	driver.close();

}}



