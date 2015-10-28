package talespin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.SlowLoadableComponent;
import org.openqa.selenium.support.ui.SystemClock;
import org.testng.Assert;

import talespin.Browsers;
import talespin.Elements;
import talespin.pages.elements.CartModalUI;
import talespin.pages.elements.ProductDetailsUI;

public class ProductDetailsPage extends
		SlowLoadableComponent<ProductDetailsPage> {

	private final WebDriver driver = Browsers.getBrowser();
	private final ProductDetailsUI productDetailsUI = Elements.getUIFactory()
			.getProductDetailsUI();
	private final CartModalUI addToCartModalUI = Elements.getUIFactory()
			.getCartModalUI();

	public ProductDetailsPage() {
		super(new SystemClock(), 15);
	}

	@Override
	protected void load() {
		// Does nothing
	}

	@Override
	protected void isLoaded() throws Error {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("www.walmart.com/ip"),
				"Not on product results page");
	}

	public CheckoutAnonymousPage addToCartAndChekoutAsAnonymous() {
		productDetailsUI.getAddToCartBtn().click();
		System.out.println("Clicked add to cart");
		addToCartModalUI.getCheckoutBtn().click();
		System.out.println("Clicked checkout");
		return new CheckoutAnonymousPage().get();
	}
}
