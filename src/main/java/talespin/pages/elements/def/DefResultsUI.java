package talespin.pages.elements.def;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import talespin.Browsers;
import talespin.pages.elements.ResultUI;
import talespin.pages.elements.ResultsUI;

public class DefResultsUI implements ResultsUI {

	@FindBy(xpath = "//div[@data-item-id]")
	private List<WebElement> results;

	public DefResultsUI() {
		PageFactory.initElements(
				new AjaxElementLocatorFactory(Browsers.getBrowser(), 5), this);
	}

	public List<ResultUI> getResults() {
		List<ResultUI> resultUIs = new ArrayList<ResultUI>(results.size());
		for (WebElement result : results) {
			resultUIs.add(new DefResultUI(result));
		}
		return resultUIs;
	}
}
