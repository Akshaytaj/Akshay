package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import facebook.LoginOrSignUp;
import facebook.Messengerpage;
import facebook.Roomspage;

public class testclass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selinum Akshay\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	LoginOrSignUp loginorsignup= new LoginOrSignUp(driver);
	loginorsignup.openMessenger();
	
	Messengerpage messengerPager= new Messengerpage (driver);
	messengerPager.openrooms();
	
	Roomspage roomspage = new Roomspage (driver);
	roomspage.contactToHelpCentre();
	
	String url = driver.getCurrentUrl();
	String title = driver.getTitle();
	if (url.equals("httpas://www.messenger.com/help") && title.equals("Messenger Help Centre"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}

}
}

