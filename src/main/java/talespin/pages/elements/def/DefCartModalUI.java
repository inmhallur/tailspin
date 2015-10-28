package talespin.pages.elements.def;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import talespin.Browsers;
import talespin.pages.elements.CartModalUI;

public class DefCartModalUI implements CartModalUI {

	@FindBy(id = "PACCheckoutBtn")
	private WebElement checkOutBtn;

	public DefCartModalUI() {
		PageFactory.initElements(
				new AjaxElementLocatorFactory(Browsers.getBrowser(), 5), this);
	}

	public WebElement getCheckoutBtn() {
		return checkOutBtn;
	}

}
