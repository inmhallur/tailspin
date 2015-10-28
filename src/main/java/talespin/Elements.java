package talespin;

import talespin.pages.elements.UIFactory;
import talespin.pages.elements.def.DefUIFactory;
import talespin.pages.elements.mob.MobUIFactory;

public final class Elements {

	private static final String browserType;
	static {
		browserType = System.getProperty("talespin.browser.type");
	}

	public static UIFactory getUIFactory() {
		if ("mobile".equalsIgnoreCase(browserType)) {
			return new MobUIFactory();
		} else {
			return new DefUIFactory();
		}
	}
}
