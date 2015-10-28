package talespin.pages.elements.mob;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import talespin.Browsers;
import talespin.pages.elements.ResultUI;
import talespin.pages.elements.ResultsUI;

public class MobResultsUI implements ResultsUI {

	@FindBy(className = "mobile-result-item")
	private List<WebElement> results;

	public MobResultsUI() {
		PageFactory.initElements(
				new AjaxElementLocatorFactory(Browsers.getBrowser(), 5), this);
	}

	public List<ResultUI> getResults() {
		List<ResultUI> resultUIs = new ArrayList<ResultUI>(results.size());
		for (WebElement result : results) {
			resultUIs.add(new MobResultUI(result));
		}
		return resultUIs;
	}
}
