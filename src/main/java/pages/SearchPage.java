package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    @FindBy(xpath = "//img[@title=' Перфоратор Makita DHR202RX4, фото 1 ']")
    private WebElement perforatorBox;
    @FindBy(xpath = "//a[@class='cm-increase ty-value-changer__increase']")
    private WebElement plusButton;
    @FindBy(xpath = "//button[@name='dispatch[checkout.add..227174]']")
    private WebElement buyButton;
    @FindBy(xpath = "//div[@class='ty-product-notification__subtotal ty-float-right']//span")
    private WebElement price;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPrice() {
        return price;
    }

    public void clickPerforatorBox() {
        perforatorBox.click();
    }

    public void clickBuyButton() {
        buyButton.click();
    }

    public void clickPlusButton() {
        plusButton.click();
    }

    public String getTextFromAmount() {
        return price.getText();
    }
}
