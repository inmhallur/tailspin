package talespin.pages;

import org.openqa.selenium.support.ui.SlowLoadableComponent;
import org.openqa.selenium.support.ui.SystemClock;
import org.testng.Assert;

import talespin.Browsers;
import talespin.Elements;
import talespin.pages.elements.CheckoutFullfillmentUI;

public class CheckoutFullfillmentPage extends
		SlowLoadableComponent<CheckoutFullfillmentPage> {

	private CheckoutFullfillmentUI checkoutFullfillmentUI;

	public CheckoutFullfillmentPage() {
		super(new SystemClock(), 15);
	}

	@Override
	protected void load() {
	}

	@Override
	protected void isLoaded() throws Error {
		String currentUrl = Browsers.getBrowser().getCurrentUrl();
		Assert.assertTrue(currentUrl.endsWith("checkout/fulfillment"));
		this.checkoutFullfillmentUI = Elements.getUIFactory()
				.getCheckoutFullfillmentUI();
	}

	public CheckoutShippingAddressPage continueToCheckoutShipmentAddress() {
		checkoutFullfillmentUI.getContinueBtn().click();
		return new CheckoutShippingAddressPage().get();
	}

}
