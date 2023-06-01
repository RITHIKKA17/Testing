package com.selenium.Day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Rithikka L K");
		driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Rithikka L K");
		driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'input-theme-8\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Reg Voucher");
		driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
		Thread.sleep(2000);
		driver.quit();


	}

}
