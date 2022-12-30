package pm.academy.Taraspivala;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DealPage extends BasePage{
    @AndroidFindBy(accessibility = "placeBetButtonHint")
    private MobileElement placeBetButtonHint;

    public void clickPlaceBetButton(){
        waitForExpectedElement(placeBetButtonHint).click();
    }
}
