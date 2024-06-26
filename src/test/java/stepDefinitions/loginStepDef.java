package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.BeforeClass;
import pages.login.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class loginStepDef {
    static WebDriver driver;
    static LoginPage login;

    @BeforeClass
    public static void setupDriver() {
        driver = Hooks.getDriver();
        if (login == null) {
            login = new LoginPage(driver);
        }
    }

    @Given("User mengakses halaman login")
    public void user_mengakses_halaman_login() {
        setupDriver();
        driver.get("http://127.0.0.1:8000/index/");
    }

    @When("User submit dengan kredensial yang valid")
    public void user_submit_dengan_kredensial_yang_valid() {
        login.inputEmail("annisaurohmah@mail.ugm.ac.id");
        login.inputPassword("abc123");
        login.clickSubmit();
    }

    @Then("Halaman landing page harus ditampilkan")
    public void halaman_landing_page_harus_ditampilkan() {
        String expectedUrl = "http://127.0.0.1:8000/";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }

}


