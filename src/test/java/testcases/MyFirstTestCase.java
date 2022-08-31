package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class MyFirstTestCase extends PageObject {
	@Managed
	WebDriver driver;
	@Test
	public void myGoogleSearch()
	{
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Bajaj NS 200",Keys.ENTER);
		
	}
}
