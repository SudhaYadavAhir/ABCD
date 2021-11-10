package com.evs.automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Automation {
	public static void main(String[] args) {
		m1();
	}
public static void m1() {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='Login']")).click();
	TakesScreenshot dgfdsa=(TakesScreenshot)driver;
	File tempFile= dgfdsa.getScreenshotAs(OutputType.FILE);
	File sourceFile=new File("Sudha.png");
	try {
		Files.copy(tempFile, sourceFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
