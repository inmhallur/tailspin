package talespin.pages.elements.def;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import talespin.pages.elements.ResultUI;

public class DefResultUI implements ResultUI {

	@FindBy(xpath = "//div[@data-item-id]//a[@class='js-product-title']")
	private WebElement titleLink;

	public DefResultUI(WebElement result) {
		PageFactory
				.initElements(new AjaxElementLocatorFactory(result, 5), this);
	}

	public WebElement getLink() {
		return titleLink;
	}

}
