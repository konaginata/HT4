package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@class='ty-dropdown-box      ty-float-left']")
    private WebElement catalogButton;
    @FindBy(xpath = "//*[text()='Крупная бытовая техника']")
    private WebElement appliancesButton;
    @FindBy(xpath = "//span[text()='Стиральные машины и аксессуары']")
    private WebElement washingMachinesBox;
    @FindBy(xpath = "//a[@href='https://tid.ua/tv-audio-video-foto/']/div")
    private WebElement tvButton;
    @FindBy(xpath = "//input[@id='search_input']")
    private WebElement searchField;
    @FindBy(xpath = "//button[@class='ty-search-magnifier']")
    private WebElement searchButton;
    @FindBy(xpath = "//a[@href='/servesnyy-centr']")
    private WebElement serviceButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public void clickToCatalogButton() {
        catalogButton.click();
    }

    public void clickAppliances() {
        appliancesButton.click();
    }

    public void clickWashingMachinesBox() {
        washingMachinesBox.click();
    }

    public void clickTvButton() {
        tvButton.click();
    }

    public void searchByKeyword(final String keyword) {
        searchField.sendKeys(keyword);
        searchButton.click();
    }

    public void clickServiceButton() {
        serviceButton.click();
    }
}
