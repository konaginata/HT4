package utils;

import org.openqa.selenium.Capabilities;

public class CapabilityFactory {
    private Capabilities capabilities;

    public Capabilities getCapabilities(String browser) {
        if (browser.equals("firefox")) {
            capabilities = OptionsManager.getFirefoxOptions();
        } else {
            capabilities = OptionsManager.getChromeOptions();
        }
        return capabilities;
    }
}
