package TestNG.AutomateECommerce;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	  public void navigate(String url1) {
	 // wd.get("https://www.flipkart.com/");
	  long start = System.currentTimeMillis();
	  wd.get(url1);
	  long finish = System.currentTimeMillis();
	  String title=wd.getTitle();
	  String url=wd.getCurrentUrl();
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!",title,"title not matched");
	  System.out.println("after title test");
	  sa.assertEquals("https://www.flipkart.com/",url,"url not matched");
//	  wd.get("https://www.flipkart.com/");
	 long totalTime = finish - start; 
	  System.out.println("Total Time for page load -> "+totalTime +" milliseconds");
	  long expectedTime=30000;
	 // sa.assertEquals(expectedTime,totalTime,"exceeded load time");
	  if(totalTime<expectedTime)
	  {
		  System.out.println("Getting loaded with time");
	  }
	  else
	  {
		  System.out.println("Time limit exceeded");
	  }
	  sa.assertAll();
	  
	  }
	@Parameters("url2")
	  @Test(priority = 2)
		public void searchproduct(String url2) throws InterruptedException {
		 // wd.get("https://www.flipkart.com/");
		  wd.get(url2);
		  wd.findElement(By.cssSelector("body > div._2Sn47c > div > div > button")).click();
		  SoftAssert sa = new SoftAssert();
		  wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img")).click();
		  wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("iphone13");
		  wd.findElement(By.className("L0Z3Pu")).click();
		  Thread.sleep(3000);
		  wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")).click();
		  Thread.sleep(5000);
		  
		  }
	
	@Test(priority = 3)
	public void loadImage() throws InterruptedException {

		//String url = "https://www.flipkart.com/apple-iphone-13-pink-128-gb/p/itm6e30c6ee045d2?pid=MOBG6VF5GXVFTQ5Y&lid=LSTMOBG6VF5GXVFTQ5YEMAFNU&marketplace=FLIPKART&q=iphone13&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=e86eddc5-c755-4e11-bd17-932f4545dadd.MOBG6VF5GXVFTQ5Y.SEARCH&ppt=clp&ppn=mobile-phones-store&ssid=f21kh26hog0000001666073645211&qH=7d4afaedfc628b80";
		wd.get("https://www.flipkart.com/apple-iphone-13-pink-128-gb/p/itm6e30c6ee045d2?pid=MOBG6VF5GXVFTQ5Y&lid=LSTMOBG6VF5GXVFTQ5YEMAFNU&marketplace=FLIPKART&q=iphone13&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=31f1c84d-c95b-44e4-9813-23100fc2e3ec.MOBG6VF5GXVFTQ5Y.SEARCH&ppt=clp&ppn=mobile-phones-store&ssid=3yqu4hg8r40000001666074548796&qH=7d4afaedfc628b80");
		Thread.sleep(3000);
		 WebElement i = wd.findElement
			      (By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/img"));
			      // Javascript executor to check image
			      Boolean p = (Boolean) ((JavascriptExecutor)wd) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

			      //verify if status is true
			      if (p) {
			         System.out.println("image present");
			      } else {
			         System.out.println("image not present");
			      }
		
	}
	@Test(priority = 4)
	public void bottom() throws InterruptedException
	{
		wd.get("https://www.flipkart.com/apple-iphone-13-pink-128-gb/p/itm6e30c6ee045d2?pid=MOBG6VF5GXVFTQ5Y&lid=LSTMOBG6VF5GXVFTQ5YEMAFNU&marketplace=FLIPKART&q=iphone13&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=31f1c84d-c95b-44e4-9813-23100fc2e3ec.MOBG6VF5GXVFTQ5Y.SEARCH&ppt=clp&ppn=mobile-phones-store&ssid=3yqu4hg8r40000001666074548796&qH=7d4afaedfc628b80");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("\nNavigated to bottom of the page");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		System.out.println("\nScroll Feature available");
		Thread.sleep(2000);
	}
	@Test(priority = 4)
	public void screenResolution() throws InterruptedException {
		wd.get("https://www.flipkart.com/apple-iphone-13-pink-128-gb/p/itm6e30c6ee045d2?pid=MOBG6VF5GXVFTQ5Y&lid=LSTMOBG6VF5GXVFTQ5YEMAFNU&marketplace=FLIPKART&q=iphone13&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=31f1c84d-c95b-44e4-9813-23100fc2e3ec.MOBG6VF5GXVFTQ5Y.SEARCH&ppt=clp&ppn=mobile-phones-store&ssid=3yqu4hg8r40000001666074548796&qH=7d4afaedfc628b80");
		Thread.sleep(1000);
		Dimension dimension = new Dimension(720, 1080);
		wd.manage().window().setSize(dimension);
		Thread.sleep(3000);

		Dimension dimension1 = new Dimension(1280, 800);
		wd.manage().window().setSize(dimension1);
		Thread.sleep(3000);

		Dimension dimension2 = new Dimension(2256, 1504);
		wd.manage().window().setSize(dimension2);

		JavascriptExecutor js = (JavascriptExecutor) wd;
		int contentHeight = ((Number) js.executeScript("return window.innerHeight")).intValue();
		int contentWidth = ((Number) js.executeScript("return window.innerWidth")).intValue();
		System.out.println("\nHeight: " + contentHeight + " Width: " + contentWidth + "\n");
	}
	@Test(priority = 5)
	public void ScrollbarpresentCheck() throws InterruptedException {
		wd.get("https://www.flipkart.com/apple-iphone-13-pink-128-gb/p/itm6e30c6ee045d2?pid=MOBG6VF5GXVFTQ5Y&lid=LSTMOBG6VF5GXVFTQ5YEMAFNU&marketplace=FLIPKART&q=iphone13&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=31f1c84d-c95b-44e4-9813-23100fc2e3ec.MOBG6VF5GXVFTQ5Y.SEARCH&ppt=clp&ppn=mobile-phones-store&ssid=3yqu4hg8r40000001666074548796&qH=7d4afaedfc628b80");
		 String execScript = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
		  JavascriptExecutor scrollBarPresent = (JavascriptExecutor) wd;
		  Boolean test = (Boolean) (scrollBarPresent.executeScript(execScript));
		  if (test == true) {
				System.out.print("Scrollbar is present.");
			} else if (test == false){
				System.out.print("Scrollbar is not present.");
			}
	}
	
	@Test(priority = 6)
	public void scrollFrequency() throws InterruptedException {
		wd.get("https://www.flipkart.com/apple-iphone-13-pink-128-gb/p/itm6e30c6ee045d2?pid=MOBG6VF5GXVFTQ5Y&lid=LSTMOBG6VF5GXVFTQ5YEMAFNU&marketplace=FLIPKART&q=iphone13&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=31f1c84d-c95b-44e4-9813-23100fc2e3ec.MOBG6VF5GXVFTQ5Y.SEARCH&ppt=clp&ppn=mobile-phones-store&ssid=3yqu4hg8r40000001666074548796&qH=7d4afaedfc628b80");
		Thread.sleep(2000);
		long start = System.currentTimeMillis();
		WebElement element = wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[10]/div[7]/div/div[3]/div/div/div[1]"));
		((JavascriptExecutor) wd).executeScript("arguments[0].scrollIntoView(true);", element);
		long stop = System.currentTimeMillis();
		long totalTime = stop - start;
		System.out.println("\nScroll Frequency - " + totalTime+" millisecs");

	}
	
}
