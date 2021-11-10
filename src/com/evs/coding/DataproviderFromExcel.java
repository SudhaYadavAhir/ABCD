package com.evs.coding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.annotations.DataProviderAnnotation;

public class DataproviderFromExcel {
	Workbook wbook;

	public Workbook getWorkBook(String filePath) {
		File file = new File(filePath);
		InputStream is = null;
		try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] str = filePath.split("\\.");

		if (str[1].equalsIgnoreCase("xlsx")) {
			try {
				wbook = new XSSFWorkbook(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (str[1].equalsIgnoreCase("xls")) {
			try {
				wbook = new HSSFWorkbook(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("extention is wrong");
		}

		return wbook;
	}

	public Sheet getSheet(Workbook wbook, String sheetName) {
		Sheet sheetObj = wbook.getSheet(sheetName);
		return sheetObj;
	}

	public int rowCount(Sheet sheetObj) {
		int rowCount = sheetObj.getLastRowNum();
		return rowCount;
	}

	public int cellCount(Row rowObj) {
		int cellCount = rowObj.getLastCellNum();
		return cellCount;
	}

	public void dataSource() {
		Workbook wbook = getWorkBook("excelFile/excelsheet.xlsx");
		Sheet sheetObj = getSheet(wbook, "Sheet1");
		int rowCount = rowCount(sheetObj);
		Row rowObj = sheetObj.getRow(rowCount);
		int cellCount = cellCount(rowObj);
		// String[][] data= {{rowCount, cellCount}};

	}

	@DataProvider(name = "retest")
	public String[][] getdata() {
		DataproviderFromExcel dataProvider = new DataproviderFromExcel();
		Workbook work = dataProvider.getWorkBook("excelFile/excelsheet.xlsx");
		Sheet sheet = dataProvider.getSheet(work, "Sheet1");
		int totalrow = dataProvider.rowCount(sheet);

		Row roww = dataProvider.getRow(sheet, totalrow);
		int totalcol = dataProvider.cellCount(roww);

		String[][] data = new String[totalrow][totalcol];

		for (int i = 1; i < totalrow; i++) {
			for (int j = 0; j < totalcol; j++) {
				data[i-1][j] = dataProvider.getCellData(sheet, i, j);
			}
		}
		return data;
	}

	// public static void main(String[] args) {
	//DataproviderFromExcel dataProvider = new DataproviderFromExcel();
//		Workbook wbook = dataProvider.getWorkBook("excelFile/excelsheet.xlsx");
//		Sheet sheetObj = dataProvider.getSheet(wbook, "Sheet1");
//		int rowCount = dataProvider.rowCount(sheetObj);
//		Row rowObj=sheetObj.getRow(rowCount);
//		System.out.println(rowCount);
//		int cellCount=dataProvider.cellCount(rowObj);
//		System.out.println(cellCount);
//		Workbook work = dataProvider.getWorkBook("excelFile/excelsheet.xlsx");
//		Sheet sheet = dataProvider.getSheet(work, "Sheet1");
//		int row = dataProvider.rowCount(sheet);
//		System.out.println(row);
//		Row roww = dataProvider.getRow(sheet, 3);
//		int cell = dataProvider.cellCount(roww);
//		System.out.println(cell);

//		String cellData = dataProvider.getCellData(sheet,1, 1);
//		System.out.println(cellData);

	// }

	public String getCellData(Sheet sheetObj, int rowNum, int cellNum) {
		Row rowObj = sheetObj.getRow(rowNum);
		String cellValue = rowObj.getCell(cellNum).getStringCellValue();
		return cellValue;
	}

	public Row getRow(Sheet sheetObj, int num) {
		Row rowObj = sheetObj.getRow(num);
		return rowObj;
	}

	@BeforeMethod
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8888");
	}

	WebDriver driver;
	@Test(dataProvider = "retest")
	public void asdf(String userName, String password) {
		WebElement name = driver.findElement(By.name("user_name"));
		name.clear();
		name.sendKeys(userName);
		WebElement pass = driver.findElement(By.name("user_password"));
		pass.clear();
		pass.sendKeys(password);
		WebElement login = driver.findElement(By.name("Login"));
	}

}
