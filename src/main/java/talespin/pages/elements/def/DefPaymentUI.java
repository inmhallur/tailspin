package talespin.pages.elements.def;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import talespin.Browsers;
import talespin.pages.elements.PaymentUI;

public class DefPaymentUI implements PaymentUI {

	@FindBy(className = "checkout-header-cart")
	private WebElement cartLink;

	public DefPaymentUI() {
		PageFactory.initElements(
				new AjaxElementLocatorFactory(Browsers.getBrowser(), 5), this);
	}

	public WebElement getCartLink() {
		return cartLink;
	}

}
