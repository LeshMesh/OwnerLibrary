package guru.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OwnerWebDriverTest {

    @Test
    public void testDuckDuckGoSearch() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com");
        assertEquals(driver.getTitle(), "DuckDuckGo — Максимум конфиденциальности, минимум усилий.");
        driver.quit();
    }
}
