package com.w3schools.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.w3schools.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties properties;

	public TestBase() {

		try {
			properties = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Venky\\eclipse-workspace\\W3SchoolsTest\\src\\main\\java\\com\\w3schools\\qa\\config\\config.properties");
			properties.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		String browserName = properties.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/SELENIUM/Selenium/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait);
		driver.get(properties.getProperty("url"));
	}
}
