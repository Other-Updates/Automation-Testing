package com.automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DashBoardPage1 extends LoginPage{
	
	@Test
	public void navigationPages () throws InterruptedException {
		
		// home-->DashBoard-->Map InterFace 
		 
	driver.findElement(By.xpath("//i[@class='uil-map-marker ']")).click(); 
	Thread.sleep(25000); // More time Consumed for Map loading
	// Navigations on Map ON Button
	WebElement mapOn = driver.findElement(By.xpath("//button[@class='mp-off mp_off']"));
	mapOn.click();
    driver.close();

}}


