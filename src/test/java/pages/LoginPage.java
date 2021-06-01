package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public	LoginPage() {
		 PageFactory.initElements(Driver.get(), this);
	 }
	 
	@FindBy(css ="[data-qa=register]")
	public WebElement CreateAccount;
}
