package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productselect {

	@FindBy (xpath ="(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")
	WebElement iphonename;
	
	public Productselect (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void Iphonename(){
		iphonename.click();



}}
