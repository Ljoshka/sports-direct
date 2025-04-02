package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class CatalogPage {
    private final By PRICE_FROM = By.id("PriceFilterTextEntryMin");
    private final By PRICE_TO = By.id("PriceFilterTextEntryMax");
    private final By FILTER_VALUE = By.xpath(".//span[@class = 'FilterValue']");
    private BaseFunc baseFunc;

    public CatalogPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void setPriceFilter(double priceFrom, double priceTo) {
        baseFunc.typeText(PRICE_FROM, String.valueOf(priceFrom));
        baseFunc.pressEnter(PRICE_FROM);

        baseFunc.waitForText(FILTER_VALUE, "Value_82");

        baseFunc.typeText(PRICE_TO, String.valueOf(priceTo));
        baseFunc.pressEnter(PRICE_TO);

        baseFunc.waitForText(FILTER_VALUE, "priceValue");

    }
}
