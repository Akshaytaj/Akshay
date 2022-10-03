package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzontest {//content,https://www.amazon.com/Apple-iPhone-2nd-Generation-128GB/dp/B08R97FHJ7/ref=sr_1_1?crid=1ETZWQEXBIXEU&keywords=iphone&qid=1663815665&sprefix=iphone%2Caps%2C675&sr=8-1&th=1
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selinum Akshay\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		Login login = new Login(driver);
		login.sendsearch();
		login.sendsearchlogo();
		Thread.sleep(2000);
		Productselect productselect = new Productselect(driver);
		productselect.Iphonename();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Selectvarient selectvarient = new Selectvarient(driver);
		selectvarient.selectvarient();
		Thread.sleep(2000);
		selectvarient.changecolour();
		


}}
