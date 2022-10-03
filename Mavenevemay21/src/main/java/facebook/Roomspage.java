package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roomspage {

	@FindBy (xpath = "//a[text()= 'Return to messenger.com']")
	private WebElement returnToMessenger;
	
	@FindBy (xpath = "//a[text()= 'Visit our help centre']")
	private WebElement helpCentre;
	
	public Roomspage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void goBackMessenger() {
		returnToMessenger.click();
	}
	public void contactToHelpCentre() {
		helpCentre.click();
	
	}
}
