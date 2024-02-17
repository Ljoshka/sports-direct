import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SportsDirectShopTests {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By MENU_ITEM = By.xpath(".//li[contains(@class, 'mmHasChild root AppTab')]");
    private final String SECTION = "Kids";

    @Test
    public void productInCartCheck() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://sportsdirect.com");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));

        WebElement acceptBtn = browser.findElement(ACCEPT_COOKIES_BTN);
        acceptBtn.click();

        //Find all sections
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(MENU_ITEM, 3));
        List<WebElement> menuItem = browser.findElements(MENU_ITEM);


        //Find necessary section
        for (WebElement we : menuItem) {
            if (we.getText().equals(SECTION)) {
                we.click();
                break;
            }
        }





    }
}
