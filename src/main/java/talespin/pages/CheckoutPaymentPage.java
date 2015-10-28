package talespin.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import talespin.Browsers;
import talespin.Elements;
import talespin.pages.elements.PaymentUI;

public class CheckoutPaymentPage extends LoadableComponent<CheckoutPaymentPage> {

	private final WebDriver driver = Browsers.getBrowser();
	private PaymentUI paymentUI = Elements.getUIFactory().getPaymentUI();

	@Override
	protected void load() {
	}

	@Override
	protected void isLoaded() throws Error {
		new WebDriverWait(driver, TimeUnit.SECONDS.toSeconds(10))
				.until(ExpectedConditions.urlContains("checkout/payment"));
	}

	public CartDetailsPage gotoCartPage() {
		paymentUI.getCartLink().click();
		return new CartDetailsPage().get();
	}
}
