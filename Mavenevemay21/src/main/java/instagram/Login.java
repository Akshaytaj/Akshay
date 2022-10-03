package instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {


	@FindBy (xpath ="//input[@aria-label=\"Phone number, username, or email\"]")
	WebElement username;
	@FindBy (xpath ="//input[@aria-label=\"Password\"]")
	WebElement password ; 
	@FindBy (xpath ="//button[@type=\"submit\"]")
	WebElement submit; 
	
	
	
	public Login (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void sendusername (){
		username.sendKeys("Akshay");
		
		
	}
	

		  public void sendpassword(){
				password.sendKeys("9881679814");
		  }
		
		  public void submitbutton(){
				submit.click();
			
	







}}
