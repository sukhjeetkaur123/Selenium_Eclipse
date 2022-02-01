package PractiseOfTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PractiseDataProviderByExcelSheet {
	WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SukhjeetKaur\\Downloads\\chromedriver.exe");
		   driver = new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.manage().window().maximize();
	}
	@DataProvider
	public void getLoginData() {
		
	}
	@Test
	public void liginTest(String userName,String pass) {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);

		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
	}

}
