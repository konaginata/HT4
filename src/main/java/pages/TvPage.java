package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TvPage extends BasePage {
    @FindBy(xpath = "//span[text()='Телевизоры']")
    private WebElement tvBox;
    @FindBy(xpath = "//label[@for='elm_checkbox_79_21_7416']")
    private WebElement samsungCheckbox;
    @FindBy(xpath = "//div[@class='cat-view-grid 1']")
    private List<WebElement> items;

    public TvPage(WebDriver driver) {
        super(driver);
    }

    public void clickTvBox() {
        tvBox.click();
    }

    public void clickSamsungCheckbox() {
        samsungCheckbox.click();
    }

    public List<WebElement> getItemsList() {
        return items;
    }
}
