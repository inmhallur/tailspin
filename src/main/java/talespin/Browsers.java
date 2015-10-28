package talespin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public final class Browsers {
	private static final WebDriver driver;
	static {
		String browserType = System.getProperty("talespin.browser.type");
		if ("mobile".equalsIgnoreCase(browserType)) {
			String userAgent = "Mozilla/5.0 (iPad; CPU OS 5_0 like Mac OS X) AppleWebKit/534.46 (KHTML, like Gecko) Version/5.1 Mobile/9A334 Safari/7534.48.3";
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("general.useragent.override", userAgent);

			DesiredCapabilities dc = DesiredCapabilities.firefox();
			dc.setCapability(FirefoxDriver.PROFILE, profile);
			driver = new FirefoxDriver(dc);
		} else {
			driver = new ChromeDriver();
		}
	}

	public static WebDriver getBrowser() {
		return driver;
	}
}
