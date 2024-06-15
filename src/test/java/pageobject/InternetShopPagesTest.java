package pageobject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.pages.HomePage;

public class InternetShopPagesTest {
    @Test
   public void testOnPages() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("sportsdirect.com");

        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.selectMenuItem("Kids");
    }
}
