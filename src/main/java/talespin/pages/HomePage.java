package talespin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import talespin.Browsers;
import talespin.Elements;
import talespin.pages.elements.HomeUI;

public class HomePage extends LoadableComponent<HomePage> {

	private final HomeUI homeUI = Elements.getUIFactory().getHomeUI();

	private final WebDriver driver = Browsers.getBrowser();

	private final String url;

	public HomePage(String url) {
		this.url = url;
	}

	public ResultsPage doSearch(String item) {
		homeUI.getSearchBox().sendKeys(item);
		homeUI.getSearchBtn().click();
		return new ResultsPage().get();
	}

	@Override
	protected void load() {
		driver.get(url);
	}

	@Override
	protected void isLoaded() throws Error {

		// Not the best way to check if page is loaded
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals("http://www.walmart.com/", currentUrl,
				"Not on homepage");

		// A quick hack for the holiday modal
		try {
			By by = By.xpath("//div[contains(@class,'Modal-outer')]"
					+ "/button[contains(@class, 'js-modal-close')]");
			new WebDriverWait(driver, 10).until(ExpectedConditions
					.elementToBeClickable(by));
			driver.findElement(by).click();
		} catch (NoSuchElementException e) {
			// does nothing
		} catch (TimeoutException e) {
			e.printStackTrace();
		}

	}
}
