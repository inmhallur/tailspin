package talespin.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import talespin.Browsers;
import talespin.Elements;
import talespin.pages.elements.ResultUI;
import talespin.pages.elements.ResultsUI;

public class ResultsPage extends LoadableComponent<ResultsPage> {

	private final WebDriver driver = Browsers.getBrowser();
	private final ResultsUI resultsUI = Elements.getUIFactory().getResultsUI();

	@Override
	protected void load() {
		// does nothing
	}

	@Override
	protected void isLoaded() throws Error {
		String currentUrl = this.driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("/search/?query"),
				"Not on results page");
	}

	public ProductDetailsPage viewResult(int index) {
		List<ResultUI> results = resultsUI.getResults();
		System.out.println(results.get(index).getLink());
		results.get(index).getLink().click();
		return new ProductDetailsPage().get();
	}
}
