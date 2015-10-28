package talespin.pages.elements;

public interface UIFactory {
	HomeUI getHomeUI();

	ResultsUI getResultsUI();

	ProductDetailsUI getProductDetailsUI();

	CartModalUI getCartModalUI();

	CheckoutAnonymousUI getCheckoutAnonymousUI();

	CheckoutFullfillmentUI getCheckoutFullfillmentUI();

	CheckoutShippingAddressUI getCheckoutShippingAddressUI();
	
	PaymentUI getPaymentUI();
}
