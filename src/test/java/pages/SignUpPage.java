package pages;

import com.github.javafaker.Faker;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;
import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	public	SignUpPage() {
		 PageFactory.initElements(Driver.get(), this);
	 }
	public String firstName2;
	public String lastName1;
	public String password2;
	public String email3;
	
	@FindBy(name = "firstName")
	public WebElement firstName;
	
	@FindBy(name = "lastName")
	public WebElement lastName;
	
	@FindBy(name = "email")
	public WebElement email;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(xpath = "//label[@for ='checkbox-20']")
	public WebElement checkBoxAgree;
	
	@FindBy(xpath = "//button[text() = 'Next']")
	public WebElement NextButton;

	public void selectState(String text){
		Select select = new Select(Driver.get().findElement(By.tagName("Select")));
		select.selectByVisibleText(text);
	}

	public void createNewAccounte(){
		Faker faker = new Faker();
		firstName2 = faker.name().firstName();
		lastName1 = faker.name().lastName();
	    password2 = "SecretWord1234";
		email3 = faker.name().username() + "@gmail.com";
		firstName.sendKeys(firstName2);
		lastName.sendKeys(lastName1);
		selectState("Maryland");
		email.sendKeys(email3);
		password.sendKeys(password2);
		checkBoxAgree.click();
		BrowserUtils.highlightElement(	NextButton);
		NextButton.click();
		System.out.println( firstName2 + " " + lastName1 + " " + email3 + " " + password2);
	}
	
	
	
	
	
}
