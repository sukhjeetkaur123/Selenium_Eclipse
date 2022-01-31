package PractiseOfTestNg;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends FirstPractiseOfTestNg {
	public static String actualTitle;
	@Test 
	public void verifyHomePage() {
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
		
	}
	@Test
	public void logOut() {
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
