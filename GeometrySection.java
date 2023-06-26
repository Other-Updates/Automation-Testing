package com.automation_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GeometrySection extends LoginPage {
	
	@Test
	public void geometry() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@title='Geometry Chart'])[4]")).click(); // Enter geo-Chart
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("(//i[@class='uil-file-upload-alt '])[6]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//i[@class='uil-cog  ']")).click();
		driver.navigate().back();
		driver.quit();
		
}
}

