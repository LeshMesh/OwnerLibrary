package guru.qa.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class WebDriverConfig {

    public boolean isRemote() {
        String  isRemote = System.getProperty("isRemote");
        if (Objects.isNull(isRemote)) {
            return false;
        }
        return Boolean.parseBoolean(isRemote);
    }

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        if (Objects.isNull(browser)) {
            return Browser.CHROME;
        }
        return Browser.valueOf(browser);
    }

    public String getBaseUrl() {
        String baseUrl = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://duckduckgo.com";
        }
        return baseUrl;
    }

    public URL isRemoteUrl() {
        String remoteUrl = System.getProperty("remoteUrl");
        if (Objects.isNull(remoteUrl)) {
            return null;
        }
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            return null();
        }
    }
}
