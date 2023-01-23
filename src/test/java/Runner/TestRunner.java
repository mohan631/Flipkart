package Runner;

import Baseclass.Baseclass;
import PageobjectModel.PageObjectManager;

public class TestRunner extends Baseclass{

	public static void main(String[] args) {
		browserLaunch("edge");
		window_max();
		getURL("https://www.flipkart.com/");
		
		PageObjectManager obj=new PageObjectManager(driver);
		
		elementClick(obj.getLogin().getLogin_popup_closeButton());
		
		elementSendKeys(obj.getHome().getSearchBox(), "AC");
		elementClick(obj.getHome().getSearch_Button());
		
	}
	
}
