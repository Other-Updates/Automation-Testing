package com.automation_test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WorkOrderSection extends LoginPage {
	
	@Test
	public void workOrderSection() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//i[@class='uil-plus-circle'])[1]")).click();// Actions on Add new Work records
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Select Work Order Template')])[1]")).click(); // click on drop Down
		driver.findElement(By.xpath("//li[contains(text(),'Third Template')]")).click();  // Option selected on Drop Down
		// Start Date 
		driver.findElement(By.xpath("(//span[@title='Due Date'])[1]")).click();  // Action on Date range fields
		driver.findElement(By.xpath("//select[@data-handler='selectMonth']")).click();
		driver.findElement(By.xpath("(//option[@value='3'])[6]")).click(); // click on month
		driver.findElement(By.xpath("//select[@data-handler='selectYear']")).click();   
		driver.findElement(By.xpath("(//option[@value='2022'])")).click();  // click on Year 
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[18]")).click();  // select the day
		driver.findElement(By.xpath("(//input[@value='Cancel'])[1]")).click();
		driver.navigate().to("https://railroadsoftware.io/staging/trackAsset/client/#dashboard/dashboard/sitemap");
		
		driver.close();


}}

