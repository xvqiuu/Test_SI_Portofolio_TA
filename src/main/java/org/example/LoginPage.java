package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        WebElement emailField = driver.findElement(By.id("email")); // Replace with actual ID of your email field
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("password")); // Replace with actual ID of your password field
        passwordField.sendKeys(password);
    }

    public void clickSubmit() {
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[4]/button")); // Replace with actual ID of your submit button
        submitButton.click();
    }

    public String getActualUrl() {
        return driver.getCurrentUrl();
    }
}
