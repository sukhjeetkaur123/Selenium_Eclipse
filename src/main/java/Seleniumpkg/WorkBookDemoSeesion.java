package Seleniumpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkBookDemoSeesion {
	String path;
	WebDriver driver;
	
//	FileInputStream fs = new FileInputStream("D:\\DemoFile.xlsx");
	//Creating a workbook
//	XSSFWorkbook workbook = new XSSFWorkbook(fs);
//	XSSFSheet sheet = workbook.getSheetAt(0);
	void readExcelSheet() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SukhjeetKaur\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.manage().window().maximize();
		 path =System.getProperty("user.dir")+"//TestLoginData/ready.xlsx";
		FileInputStream f1 = new FileInputStream(path);
		XSSFWorkbook wr = new XSSFWorkbook(f1);
		XSSFSheet sh = wr.getSheetAt(0);
		
		if (sh == null) throw new IllegalArgumentException("Sheet with sheet name " + sh + " does not exist");
		System.out.println(" the sheet last row number is:"+sh.getLastRowNum());
		
	//updated-test
		
		for(int i =1;i<=sh.getLastRowNum();i++) {
		String userName=sh.getRow(i).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys(userName);
//	sh.getRow(i).createCell(2).setCellValue("suceesfully");
			
			String pass=sh.getRow(i).getCell(1).getStringCellValue();
			
			driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys(pass);
		sh.getRow(i).createCell(3).setCellValue("soinia");
		FileOutputStream outFile =new FileOutputStream(path);
		wr.write(outFile);
			
			driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
		}
	}
	public static void main(String[] args) throws Exception {
		WorkBookDemoSeesion wk = new WorkBookDemoSeesion();
		wk.readExcelSheet();
	}
	

}
