package com.automation_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PrventativeMaintenaneSection extends LoginPage {
	
	@Test(priority = 1)
	public void prventativeMaintenane() throws InterruptedException {
		
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@title='Manage PM']")).click();  // Enter into Manage pm
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='PM Forms']")).click();  // Enter into Pm forms
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='PM Combined Forms']")).click();  // Enter into Pm combained 
	driver.navigate().back();
	driver.close();
	
	
}
}
