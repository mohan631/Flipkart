package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class Home extends Baseclass{

	public Home(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	private WebElement searchBox;
	
	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearch_Button() {
		return search_Button;
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement search_Button;
	
}
