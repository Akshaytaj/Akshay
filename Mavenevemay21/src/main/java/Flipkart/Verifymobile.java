package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verifymobile {
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[1]")
	WebElement Mobile;
	public Verifymobile (WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public void Mobiletext(){
		Mobile.click();
		
		
	}

}
