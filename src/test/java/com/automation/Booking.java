package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Booking extends DriverSetup{

	public static String baseURL = "https://www.phptravels.net/";
	
	
		
	@Test
	public static void PHPTravelsBooking() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@class,'text-center tours')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'select2-container form-control hotelsearch locationlisttours')]")).click();
		driver.findElement(By.xpath("//div[starts-with(text(),'Legoland Malaysia Day Pass')]")).click();
		driver.findElement(By.xpath("//div[@id='tourtype_chosen']//a[@class='chosen-single']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Yacht']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@action='https://www.phptravels.net/tours/search']//div[@id='airDatepickerRange-hotel']//div[@class='form-icon-left']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='datepickers-container']/div[8]/div[1]/div[1]/div[2]/div[13]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[contains(@action,'https://www.phptravels.net/tours/search')]//button[contains(@type,'button')][normalize-space()='+']")).click();
		driver.findElement(By.xpath("//form[contains(@action,'https://www.phptravels.net/tours/search')]//button[contains(@type,'submit')][normalize-space()='Search']")).click();
		
	
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/form/button")).click();
		
		
		driver.findElement(By.xpath("//a[@id='guesttab']")).click();
		driver.findElement(By.xpath("//span[starts-with(text(),'First Name')]")).sendKeys("Smith");
		driver.findElement(By.xpath("//span[normalize-space()='Last Name']")).sendKeys("San");
		driver.findElement(By.xpath("//div[@class='col-md-6 col-12 o2']//span[contains(text(),'Email')]")).sendKeys("smith@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Confirm']")).sendKeys("smith@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Contact Number']")).sendKeys("012345678901");
		driver.findElement(By.xpath("//span[normalize-space()='Address']")).sendKeys("Street");
		
		driver.findElement(By.xpath("//a[@class='chosen-single']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Bangladesh']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='CONFIRM THIS BOOKING']")).click();
		
		
		
	}
	
}
