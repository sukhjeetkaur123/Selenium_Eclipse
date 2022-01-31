package PractiseOfTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	WebDriver driver;
	String path;

	@DataProvider(name="LoginData")
	
	public Object [][] login(){
		Object [][] arr = new Object[2][2];
		arr[0][0]="abc";
		arr[0][1]="fff";
		arr[1][0]="ggg";
		arr[1][1]="gdfdf";
		return arr;
	}



@Test(dataProvider="LoginData")
   void checkData(String name,String pass) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SukhjeetKaur\\Downloads\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().window().maximize();
 
	driver.findElement(By.id("txtUsername")).sendKeys(name);

	driver.findElement(By.id("txtPassword")).sendKeys(pass);
	driver.findElement(By.id("btnLogin")).click();
	System.out.println("name is"+name);
	System.out.println("pass is:"+pass);
	
}
}
