package pm.academy.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pm.academy.configuration.capabilities.TestDataReader;
import pm.academy.driver.DriverManager;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class BasePage {

    protected BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }

    private static MobileElement waitForElementExplicitly(int waitValue, ExpectedCondition<?> isTrue) {
        return (MobileElement) new WebDriverWait(DriverManager.getDriver(), waitValue).until(isTrue);
    }

    public MobileElement waitForExpectedElement(MobileElement mobileElement) {
        return waitForElementExplicitly(TestDataReader.get().explicitWait(), visibilityOf(mobileElement));
    }
}
