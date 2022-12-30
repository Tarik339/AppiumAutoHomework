package pm.academy.Taraspivala;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SportPage extends BasePage{
    @AndroidFindBy(accessibility = "sport-tab")
    private MobileElement sportTab;
    @AndroidFindBy(xpath = "(//*[contains(@content-desc, 'eventCard')])[1]")
    private MobileElement firstDeal;
    @AndroidFindBy(xpath = "(//*[contains(@content-desc, 'outcome_1')])")
    private MobileElement doFirstDeal;

    public void clickOnSportTab(){
        waitForExpectedElement(sportTab).click();
    }
    public boolean isSportPageDisplayed() {
        return waitForExpectedElement(firstDeal).isDisplayed();
    }
    public void doFirstDeal() {
        waitForExpectedElement(doFirstDeal).click();
    }

}

