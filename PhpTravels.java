package com.miniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PhpTravels {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthika\\Selenium4Clockbatch\\Selenium\\Driver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();	
	driver.get("https://phptravels.org/register.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement firstname=driver.findElement(By.xpath("//input[@id='inputFirstName']"));
	firstname.sendKeys("sai");
	Thread.sleep(2000);		
	WebElement lastname=driver.findElement(By.xpath("//input[@id='inputLastName']"));
	lastname.sendKeys("satheesh");
	Thread.sleep(2000);	
	WebElement email=driver.findElement(By.id("inputEmail"));
	email.sendKeys("sai@gmail.com");	
	Thread.sleep(2000);	
	WebElement code=driver.findElement(By.id("inputCountry"));
	Select s=new Select(code);
	s.selectByVisibleText("India");
	Thread.sleep(2000);	
	WebElement phonenum=driver.findElement(By.id("inputPhone"));
	phonenum.sendKeys("962234892");
	Thread.sleep(2000);	
	WebElement company=driver.findElement(By.id("inputCompanyName"));	
	company.sendKeys("saipranav");
	Thread.sleep(2000);	
	WebElement street =driver.findElement(By.id("inputAddress1"));	
	street.sendKeys("Annasalai");
	Thread.sleep(2000);	
	WebElement street1 =driver.findElement(By.id("inputAddress2"));	
	street1.sendKeys("mountroad");
	Thread.sleep(2000);	
	WebElement city =driver.findElement(By.id("inputCity"));	
	city.sendKeys("chennai");
	Thread.sleep(2000);	
	WebElement state =driver.findElement(By.id("stateselect"));
	Select s1=new Select(state);
	s1.selectByVisibleText("Tamil Nadu");
	Thread.sleep(2000);	
	WebElement postcode =driver.findElement(By.id("inputPostcode"));	
	postcode.sendKeys("1234456");
	Thread.sleep(2000);	
	WebElement mobile2 =driver.findElement(By.id("customfield2"));	
	mobile2.sendKeys("345678899");
	Thread.sleep(2000);	
   WebElement password =driver.findElement(By.id("inputNewPassword1"));	
	password.sendKeys("kar@12345%$");
	Thread.sleep(2000);	
	 WebElement password1 =driver.findElement(By.id("inputNewPassword2"));	
		password1.sendKeys("kar@12345%$");
	}

}
