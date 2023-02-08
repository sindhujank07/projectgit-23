package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver browserLanuch() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	return driver;
	
	
}

			
		}

	

