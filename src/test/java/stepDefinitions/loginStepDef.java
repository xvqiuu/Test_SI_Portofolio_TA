package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginStepDef {
    WebDriver driver;

    void setupFirefoxDriver() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Given("Pengguna mengakses halaman login")
    public void accesToLoginPage() {
        setupFirefoxDriver();
        driver.get("http://127.0.0.1:8000/index/");
    }

    @When("Pengguna submit dengan kredensial yang valid")
    public void profilePage() {
        LoginPage login = new LoginPage(driver);
        login.enterEmail("lutfilisanashidqi@mail.ugm.ac.id");
        login.enterPassword("abc123");
        login.clickSubmit();
    }

    @Then("Halaman dashboard harus ditampilkan")
    public void loginSuccessful() {
        String expectedUrl = "http://127.0.0.1:8000/";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }
}


