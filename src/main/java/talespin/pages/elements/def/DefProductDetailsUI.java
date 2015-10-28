package talespin.pages.elements.def;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import talespin.Browsers;
import talespin.pages.elements.ProductDetailsUI;

public class DefProductDetailsUI implements ProductDetailsUI {

	@FindBy(id = "WMItemAddToCartBtn")
	private WebElement addToCartBtn;

	public DefProductDetailsUI() {
		PageFactory.initElements(
				new AjaxElementLocatorFactory(Browsers.getBrowser(), 5), this);
	}

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

}
