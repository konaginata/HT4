package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AppliancesPage extends BasePage {
    @FindBy(xpath = "//span[text()='Стиральные машины']")
    private WebElement washer;
    @FindBy(xpath = "//div[@class='ty-grid-list__item-name']")
    private List<WebElement> items;

    public AppliancesPage(WebDriver driver) {
        super(driver);
    }

    public void clickWasher() {
        washer.click();
    }

    public int countItems() {
        return getItemsList().size();
    }

    public List<WebElement> getItemsList() {
        return items;
    }
}
