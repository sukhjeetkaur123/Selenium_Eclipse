package PractiseOfTestNg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class FirstPractiseOfTestNg {
public static WebDriver driver;


@BeforeSuite
  public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SukhjeetKaur\\Downloads\\chromedriver.exe");
    driver = new ChromeDriver();
	  
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  
  }
@AfterSuite
    public void closeDriver() {
        driver.close();

}
}
