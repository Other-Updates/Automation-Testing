package com.automation_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
    RemoteWebDriver driver = null;
	@BeforeTest
	public void logainAll() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://railroadsoftware.io/staging/trackAsset/client/#dashboard/dashboard/sitemap");
		
	    // Get the page load and network timings using JavaScriptExecutor
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        long pageLoadTime = (long) jsExecutor.executeScript("return performance.timing.loadEventEnd - performance.timing.navigationStart;");
        long networkTime = (long) jsExecutor.executeScript("return performance.timing.responseEnd - performance.timing.requestStart;");
        // Output the timings
        System.out.println("Page Load Time: " + pageLoadTime + " milliseconds");
        System.out.println("Network Time: " + networkTime + " milliseconds");

		driver.findElement(By.id("login_name")).sendKeys("brightuitesting@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("645218");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		
		

}}
	



