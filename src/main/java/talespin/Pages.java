package talespin;

import talespin.pages.HomePage;

public final class Pages {
	public static HomePage gotoHomePage() {
		return new HomePage("http://mobile.walmart.com").get();
	}
}
