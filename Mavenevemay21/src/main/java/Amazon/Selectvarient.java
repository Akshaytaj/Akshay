package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectvarient {
	@FindBy (xpath ="//button[@id=\"a-autoid-7-announce\"]")
	WebElement varient;
	@FindBy (xpath ="//img[@alt=\"Blue\"]")
	WebElement colour;

	public Selectvarient (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	  public void selectvarient(){
		varient.click();
	  }
		
	public void changecolour(){
		colour.click();
		
	
	
}}
