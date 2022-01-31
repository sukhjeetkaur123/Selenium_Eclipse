package PractiseOfTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends FirstPractiseOfTestNg{
@Test
	public void login() {
		
//		System.out.println("I am inside the test");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
@Test
	public void forgetPassword() {
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.navigate().back();
	}

}
