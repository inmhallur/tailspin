package talespin.pages.elements.def;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.SlowLoadableComponent;
import org.openqa.selenium.support.ui.SystemClock;
import org.openqa.selenium.support.ui.WebDriverWait;

import talespin.Browsers;
import talespin.pages.elements.CheckoutShippingAddressUI;

public class DefCheckoutShippingAddressUI extends
		SlowLoadableComponent<DefCheckoutShippingAddressUI> implements
		CheckoutShippingAddressUI {

	private WebElement continueBtn;

	public DefCheckoutShippingAddressUI() {
		super(new SystemClock(), 15);
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	@Override
	protected void load() {
		continueBtn = Browsers.getBrowser().findElement(
				By.id("COAC2ShpAddrContBtn"));
	}

	@Override
	protected void isLoaded() throws Error {
		Assert.assertNotNull(continueBtn);
		Assert.assertNotNull(ExpectedConditions
				.elementToBeClickable(continueBtn));
		try {
			Assert.assertFalse(new WebDriverWait(Browsers.getBrowser(), 5)
					.until(ExpectedConditions.stalenessOf(continueBtn)));
		} catch (TimeoutException e) {
			// Does nothing
		}
	}

}
