package com.evs.coding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Coding {

	public static void main(String[] args) {
		String str="this is a month of october";
				//"october of month a is this"

				String[] word=str.split(" ");
				for(int i=word.length-1; i>=0; i--){
				System.out.print(word[i]+" ");

				}
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static WebDriver driver;

	//@Test
	public void countLink() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("brocken link" + Keys.ENTER);
		List<WebElement> we = driver.findElements(By.xpath("//a[contains(@href,'/search')]"));
		for (int i = 0; i < we.size(); i++) {
			String saj = we.get(i).getAttribute("href");

			System.out.println(saj);
		}
	}
}