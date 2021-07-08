package com.indeed.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;

public class IndeedATest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\brian\\selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		
		//Create Chrome driver to open the browser
		WebDriver driver = new FirefoxDriver();
		
		//Find WHAT field and enter "Selenium" text
		driver.get("http://indeed.com");
		
		//In Indeed.com find WHAT element and type "Quality Assurance"
		WebElement searchBox = driver.findElement(By.id("text-input-what"));
		searchBox.sendKeys("Quality Assurance");
		
		//Clear the WHERE field
		driver.findElement(By.id("text-input-where")).clear();
		
		//Find WHERE field and type "Washington DC" text
		WebElement searchBox1 = driver.findElement(By.id("text-input-where"));
		searchBox1.sendKeys("Washington DC");
		
		//Click Enter to Find Jobs
		searchBox1.submit();
		
		//Print the search result Title
		driver.getTitle();
		
		Thread.sleep(2000);
		//Print total number of search results and the time it took
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		//Print results
		System.out.println("Search Results: " + driver.findElement(By.id("searchCount")).getText());
		
	}

}
