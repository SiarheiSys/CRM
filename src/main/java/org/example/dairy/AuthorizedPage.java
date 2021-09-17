package org.example.dairy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.*;

public class AuthorizedPage {
    private WebDriver driver;

    @FindBy(xpath = "//span[text()='Мой дневник']")
    private WebElement my;

    public AuthorizedPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getMy() {
        return my;
    }

    @Step
    public AuthorizedPage my() {
        my.isDisplayed();
        return this;
    }
}
