package pm.academy.Taraspivala;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {

    @AndroidFindBy(accessibility = "close_button" )
    private MobileElement closeButton;
    @AndroidFindBy(id = "com.parimatch:id/tvButtonTitle" )
    private MobileElement logInButton;

    public void clickCloseButton(){
        waitForExpectedElement(closeButton).click();
    }
    public boolean isLoginPageDisplayed() {
        return waitForExpectedElement(logInButton).isDisplayed();
    }

}
