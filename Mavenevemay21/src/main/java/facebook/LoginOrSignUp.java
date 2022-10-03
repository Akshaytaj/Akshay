package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUp{ 
	
	//variable
	
	@FindBy (xpath = "//input[@name=\"email\"]")
	private WebElement Username; 
	
	@FindBy (xpath = "//input[@id=\"pass\"]")
	private WebElement Password; 
	
	@FindBy (xpath = "//button[@type=\"submit\"]")
	private WebElement Loginbutton; 
	
	@FindBy (xpath = "//a[text()='Messenger']")
	private WebElement messenger; 
	
	//variable initilasation
	public LoginOrSignUp (WebDriver driver)
			{
		      PageFactory.initElements(driver, this);
			}
	 //webelement action 
	public void sendUsername () {
		Username.sendKeys("Akshay");
	}
	public void Password () {
		Password.sendKeys("9881679814");
	}
	public void Loginbutton () {
		Loginbutton.click();
	}
	public void openMessenger() {
	messenger.click();
	}
	 //or
	public void LoginToApplication () {
		Username.sendKeys("Akshay");
		Password.sendKeys("9881679814");
		Loginbutton.click();
		
	}

}
