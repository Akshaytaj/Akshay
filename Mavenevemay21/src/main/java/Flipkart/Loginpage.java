package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy (xpath="//button[@class=\"_2KpZ6l _2doB4z\"]")
	WebElement Croosbutton ;
	@FindBy (xpath="(//div[@class=\"xtXmba\"])[3]")
	WebElement Mobilebutton ;
	@FindBy (xpath="//input[@type=\"text\"]")
	WebElement Searchbox ;
	@FindBy (xpath="//button[@type=\"submit\"]")
	WebElement Searchkey ;
	public Loginpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public void Checkcrossbutton (){
		Croosbutton.click();
		
	}
	public void Clickmobilebutton (){
		Mobilebutton.click();
	}
	public void Sendsearchbox (){
		Searchbox.sendKeys("iphone 13 128GB");
	}
	public void Clicksearchkey(){
		Searchkey.click();
	}
	
	
	
	
	
	
	
}

	
