package com.evs.coding;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataPrivide {
	WebDriver driver;
//	@DataProvider(name = "login")
//	public String[][] dataFormate() {
//		String[][] data = { { "sudha", "yadav" }, { "admin", "admin" }, { "yadav", "yadavG" } };
//		return data;
//	}
	
	@BeforeMethod
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		}
	
	
//	@Test(dataProvider = "login")
//	public void Login(String userName, String password) {
//		WebElement userName_ED=driver.findElement(By.xpath("//input[@name='user_name']"));
//		userName_ED.clear();
//		userName_ED.sendKeys(userName);
//		WebElement password_ED=driver.findElement(By.xpath("//input[@name='user_password']"));
//		password_ED.clear();
//		password_ED.sendKeys(password);
//		WebElement loginButton=driver.findElement(By.xpath("//input[@name='Login']"));
//		loginButton.click();	
//	}
//	
	
	@DataProvider(name = "retest")
	public String[][] getdata() {
		DataproviderFromExcel dataProvider = new DataproviderFromExcel();
		Workbook work = dataProvider.getWorkBook("excelFile/excelsheet.xlsx");
		Sheet sheet = dataProvider.getSheet(work, "Sheet1");
		int totalrow = dataProvider.rowCount(sheet);

		Row roww = dataProvider.getRow(sheet, totalrow);
		int totalcol = dataProvider.cellCount(roww);

		String[][] data = new String[totalrow][totalcol];

		for (int i = 0; i < totalrow; i++) {
			for (int j = 0; j < totalcol; j++) {
				data[i][j] = dataProvider.getCellData(sheet, i, j);
			}
		}
		return data;
	}

	
	


	
}
