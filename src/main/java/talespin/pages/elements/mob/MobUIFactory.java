package talespin.pages.elements.mob;

import talespin.pages.elements.CartModalUI;
import talespin.pages.elements.CheckoutAnonymousUI;
import talespin.pages.elements.CheckoutFullfillmentUI;
import talespin.pages.elements.CheckoutShippingAddressUI;
import talespin.pages.elements.HomeUI;
import talespin.pages.elements.PaymentUI;
import talespin.pages.elements.ProductDetailsUI;
import talespin.pages.elements.ResultsUI;
import talespin.pages.elements.UIFactory;
import talespin.pages.elements.def.DefCartModalUI;
import talespin.pages.elements.def.DefCheckoutAnonymousUI;
import talespin.pages.elements.def.DefCheckoutFullfillmentUI;
import talespin.pages.elements.def.DefCheckoutShippingAddressUI;
import talespin.pages.elements.def.DefHomeUI;
import talespin.pages.elements.def.DefPaymentUI;
import talespin.pages.elements.def.DefProductDetailsUI;

public class MobUIFactory implements UIFactory {

	public HomeUI getHomeUI() {
		return new DefHomeUI();
	}

	public ResultsUI getResultsUI() {
		return new MobResultsUI();
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
