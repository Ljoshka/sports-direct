package pageobject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.pages.CatalogPage;
import pageobject.pages.HomePage;
import pageobject.pages.SubcategoriesPage;

public class InternetShopPagesTest {
    @Test
   public void testOnPages() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("sportsdirect.com");

        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.selectMenuItem("Kids");

        SubcategoriesPage subcategoriesPage = new SubcategoriesPage(baseFunc);
        subcategoriesPage.selectSubcategory("Hoodies");
        subcategoriesPage.selectSubcategory("Trainers");

        CatalogPage catalogPage = new CatalogPage(baseFunc);
        catalogPage.setPriceFilter(25.0, 35);
    }
}
