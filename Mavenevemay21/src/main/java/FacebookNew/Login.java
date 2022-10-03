package FacebookNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath="//input[@type=\"text\"]")
	private WebElement Username;

	@FindBy(xpath="(//a[@role=\"button\"])[2]")
	private WebElement CreateAc ;
	
	public Login (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void Sendusername (){
		Username.sendKeys("Akshay Tajanpure");
	}
		
	public void Clickcreateac (){
		CreateAc.click();
	}
}
