package talespin.pages.elements.def;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import talespin.Browsers;
import talespin.pages.elements.HomeUI;

public class DefHomeUI implements HomeUI {

	@FindBy(id = "search")
	private WebElement searchBox;

	@FindBy(xpath = "//form[@name='searchbar']//button[@type='submit']")
	private WebElement searchBtn;

	public DefHomeUI() {
		PageFactory.initElements(
				new AjaxElementLocatorFactory(Browsers.getBrowser(), 5), this);
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

}
