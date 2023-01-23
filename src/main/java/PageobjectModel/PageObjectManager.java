package PageobjectModel;

import org.openqa.selenium.WebDriver;

import Baseclass.Baseclass;
import Locators.Home;
import Locators.Login;

public class PageObjectManager extends Baseclass{

	public PageObjectManager(WebDriver xdriver) {
		this.driver=xdriver;
	}
	
	private  Login login;
	private Home home;
	
	
	public Login getLogin() {
		if (login==null) {
			login=new Login(driver);
		}
		return login;
	}
	public Home getHome() {
		if (home==null) {
			home=new Home(driver);
		}
		return home;
	}
	
	
	
	
	
	
	
	
	
}
