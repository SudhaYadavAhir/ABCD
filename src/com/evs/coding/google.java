package com.evs.coding;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement we=driver.findElement(By.xpath("//input[@name='q']"));
			we.sendKeys("mang");
			List<WebElement> listOfElement=driver.findElements(By.xpath("//div[@class='pcTkSc']"));
			for (int i=0; i<listOfElement.size(); i++) {
				WebElement as=listOfElement.get(i);
				String text=as.getText();
				System.out.println(text);
			}
	}

}
