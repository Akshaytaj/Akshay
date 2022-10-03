package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy (xpath ="//input[@type=\"text\"]")
	WebElement Search;
	@FindBy (xpath ="//input[@id=\"nav-search-submit-button\"]")
	WebElement Searchlogo;
   @FindBy (xpath ="(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")
	WebElement iphonename;
	@FindBy (xpath ="//button[@id=\"a-autoid-7-announce\"]")
	WebElement varient;
	@FindBy (xpath ="//img[@alt=\"Blue\"]")
	WebElement colour;
	
	
	public Login (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void sendsearch (){
		Search.sendKeys("iphone");
		
		
	}

  public void sendsearchlogo(){
		Searchlogo.click();
	
	}
		
		
	
/*	public void iphonename(){
		iphonename.click();
		act.moveToElement(iphonename).click().build().perform();
	}
	
	  public void selectvarient(){
		varient.click();
	  }
		
	public void changecolour(){
		colour.click();
		act.moveToElement(colour).click().build().perform();
	}*/
		
		

}
