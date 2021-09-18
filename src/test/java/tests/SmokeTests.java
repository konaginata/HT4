package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest {
    private static final long DEFAULT_WAITING_TIME = 90;

    @Test
    public void checkThatCatalogChoiceAppliancesShows12Item() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickToCatalogButton();
        getHomePage().clickAppliances();
        getHomePage().clickWashingMachinesBox();
        getAppliancesPage().clickWasher();
        assertEquals(getAppliancesPage().countItems(), 12);
    }

    @Test
    public void checkThat2ItemsCanBeOrderedByExactSearch() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getSearchField());
        getHomePage().searchByKeyword("Перфоратор Makita DHR202RX4");
        getSearchPage().clickPerforatorBox();
        getSearchPage().clickPlusButton();
        getSearchPage().clickBuyButton();
        assertEquals(getSearchPage().getTextFromAmount(), "24 376");
    }

    @Test
    public void testThatCheckBoxCallsOnlySamsung() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickToCatalogButton();
        getHomePage().clickTvButton();
        getTvPage().clickTvBox();
        getTvPage().clickSamsungCheckbox();
        for (WebElement we : getTvPage().getItemsList()) {
            assertTrue(we.getText().contains("Samsung"));
        }
    }

    @Test
    public void testThatUrlContainsWords() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickServiceButton();
        assertTrue(getCurrentUrl().contains("servesnyy-centr"));
    }
}
