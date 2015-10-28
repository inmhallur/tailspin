package talespin.pages;

import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import talespin.Browsers;

public class LogoutPage extends LoadableComponent<LogoutPage> {

	@Override
	protected void load() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void isLoaded() throws Error {
		String currentUrl = Browsers.getBrowser().getCurrentUrl();
		Assert.assertEquals("https://www.walmart.com/account/logout",
				currentUrl, "Not on homepage");
	}

}
