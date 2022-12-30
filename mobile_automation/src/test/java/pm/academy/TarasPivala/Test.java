package pm.academy.TarasPivala;


import org.assertj.core.api.Assertions;
import pm.academy.Taraspivala.LoginPage;
import pm.academy.Taraspivala.SportPage;

public class Test extends BaseTest {
    @org.testng.annotations.Test
    public void testParimatch() {

        new LoginPage().clickCloseButton();
        new SportPage().clickOnSportTab();

        Assertions.assertThat(new SportPage().isSportPageDisplayed())
                .as("The Page Sport was not displayed")
                .isTrue();

        new SportPage().doFirstDeal();

        Assertions.assertThat(new LoginPage().isLoginPageDisplayed())
                .as("The Login Page is not displayed")
                .isTrue();
    }
}
