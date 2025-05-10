package com.globalpayment.devInterviewPractise;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumScript3 {
	public static void main(String[] args) {
	
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking","enable-automation"));
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(chromeOptions);
	// 
	driver.get("https://www.naukri.com/");
	
	driver.quit();
}

}
