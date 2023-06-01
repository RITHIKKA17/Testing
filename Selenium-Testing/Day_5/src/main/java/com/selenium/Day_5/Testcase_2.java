package com.selenium.Day_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.quit();

	}

}
