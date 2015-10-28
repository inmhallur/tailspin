package talespin.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.SlowLoadableComponent;
import org.openqa.selenium.support.ui.SystemClock;
import org.openqa.selenium.support.ui.WebDriverWait;

import talespin.Browsers;
import talespin.Elements;
import talespin.pages.elements.CheckoutAnonymousUI;

public class CheckoutAnonymousPage extends
		SlowLoadableComponent<CheckoutAnonymousPage> {

	private final WebDriver driver = Browsers.getBrowser();
	private final CheckoutAnonymousUI checkoutAnonymousUI = Elements
			.getUIFactory().getCheckoutAnonymousUI();

	public CheckoutAnonymousPage() {
		super(new SystemClock(), 15);
	}

	@Override
	protected void load() {
		// does nothing
	}

	@Override
	protected void isLoaded() throws Error {
		new WebDriverWait(driver, TimeUnit.SECONDS.toSeconds(10))
				.until(ExpectedConditions.urlContains("checkout/sign-in"));
	}

	public CheckoutFullfillmentPage signIn(String user, String pass) {
		checkoutAnonymousUI.getEmailAddressBox().sendKeys(user);
		checkoutAnonymousUI.getPasswordBox().sendKeys(pass);
		checkoutAnonymousUI.getSigninBtn().click();
		return new CheckoutFullfillmentPage().get();
	}

}
