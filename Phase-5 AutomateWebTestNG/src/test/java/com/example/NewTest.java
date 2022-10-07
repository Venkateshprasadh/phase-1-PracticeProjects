package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver wd;
    @Parameters("browser")
  @BeforeTest
	public void config(String browser) 
    {
    	
    	switch(browser) {
    		case "chrome":WebDriverManager.chromedriver().setup();
    			wd=new ChromeDriver();
    			break;
    		case "edge":WebDriverManager.edgedriver().setup();
    			wd=new EdgeDriver();
    			break;
	
	}
	wd.manage().window().maximize();
    }
    
	@AfterTest
	public void quitbrowser() {
		wd.quit();
	}
	
	@Parameters("url1")
	  @Test(priority = 1)
	  public void register(String url1) {
	 // wd.get("https://magento.softwaretestingboard.com/customer/account/create/");
	  wd.get(url1);
	  String title=wd.getTitle();
	  String url=wd.getCurrentUrl();
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals("Create New Customer Account Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites",title,"Register title not matched");
	  System.out.println("after title test");
	  sa.assertEquals("https://magento.softwaretestingboard.com/customer/account/create/",url,"url not matched");
	  sa.assertAll();
	  //firstname
	  wd.findElement(By.id("firstname")).sendKeys("Venkateshprasadh");
	  //lastname
	  wd.findElement(By.id("lastname")).sendKeys("R	");
	  //email_address
	  wd.findElement(By.id("email_address")).sendKeys("venkateshprasadh14@gmail.com");
	  //password
	  wd.findElement(By.id("password")).sendKeys("Shrenidhi@392004");
	  //password_confirmation
	  wd.findElement(By.id("password-confirmation")).sendKeys("Shrenidhi@392004");
	  ////*[@id="form-validate"]/div/div[1]/button/span
	  wd.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();
	  //https://magento.softwaretestingboard.com/customer/account/
	  String urlcheck=wd.getCurrentUrl();
	  sa.assertEquals("https://magento.softwaretestingboard.com/customer/account/",url,"register fail or already registered");
	  }
	
	
	@Parameters("url2")
	  @Test(priority = 2)
	  	public void login(String url2) {
		 // wd.get("https://magento.softwaretestingboard.com/customer/account/create/");
		  wd.get(url2);
		  String title=wd.getTitle();
		  String url=wd.getCurrentUrl();
		  SoftAssert sa = new SoftAssert();
		  sa.assertEquals("Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites",title,"login title not matched");
		  System.out.println("after login title test");
		  sa.assertEquals("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dC8%2C/",url,"login url not matched");
		  sa.assertAll();
		  wd.findElement(By.id("email")).sendKeys("venkateshprasadh14@gmail.com");
		  wd.findElement(By.id("pass")).sendKeys("Shreenidhi@392004");
		  wd.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		  //https://magento.softwaretestingboard.com/customer/account/
		  String urlcheck=wd.getCurrentUrl();
		  sa.assertEquals("https://magento.softwaretestingboard.com/customer/account/",url,"login failed");
		  }
		//https://magento.softwaretestingboard.com/
  
	@Parameters("url3")
	  @Test(priority = 3)
	  	public void search(String url3) {
		 // wd.get("https://magento.softwaretestingboard.com/customer/account/create/");
		  wd.get(url3);
		  String title=wd.getTitle();
		  String url=wd.getCurrentUrl();
		  SoftAssert sa = new SoftAssert();
		  sa.assertEquals("Home Page - Magento eCommerce - website to practice selenium | demo website for automation testing | selenium practice sites | selenium demo sites | best website to practice selenium automation | automation practice sites Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites",title,"search title not matched");
		  System.out.println("after login title test");
		  sa.assertEquals("https://magento.softwaretestingboard.com/",url,"search url not matched");
		  sa.assertAll();
		  wd.findElement(By.id("search")).sendKeys("shirt");
		  wd.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button")).click();
		  String urlcheck=wd.getCurrentUrl();
		  sa.assertEquals("https://magento.softwaretestingboard.com/catalogsearch/result/?q=shirt",url,"search failed");
		  }
		
	
	@Parameters("url4")
	  @Test(priority = 4)
	  	public void addtocart(String url4) {
		 // wd.get("https://magento.softwaretestingboard.com/customer/account/create/");
		  wd.get(url4);
		  String title=wd.getTitle();
		  String url=wd.getCurrentUrl();
		  SoftAssert sa = new SoftAssert();
		  sa.assertEquals("Search results for: 'shirt' Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites",title,"search result title not matched");
		  System.out.println("after login title test");
		  sa.assertEquals("https://magento.softwaretestingboard.com/catalogsearch/result/?q=shirt",url,"search result  url not matched");
		  sa.assertAll();
		  wd.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[3]/div/a/span/span")).click();
		  String urlcheck=wd.getCurrentUrl();
		  sa.assertEquals("https://magento.softwaretestingboard.com/balboa-persistence-tee.html",url,"add to cart failed");
		  //option-label-size-143-item-167
		  wd.findElement(By.id("option-label-size-143-item-167")).click();
		  wd.findElement(By.id("option-label-color-93-item-52")).click();
		  wd.findElement(By.id("product-addtocart-button")).click();
		  }

  
}
