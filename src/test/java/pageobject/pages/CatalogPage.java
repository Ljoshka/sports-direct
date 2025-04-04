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
        String priceFromAsText = String.valueOf(priceFrom);
        String priceToAsText = String.valueOf(priceTo);

        baseFunc.typeTextInCustomField(PRICE_FROM, priceFromAsText);
        baseFunc.pressEnter(PRICE_FROM);

        baseFunc.waitForText(FILTER_VALUE, "Value_82");

        baseFunc.typeTextInCustomField(PRICE_TO, priceToAsText);
        baseFunc.pressEnter(PRICE_TO);

        baseFunc.waitForText(FILTER_VALUE, "priceValue");

    }
}
