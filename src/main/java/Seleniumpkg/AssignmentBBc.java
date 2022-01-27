package Seleniumpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class AssignmentBBc
{
//	public static void main(String[] args) {
	WebDriver driver;
	void lunch() {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SukhjeetKaur\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//        driver.get("https://www.bbc.com/news");
        driver.get("https://www.facebook.com/signup");
        driver.manage().window().maximize();
      WebElement rr =  driver.findElement(By.xpath("//div[@class='_1lch']/following::button[@type='submit']"));
      rr.click();
////        simple child
       driver.findElement(By.xpath("(//div[@class='_5dbb'])[1]/child::div/child::div")).sendKeys("abs");  
////   parent to signup to first name
       driver.findElement(By.xpath("//button[@type='submit']/parent::div/parent::div/child::div/child::div/child::div/child::div/child::div/div[contains(text(),\"First name\")]")).click();
////        mobile to password\
      driver.findElement(By.xpath("//div[@class=\"mbm _a4y\"]/following::div[contains(text(),\"New password\")]")).click();
//        
////proceding div
        driver.findElement(By.xpath("//input[@type=\"password\"]/preceding::div[contains(text(),\"Mobile number or email address\")]")).click();
	
}
	public static void main(String[] args) {
		AssignmentBBc as=new AssignmentBBc();
		as.lunch();
	}
}