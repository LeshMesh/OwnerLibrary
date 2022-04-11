package guru.qa.config;

import java.net.URL;

public class WebDriverConfig {

    public boolean isRemote() {
        return false;
    }

    public Browser getBrowser() {
        return Browser.FIREFOX;
    }

    public String getBaseUrl() {
        return "https://duckduckgo.com";
    }

    public URL isRemoteUrl() {
        return null;
    }
}
