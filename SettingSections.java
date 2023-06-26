package com.automation_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SettingSections extends LoginPage {
	

	@Test
	public void settingSection() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//i[@class='uil-cog '])[1]")).click(); // Enter into Assert Fields
		WebElement a1 = driver.findElement(By.xpath("//a[contains(text(),'Linear Asset Type')]"));
		a1.click();   // checking the assert type 
		WebElement text = driver.findElement(By.id("text_element1"));
		text.sendKeys("Enter the valid data in message fields");  // passing string
		driver.findElement(By.id("preview_form_button")).click();  // Click in Preview
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='close fancybox-close']")).click();  // Close the preview form
		driver.findElement(By.xpath("(//input[@value='Cancel'])[1]")).click();  // cancel the request 
		driver.navigate().back(); // back URL
		driver.findElement(By.xpath("(//i[@class='uil-map-marker '])[2]")).click();  // Enter into Location fields
		driver.findElement(By.xpath("//a[@title='RIVER']")).click(); // Checking the form
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Cancel'])[1]")).click();
		driver.navigate().to("https://railroadsoftware.io/staging/trackAsset/client/#dashboard/dashboard/sitemap");
		driver.findElement(By.xpath("(//i[@class='icomoon-icon-users '])[1]")).click();  // Enter Depertment in Setting
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("(//i[@class='icomoon-icon-users '])[2]")).click();  // Enter Work Oder in Setting 
		driver.findElement(By.xpath("//a[@title='Departments']")).click();  // enter form in w-order
		driver.navigate().to("https://railroadsoftware.io/staging/trackAsset/client/#dashboard/dashboard/sitemap");
		driver.findElement(By.xpath("//i[@class='icon14 entypo-icon-settings ']")).click();  // Enter Notification 
		
		
		driver.quit();
	
	
}}

