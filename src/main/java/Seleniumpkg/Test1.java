package Seleniumpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {

//		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SukhjeetKaur\\Downloads\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
