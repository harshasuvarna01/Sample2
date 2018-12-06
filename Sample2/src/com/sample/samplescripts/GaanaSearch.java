package com.sample.samplescripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaanaSearch 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Open browser
		driver.manage().window().maximize();
		
		//open browser
		driver.get("https://gaana.com/");
		
		//click on search icon
		driver.findElement(By.id("searchTop")).click();
		Thread.sleep(1000);
		
		//search for eminem
		driver.findElement(By.id("sb")).sendKeys("eminem");
		driver.findElement(By.className("search_btn")).click();
		Thread.sleep(1000);
		
		//click on album
		driver.findElement(By.className("imghover")).click();
		Thread.sleep(1000);
		
		//click on play all
		driver.findElement(By.id("p-list-play_all")).click();
		
	}

}
