package com.automation_test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ReportsSection extends LoginPage {
	
	@Test
	public void reportsSections() throws InterruptedException {
		
		driver.findElement(By.xpath("(//i[@class='uil-chart-pie '])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='330']")).click(); // click on checkbox [record]
		driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[5]")).click(); // Select on manage drop down
		driver.findElement(By.xpath("//i[@class='uil-file-download']")).click();   // click on selected file
		driver.navigate().back();
		driver.findElement(By.xpath("(//i[@class='uil-chart-pie '])[2]")).click();  // enter into Archived chart
		driver.quit();

}}
