package talespin.pages.elements.def;

import talespin.pages.elements.CartModalUI;
import talespin.pages.elements.CheckoutAnonymousUI;
import talespin.pages.elements.CheckoutFullfillmentUI;
import talespin.pages.elements.CheckoutShippingAddressUI;
import talespin.pages.elements.HomeUI;
import talespin.pages.elements.PaymentUI;
import talespin.pages.elements.ProductDetailsUI;
import talespin.pages.elements.ResultsUI;
import talespin.pages.elements.UIFactory;

public class DefUIFactory implements UIFactory {

	public HomeUI getHomeUI() {
		return new DefHomeUI();
	}

	public ResultsUI getResultsUI() {
		return new DefResultsUI();
	}

	public ProductDetailsUI getProductDetailsUI() {
		return new DefProductDetailsUI();
	}

	public CartModalUI getCartModalUI() {
		return new DefCartModalUI();
	}

	public CheckoutAnonymousUI getCheckoutAnonymousUI() {
		return new DefCheckoutAnonymousUI();
	}

	public CheckoutFullfillmentUI getCheckoutFullfillmentUI() {
		return new DefCheckoutFullfillmentUI().get();
	}

	public CheckoutShippingAddressUI getCheckoutShippingAddressUI() {
		return new DefCheckoutShippingAddressUI().get();
	}
	
	public PaymentUI getPaymentUI() {
		return new DefPaymentUI();
	}
}
