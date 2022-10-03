package FcaebookNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import FacebookNew.Login;
import FacebookNew.SignUp;

public class testclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selinum Akshay\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Login login = new Login(driver);
		Thread.sleep(1000);
		login.Sendusername();
		
		Thread.sleep(1000);
		login.Clickcreateac();
		Thread.sleep(1000);
		
		SignUp signup = new SignUp(driver);
		Thread.sleep(1000);
		signup.Sendfirstname();
		Thread.sleep(1000);
		signup.Sendlastname();
		Thread.sleep(1000);
		signup.Sendpassword();
		signup.Sendrepassword();
		
		
		 
	}}
