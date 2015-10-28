package talespin.pages;

import org.openqa.selenium.support.ui.SlowLoadableComponent;
import org.openqa.selenium.support.ui.SystemClock;
import org.testng.Assert;

import talespin.Browsers;
import talespin.Elements;
import talespin.pages.elements.CheckoutShippingAddressUI;

public class CheckoutShippingAddressPage extends
		SlowLoadableComponent<CheckoutShippingAddressPage> {

	private CheckoutShippingAddressUI checkoutShippingAddressUI;

	public CheckoutShippingAddressPage() {
		super(new SystemClock(), 15);
	}

	@Override
	protected void load() {
	}

	@Override
	protected void isLoaded() throws Error {
		String currentUrl = Browsers.getBrowser().getCurrentUrl();
		Assert.assertTrue(currentUrl.endsWith("checkout/shipping-address"));
		this.checkoutShippingAddressUI = Elements.getUIFactory()
				.getCheckoutShippingAddressUI();
	}

	public CheckoutPaymentPage continueToPayment() {
		checkoutShippingAddressUI.getContinueBtn().click();
		return new CheckoutPaymentPage().get();
	}

}
