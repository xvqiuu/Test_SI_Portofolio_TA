package pages.profile;

import org.openqa.selenium.WebDriver;
import pages.login.LoginObject;

public class ProfilePage {
    WebDriver driver;
    ProfileObject profileObject;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        profileObject = new ProfileObject(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void inputFirstName(String firstname) {
        driver.findElement(profileObject.getInputFirstName()).sendKeys(firstname);
    }

    public void inputLastName(String lastname) {
        driver.findElement(profileObject.getInputLastName()).sendKeys(lastname);
    }

    public void inputEmail(String email) {
        driver.findElement(profileObject.getInputEmail()).sendKeys(email);
    }
}
