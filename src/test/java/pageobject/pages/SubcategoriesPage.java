package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

public class SubcategoriesPage {
    private final By SUBCATEGORY_NAME = By.xpath(".//span[@class = 'Typography_body2__IRySX Button_label__gHSoO']");
    private final By SUBCATEGORY_PAGE_TITLE = By.id("lnkTopLevelMenu_5033191");
    private BaseFunc baseFunc;

    public SubcategoriesPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectSubcategory(String subcategoryName) {
        for (WebElement we : baseFunc.findElements(SUBCATEGORY_NAME)) {
            if (we.getText().equals(subcategoryName)) {
                baseFunc.scrollToElement(we);
                we.click();
                break;
            }
        }

        baseFunc.waitForText(SUBCATEGORY_PAGE_TITLE, subcategoryName);
    }
}
