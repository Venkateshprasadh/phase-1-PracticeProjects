package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Register_Login 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\Desktop\\95\\95\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		System.out.println(wd);
		wd.manage().window().maximize();
		//loading register form 
		wd.get("https://www.shine.com/registration/");
		//entering employee name
		wd.findElement(By.id("id_name")).sendKeys("employeeFour");
		//entering employee email
		wd.findElement(By.id("id_email")).sendKeys("employee4@gmail.com");
		//entering employee phone number
		wd.findElement(By.id("id_cell_phone")).sendKeys("6382744781");
		//entering password
		wd.findElement(By.id("id_password")).sendKeys("Employee4@gmail");
		//clicking registerButton
		wd.findElement(By.id("registerButton")).click();
//		//https://www.shine.com/login/
		wd.get("https://www.shine.com/login/");
		//id_email_login
		wd.findElement(By.id("id_email_login")).sendKeys("employee4@gmail.com");
		//id_password
		wd.findElement(By.id("id_password")).sendKeys("Employee4@gmail");
		 wd.findElement(By.xpath("//*[@id=\"cndidate_login_widget\"]/form/ul[2]/li[4]/div/button")).click();
		
		
	}
}
