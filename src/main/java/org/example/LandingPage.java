package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    private WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickIkonProfile() {
        WebElement profileIcon = driver.findElement(By.className("w-100 h-auto ml-4"));
        profileIcon.click();
    }
}
