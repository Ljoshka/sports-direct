package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class HomePage {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void acceptCookies() {
        baseFunc.click(ACCEPT_COOKIES_BTN);
    }

    public void selectMenuItem(String menuItemName) {
                
    }
}
