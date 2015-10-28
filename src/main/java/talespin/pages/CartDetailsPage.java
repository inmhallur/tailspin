package talespin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.SlowLoadableComponent;
import org.openqa.selenium.support.ui.SystemClock;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import talespin.Browsers;

public class CartDetailsPage extends SlowLoadableComponent<CartDetailsPage> {

	private final WebDriver driver = Browsers.getBrowser();

	public CartDetailsPage() {
		super(new SystemClock(), 15);
	}

	@Override
	protected void load() {
	}

	@Override
	protected void isLoaded() throws Error {
		Assert.assertTrue(driver.getCurrentUrl().endsWith("/cart/"),
				"Not on cart page");
	}

	public void removeItem() {
		new WebDriverWait(driver, 5)
				.until(ExpectedConditions.elementToBeClickable(By
						.id("CartRemItemBtn"))).click();
		new WebDriverWait(driver, 5).until(ExpectedConditions
				.elementToBeClickable(By.id("CartUndoDeleteBtn")));
	}

	public int itemsInTheCart() {
		return driver.findElements(By.className("cart-item-name")).size();
	}

	public void signout() {
		WebElement dropdownLink = driver.findElement(new ByChained(By
				.className("header-login"), By.className("dropdown-link")));
		Actions action = new Actions(driver);
		action.moveToElement(dropdownLink)
				.moveToElement(By.className("js-sign-out").findElement(driver))
				.click();
	}
}
