package pages.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileObject {
    WebDriver driver;

    public ProfileObject (WebDriver driver){
        this.driver = driver;
    }

    public By getInputFirstName() {
        return By.id("first-name");
    }

    public By getInputLastName() {
        return By.id("last-name");
    }

    public By getInputEmail() {
        return By.id("email");
    }
}
