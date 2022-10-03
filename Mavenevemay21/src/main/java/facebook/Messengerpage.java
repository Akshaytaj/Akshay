package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Messengerpage {
	private WebDriver driver;
	private Actions act;
	@FindBy (xpath = "(//li[@class=\"_4qfn\"])[1]")
	private WebElement room;
	
	@FindBy (xpath = "//a[text()='Features']")
	private WebElement features;
	
	
	public Messengerpage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
		act = new Actions (driver);
	}
	 public void openrooms() {
		 room.click();
		// Actions act = new Actions (driver);
		 act.moveToElement(room).click().perform();
	 }
	 public void openFeatures() {
		 features.click();
		// Actions act = new Actions (driver);
		 act.moveToElement(features).click().perform();
	 }
  
}
