package com.automation_test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogOutSection extends LoginPage {

	@Test
	public void logOut() {
		driver.findElement(By.xpath("(//i[@class='uil-sign-out-alt'])[1]")).click();  // click on logout
		driver.quit();
	

}}


