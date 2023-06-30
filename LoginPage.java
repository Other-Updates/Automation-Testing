package com.automation_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
    RemoteWebDriver driver = null;
	@BeforeTest
	public void logainAll() throws InterruptedException {
		;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://railroadsoftware.io/staging/trackAsset/client/#dashboard/dashboard/sitemap");
		driver.findElement(By.id("login_name")).sendKeys("brightuitesting@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("645218");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		
		

}}
	



