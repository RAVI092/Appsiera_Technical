package com.pages;

import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Home {

	@Test
	public void m1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://staging.twohootsapp.com/");
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d1.findElement(By.xpath("//*[@class='btn btn-link guest-link']")).click();
		d1.findElement(By.xpath("//*[@id='new_telco']//i[1]")).click();
		d1.findElement(By.xpath("//*[text()='Internet']")).click();
		d1.findElement(By.xpath("//*[@class='container pagenav-container']")).click();
		d1.findElement(By.xpath("//*[@for='NBN - Personal - Postpaid']")).click();
		d1.findElement(By.xpath("//*[@class='btn btn-pagenav btn-block']")).click();
	
	d1.findElement(By.xpath("(//*[@class='checkbox-text clearfix radio-label'])[3]")).click();
		d1.findElement(By.xpath("//*[@class='btn btn-pagenav btn-block']")).click();
		JavascriptExecutor j=(JavascriptExecutor)d1;
		WebElement w=d1.findElement(By.xpath("//*[@class='list-form']/child::div[10]"));
		j.executeScript("arguments[0].scrollIntoView();",w);
		
		d1.findElement(By.xpath("//*[@class='list-form']/child::div[10]")).click();
		d1.findElement(By.xpath("//*[@class='list-form']/child::div[8]")).click();
		d1.findElement(By.xpath("//*[@class='btn btn-pagenav btn-block']")).click();
		d1.findElement(By.xpath("//*[contains(text(),'Disappo')]")).click();
		d1.findElement(By.xpath("//*[@class='btn btn-pagenav btn-block']")).click();
		d1.findElement(By.id("address1")).sendKeys("67 View St");
		d1.findElement(By.id("city")).sendKeys("Woollahra");
		
		Select s=new Select(d1.findElement(By.id("state")));
		s.selectByValue("2");
		d1.findElement(By.id("postcode")).sendKeys("2025");
		
	WebDriverWait w3=new WebDriverWait(d1, 10);
	w3.until(ExpectedConditions.elementToBeClickable(d1.findElement(By.id("submit-btn"))));
		
		Thread.sleep(5000);
		d1.findElement(By.id("submit-btn")).click();
		d1.findElement(By.xpath("//*[@for='multiple-orgs']")).click();
		d1.findElement(By.xpath("(//*[@type='text' and @placeholder='Enter Organisation'])[position()=2]")).sendKeys("telstra");
	Thread.sleep(5000);
		d1.findElement(By.xpath("//*[text()='Telstra']")).click();
		
		d1.findElement(By.xpath("//*[@class='form-control select-multiple-org list autocomplete-2']")).sendKeys("optus");
		Thread.sleep(5000);
		d1.findElement(By.xpath("//*[text()='Optus']")).click();
		d1.findElement(By.xpath("//*[@class='btn btn-pagenav btn-block organisation-button']")).click();
		
		Select s1=new Select(d1.findElement(By.id("issue_occur")));
		s1.selectByValue("2");
		
		Select s2=new Select(d1.findElement(By.id("issue_occur_when")));
		s2.selectByValue("2");
		
		d1.findElement(By.xpath("(//*[@type='number'])[1]")).sendKeys("101");
		d1.findElement(By.xpath("(//*[@type='number'])[2]")).sendKeys("10");
		d1.findElement(By.xpath("(//*[@type='number'])[3]")).sendKeys("1");
		d1.findElement(By.xpath("(//*[@type='number'])[4]")).sendKeys("10");
		d1.findElement(By.xpath("(//*[@type='number'])[5]")).sendKeys("10");
		d1.findElement(By.xpath("(//*[@class='form-control device-child'])[1]")).sendKeys("3");
		d1.findElement(By.xpath("(//*[@class='form-control device-child'])[3]")).sendKeys("1");
		
		Actions a=new Actions(d1);
		a.moveToElement(d1.findElement(By.xpath("(//*[@class='form-control device-child'])[3]"))).build().perform();
		
		d1.findElement(By.xpath("//*[@class='btn btn-pagenav btn-block']")).click();
		
		Select s3=new Select(d1.findElement(By.xpath("(//*[@class='form-control'])[1]")));
		s3.selectByValue("1");
		
		Select s4=new Select(d1.findElement(By.xpath("(//*[@class='form-control'])[2]")));
		s4.selectByValue("7");
		
		Select s5=new Select(d1.findElement(By.xpath("(//*[@class='form-control'])[12]")));
		s5.selectByValue("5");
		
		
		Select s6=new Select(d1.findElement(By.xpath("(//*[@class='form-control'])[22]")));
		s6.selectByValue("1");
		d1.findElement(By.xpath("//*[@class='container pagenav-container']")).click();
	
	
		Select s7=new Select(d1.findElement(By.xpath("(//*[@class='form-control'])[1]")));
		s7.selectByValue("1");
		
		Select s8=new Select(d1.findElement(By.xpath("(//*[@class='form-control'])[3]")));
		s8.selectByValue("2");
		
		Select s9=new Select(d1.findElement(By.xpath("(//*[@class='form-control'])[4]")));
		s9.selectByValue("3");
		
		Select s10=new Select(d1.findElement(By.xpath("(//*[@class='form-control'])[5]")));
		s10.selectByValue("4");
		
		Select s11=new Select(d1.findElement(By.xpath("(//*[@class='form-control'])[6]")));
		s11.selectByValue("5");
		
		d1.findElement(By.xpath("(//*[@class='form-control'])[7]")).sendKeys("12-08-2019");
		
		

		d1.findElement(By.xpath("(//*[@class='form-control'])[8]")).sendKeys("13-08-2019");
		
		d1.findElement(By.xpath("(//*[@class='form-control'])[9]")).sendKeys("14-08-2019");
		
		Select s15=new Select(d1.findElement(By.xpath("(//*[@class='form-control'])[10]")));
		s15.selectByValue("4");
		
		d1.findElement(By.xpath("//*[@class='container pagenav-container']")).click();
		
		d1.findElement(By.xpath("//*[@class='a-skipnext']")).click();
		
		
		Select s16 =new Select(d1.findElement(By.id("contact-title")));
		s16.selectByValue("Mr");
		
		
		JavascriptExecutor j1=(JavascriptExecutor)d1;
		WebElement w1=d1.findElement(By.xpath("(//*[@class='form-group'])[position()=4]"));
		j1.executeScript("arguments[0].scrollIntoView();",w1);
		
		
		
		d1.findElement(By.id("contact-firstname")).sendKeys("Ravi");
		d1.findElement(By.id("contact-lastname")).sendKeys("Shekhar");
		d1.findElement(By.id("contact-email")).sendKeys("ravi.shekhar052@gmail.com");
		
		d1.findElement(By.id("submit-step")).click();
		
		
		
	}
	
}
