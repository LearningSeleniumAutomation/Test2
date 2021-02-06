package com.qa.test.Login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.login.BrowserSelection;

public class LoginTest {
private WebDriver driver;
	@Test
	public void doTestLogin()
	{
		BrowserSelection bs = new BrowserSelection(driver);
		bs.doSelectWebBrowser("Chrome Browser");
	}
	
}
