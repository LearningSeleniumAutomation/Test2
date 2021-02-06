package com.qa.login;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.utilities.GetLogs;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSelection {
	
	private WebDriver driver=null;
	
	
	public BrowserSelection(WebDriver driver) 
	{
	this.driver=driver;	
	}

	
	public void doSelectWebBrowser(String browserName)
	{
		WebDriverManager.chromedriver().setup();
		
		if(browserName.equalsIgnoreCase("Chrome Browser"))
	
			{
			driver = new ChromeDriver();
			
			
			}
		else if(browserName.equalsIgnoreCase("FireFox Browser"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Please Enter either" + "Chrome Browser" + "or" + "FireFox Browser"  );
			System.out.println("Please Enter either" + "Chrome Browser" + "or" + "FireFox Browser"  );
		}
	}

}
