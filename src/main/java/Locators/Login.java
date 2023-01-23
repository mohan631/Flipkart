package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class Login extends Baseclass{

	public Login(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement login_popup_closeButton;

	public WebElement getLogin_popup_closeButton() {
		return login_popup_closeButton;
	}
	
	
}
