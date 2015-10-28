package talespin.pages.elements.def;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import talespin.Browsers;
import talespin.pages.elements.CheckoutAnonymousUI;

public class DefCheckoutAnonymousUI implements CheckoutAnonymousUI {

	@FindBy(id = "COAC0WelAccntEmail")
	private WebElement emailAddressBox;

	@FindBy(id = "COAC0WelAccntPswd")
	private WebElement passwordAddressBox;

	@FindBy(id = "COAC0WelAccntSignInBtn")
	private WebElement signInBtn;

	public DefCheckoutAnonymousUI() {
		PageFactory.initElements(
				new AjaxElementLocatorFactory(Browsers.getBrowser(), 5), this);
	}

	public WebElement getEmailAddressBox() {
		return emailAddressBox;
	}

	public WebElement getPasswordBox() {
		return passwordAddressBox;
	}

	public WebElement getSigninBtn() {
		return signInBtn;
	}

}
