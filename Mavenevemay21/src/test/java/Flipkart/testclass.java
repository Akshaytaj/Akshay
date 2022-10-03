package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selinum Akshay\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Loginpage loginpage = new Loginpage(driver);
		Thread.sleep(1000);
		loginpage.Checkcrossbutton();
		Thread.sleep(1000);
		loginpage.Clickmobilebutton();
		Thread.sleep(1000);
		loginpage.Sendsearchbox();
		Thread.sleep(1000);
		loginpage.Clicksearchkey();
		Thread.sleep(1000);
		
		Verifymobile verifymobile = new Verifymobile(driver);
		verifymobile.Mobiletext();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Addtocart addtocart = new Addtocart(driver);
		Thread.sleep(1000);
		addtocart.ClickAddcartbutton();
		
	}

}
