package com.automation_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InspectionSection extends LoginPage {

	@Test
	public void inpsectionSection() throws InterruptedException {

		// Check on Manage Field
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//i[@class='uil-file-check-alt ']")).click(); // Open Manage option
		WebElement b1 = driver.findElement(By.xpath("//div[@class='manageui-dd']"));
		b1.click(); // Open Manage Button
		WebElement reload = driver.findElement(By.xpath("//a[@class='uigrid-refresh-btn1']"));
		reload.click(); // Reloading the Manage Option
        // Opening form after the reloading
        //driver.navigate().to("https://railroadsoftware.io/staging/trackAsset/client/#inspections/other_inspection/other_inspect/add|mode|Update|id|b2pVw9OdagegB2EOuHNZ8BT0wvbpoZNCBZIPhV4Tbag|parent||child||inspection_id|mmgFXyO_V7DswK5jtUKWuAEp0YPM2ArOoSUkUSU3asw|formid|RBmNlT5Bh52XR4eIKAo2EjXN5Shr4BJ7D5VqovhSTDo");
		driver.navigate().back();
		driver.findElement(By.xpath("//i[@class='uil-file-landscape-alt ']")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-seek-end']")).click(); // End of the List
		driver.navigate().back();
		driver.findElement(By.xpath("//i[@class='uil-files-landscapes-alt ']")).click(); // Combined Form
		Thread.sleep(2000);
		driver.close();

}}


