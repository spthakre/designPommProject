package com.jbk.designPommProject;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	Driver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumWorkspace\\popupExample\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // chrome luanch
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();// click on go btn
		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		String text = alert.getText();

		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert msg");
		} else {
			System.out.println("Incorrect alert msg");

		}
		alert.accept(); // click on ok btn

		driver.close();
	}

}
