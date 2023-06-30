package com.automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AssertImageSection extends LoginPage {

	@Test
	public void assertImagesSection() throws InterruptedException {
		
		driver.findElement(By.xpath("(//i[@class='fa uil-check-circle'])[4]")).click(); // Enter into Bridges
		driver.findElement(By.xpath("(//td[@aria-describedby='list2_ce_equipment_name'])[10]")).click(); // click form selection check box
		driver.findElement(By.xpath("//a[@title='Test Bridge']")).click();   // Enter into form
		driver.findElement(By.xpath("(//a[@title='Asset Details'])[1]")).click(); // Assert field selection
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Asset Photos']")).click();
		Thread.sleep(1000);
		// Click on assert upload button 
		WebElement fileInput = driver.findElement(By.xpath("(//input[@name='update_asset_images_new_files[]'])[1]")); 
		// Single Image 
		String imagePath = "D:\\eclipse-workspace\\TestAutomationScript\\TestImages/data1.jpg";  // Image path
		fileInput.sendKeys(imagePath); // Upload Image
		driver.findElement(By.xpath("//button[@id='close-asset-photo-popup']")).click();  // Close screen afte upload Img
		
		
		driver.findElement(By.xpath("//input[@id='184']")).click();  // Drop down
		Thread.sleep(1000);
        WebElement imgButton = driver.findElement(By.xpath("(//a[@class='upload-img view-image-icon asset_add_images'])[4]"));
        Thread.sleep(1000);
        imgButton.click();
        WebElement f1 = driver.findElement(By.id("assetdetails_defects_page_add_inputFile"));
		 // Multiple Image.
        String[] imagePaths = {"D:\\eclipse-workspace\\TestAutomationScript\\TestImages/data1.jpg",
                "D:\\eclipse-workspace\\TestAutomationScript\\TestImages/data2.jpg",
                "D:\\eclipse-workspace\\TestAutomationScript\\TestImages/data4.jpg",
                "D:\\eclipse-workspace\\TestAutomationScript\\TestImages/data5.jpg"};
	for(String imgpath : imagePaths) {
		f1.sendKeys(imgpath);
	}
	driver.findElement(By.xpath("//div[@data-action='render']")).click();	
	Thread.sleep(5000);

	driver.quit();

}}



