package instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selinum Akshay\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Login login=new Login(driver);
		Thread.sleep(2000);
		login.sendusername();
		Thread.sleep(2000);
		login.sendpassword();
		Thread.sleep(2000);
		login.submitbutton();
		
		

		//Login login=new Login(driver);
		//login.sendpassword();
		
		//login logins=new login(driver);
		//login.submitbutton();
		
		
		

}}
