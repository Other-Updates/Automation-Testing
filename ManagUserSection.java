package com.automation_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ManagUserSection extends LoginPage {
	
	@Test
	public void manageUsers() throws InterruptedException {
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//i[@class='uil-users-alt ']")).click();    // Manager User ---> User Option
		driver.findElement(By.xpath("//a[@title='BUI Test regulatory user']")).click();  // Click on the user 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Cancel'])[1]")).click();  // click on Cancel in the user field
		
        driver.navigate().to("https://railroadsoftware.io/staging/trackAsset/client/#dashboard/dashboard/sitemap");
		driver.findElement(By.xpath("//i[@class='uil-user-square ']")).click(); // Enter into user roles & Permissions
		driver.findElement(By.xpath("//a[@title='Tester']")).click();  // Enter into Tester option 
		driver.findElement(By.xpath("//input[@name='ctrldiscard']")).click();  // After checking the form close
		
		driver.navigate().to("https://railroadsoftware.io/staging/trackAsset/client/#dashboard/dashboard/sitemap");
		driver.findElement(By.xpath("//i[@class='uil-edit-alt']")).click();  // Enter into the Edit profile 
		driver.findElement(By.id("frmbtn_discard")).click();  // After Verification Closing the form
		driver.findElement(By.xpath("//i[@class='uil-lock-alt']")).click(); // Enter into Change password field
		driver.findElement(By.xpath("//input[@title='Please enter old password']")).sendKeys("Sample");  // sample data in password[old]
		driver.findElement(By.xpath("//input[@title='Please enter new password']")).sendKeys("sample New"); // sample new password
		driver.findElement(By.xpath("//input[@title='Please Re-enter Password']")).sendKeys("Re enter the password "); // re-enter password
		driver.findElement(By.xpath("//input[@name='ctrldiscard']")).click();   // click cancel 
		
		driver.close();

}}

