package Seleniumpkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class DemodiveshCheckError {
	void launch() throws IOException, InterruptedException {
//		String uname,pass;

//		WebDriver d=new ChromeDriver();
//		d.manage().window().maximize();
//		d.get("https://opensource-demo.orangehrmlive.com/");
		String p=System.getProperty("user.dir")+"//TestLoginData/devesh.xlsx";
//		System.out.println(p);
		FileInputStream f=new FileInputStream(p);
		XSSFWorkbook wb= new XSSFWorkbook(f);
		XSSFSheet sheet= wb.getSheet("Sheet1");


		System.out.println(sheet.getLastRowNum());
//		for(int i=1;i<=sheet.getLastRowNum();i++) {
//		//url=sheet.getRow(i).getCell(0).getStringCellValue();
//		//d.get(url);
//		uname=sheet.getRow(i).getCell(0).getStringCellValue();
//		d.findElement(By.name("txtUsername")).sendKeys(uname);
//		pass=sheet.getRow(i).getCell(1).getStringCellValue();
//		d.findElement(By.id("txtPassword")).sendKeys(pass);
//		d.findElement(By.id("btnLogin")).click();
//		String expected="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
//		FileOutputStream o = new FileOutputStream(p);
//		HSSFCell cell = sheet.getRow(i).createCell(2);
//		String actualname = d.getCurrentUrl();
//		if(expected.equals(actualname)){
//		cell.getRow().createCell(2).setCellValue("pass");
//		}else{
//		cell.getRow().createCell(2).setCellValue("fail");
//		}
//		wb.write(o);
//
//		}
//		wb.close();
//		d.quit();



	}



		public static void main(String[] args) throws IOException, InterruptedException {
//		WebDriverManager.chromedriver().setup();
		DemodiveshCheckError a=new DemodiveshCheckError();
		a.launch();

		}
}

