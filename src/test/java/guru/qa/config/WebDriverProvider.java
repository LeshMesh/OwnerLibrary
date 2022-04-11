package guru.qa.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;
import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    private WebDriverConfig config = new WebDriverConfig();

    @Override
    public WebDriver get() {
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseUrl());
        return driver;
    }

    private WebDriver createWebDriver() {
        if (Objects.nonNull(config.getBrowser())) {
            switch (config.getBrowser()) {
                case CHROME: {
                    return new ChromeDriver();
                }
                case FIREFOX: {
                    return new FirefoxDriver();
                }
                default: {
                    throw new RuntimeException("Тип не поддеривается");
                }
            }
        }
        throw new RuntimeException("Тип не NULL");
    }
}
