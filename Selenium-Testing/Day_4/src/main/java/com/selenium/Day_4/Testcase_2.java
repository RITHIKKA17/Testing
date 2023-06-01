package com.selenium.Day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("Rithi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Rithi@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
		Thread.sleep(2000);
		driver.quit();


	}

}
