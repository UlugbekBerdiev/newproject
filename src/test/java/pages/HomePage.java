package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 public	HomePage() {
	 PageFactory.initElements(Driver.get(), this);
 }
 
 @FindBy(id = "login-cta-container")
 public WebElement logInButton;
 
 @FindBy (id = "main-nav-cta")
 public WebElement FindMyRate;
 
 
 
  
}
