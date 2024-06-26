package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import pages.login.LoginPage;
import pages.profile.ProfilePage;

public class profileStepDef {
    static WebDriver driver;
    static ProfilePage profile;

    @BeforeClass
    public static void setupDriver() {
        driver = Hooks.getDriver();
        if (profile == null) {
            profile = new ProfilePage(driver);
        }
    }

}
