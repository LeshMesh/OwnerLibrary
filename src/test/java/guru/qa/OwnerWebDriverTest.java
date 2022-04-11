package guru.qa;

import guru.qa.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OwnerWebDriverTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new WebDriverProvider().get();
    }

    @Test
    public void testDuckDuckGoSearch() {
        assertEquals(driver.getTitle(), "DuckDuckGo — Максимум конфиденциальности, минимум усилий.");
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}
