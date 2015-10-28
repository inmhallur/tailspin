package talespin.pages.elements.mob;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import talespin.pages.elements.ResultUI;

public class MobResultUI implements ResultUI {

	@FindBy(className = "item-result-card")
	private WebElement titleLink;

	public MobResultUI(WebElement result) {
		PageFactory
				.initElements(new AjaxElementLocatorFactory(result, 5), this);
	}

	public WebElement getLink() {
		return titleLink;
	}

}
