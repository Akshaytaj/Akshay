package FacebookNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
		
		@FindBy (xpath="(//input[@type=\"text\"])[2]")
		private WebElement Firstname;
		@FindBy (xpath="(//input[@type=\"text\"])[3]")
		private WebElement Lastname;
		@FindBy (xpath="(//input[@type=\"text\"])[4]")
		private WebElement Passwords;
		@FindBy (xpath="(//input[@type=\"password\"])[2]")
		private WebElement Repasswords ;
		@FindBy (xpath="//select[@aria-label=\"Day\"]")
		private WebElement Days ;
		@FindBy (xpath="//select[@aria-label=\"Month\"]")
		private WebElement Months ;
		@FindBy (xpath="//select[@aria-label=\"Year\"]")
		private WebElement Years ;
		
		public SignUp (WebDriver driver)
			
		{
			PageFactory.initElements(driver,this);
		}

		public void Sendfirstname () {
			Firstname.sendKeys("Akshay");
		}
		public void Sendlastname () {
			Lastname.sendKeys("Tajanapure");
		}
		public void Sendpassword () {
			Passwords.sendKeys("12345");
        }
		public void Sendrepassword () {
			Repasswords.sendKeys("12345");
		}
		public void Selectday () {
			Days.click();
		}
	   	public void Selectmonth (){
		
			Months.click();
			}
		public void Selectyear () {
			
		Years.click();
}}


