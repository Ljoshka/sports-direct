package pageobject.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class HomePage {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By MENU_ITEM = By.xpath(".//div[@data-testid = 'slides']/div");
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void acceptCookies() {
        baseFunc.click(ACCEPT_COOKIES_BTN);
    }

    public void selectMenuItem(String menuItemName) {
        WebElement menuBlock = baseFunc.findElement(MENU_ITEM);
        List<WebElement> menuItem = menuBlock.findElements(MENU_ITEM);

        boolean isSectionFound = false;
        for (WebElement we : menuItem) {
            if (we.getText().equals(menuItemName)) {
                isSectionFound = true;
                we.click();
                break;
            }
        }

        Assertions.assertTrue(isSectionFound, "Can't find menu item" + menuItemName);
    }
}
