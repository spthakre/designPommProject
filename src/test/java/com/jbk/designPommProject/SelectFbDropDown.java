package com.jbk.designPommProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFbDropDown {

	@Test
	public void SelectDDValue() throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumWorkspace\\designPommProject\\src\\main\\java\\com\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser
		driver.get("http://www.facebook.com/");// get url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("shubham");
		driver.findElement(By.xpath("//*[@id='u_0_o']")).sendKeys("Thakre");
		driver.findElement(By.xpath("//*[@id='u_0_r']")).sendKeys("1234567890");

		Thread.sleep(5000);
		driver.findElement(By.id("u_0_7")).click();
		Thread.sleep(3000);

		// for Select dropDown Value
		WebElement month_dropdown = driver.findElement(By.id("month"));// click on visible btn
		Select month_dd = new Select(month_dropdown);
        // for dd value aug
		month_dd.selectByVisibleText("Aug");// select dd value

		// // for dd value dec
		// month_dd.selectByValue("12");
		// Thread.sleep(3000);
		//
		// // for dd value jan
		// month_dd.selectByIndex(1);
		
		
		
		// for day value
		WebElement day_dropdown = driver.findElement(By.id("day"));
		Select dobday = new Select(day_dropdown);
		dobday.selectByVisibleText("16");

		
		// for year value
		WebElement year_dropdown = driver.findElement(By.id("year"));
		Select dobyear = new Select(year_dropdown);
		dobyear.selectByVisibleText("1994");

		
		driver.findElement(By.id("u_0_13")).click();

		Thread.sleep(5000);
		driver.close();
	}
}
