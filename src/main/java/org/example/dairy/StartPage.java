package org.example.dairy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.*;

public class StartPage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='https://diary.ru/user/login']")
    private WebElement entry;

    @FindBy(xpath = "//a[@href='https://diary.ru/user/registration']")
    private WebElement reg;

    @FindBy(xpath = "//title[text()='Главная страница — @дневники: асоциальная сеть']")
    private WebElement title;

    public StartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getEntry() {
        return entry;
    }

    public WebElement getReg() {
        return reg;
    }

    @Step
    public StartPage entryClick() {
        entry.click();
        return this;
    }

    @Step
    public StartPage reg() {
        reg.click();
        return this;
    }
}
