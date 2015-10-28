package talespin.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import talespin.Browsers;
import talespin.Pages;
import talespin.pages.CartDetailsPage;

public class TestScenario {

	@Test
	public void test() {
		 CartDetailsPage cartPage = Pages
								 .gotoHomePage()
								 .doSearch("tv")
								 .viewResult(0)
								 .addToCartAndChekoutAsAnonymous()
								 .signIn("forcraigs2@gmail.com", "pa$$w0rd")
								 .continueToCheckoutShipmentAddress()
								 .continueToPayment()
								 .gotoCartPage();
		 cartPage.removeItem();
		 Assert.assertEquals(cartPage.itemsInTheCart(), 0);
		 cartPage.signout();
	}

	@AfterClass
	public void teardown() {
		Browsers.getBrowser().quit();
	}
}
