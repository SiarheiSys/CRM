package org.example.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.*;

public class CrmStartPage {
    private WebDriver driver;

    @FindBy(name = "_username")
    private WebElement usernameField;

    @FindBy(name = "_password")
    private WebElement passwordField;

    @FindBy(id = "_submit")
    private WebElement submitBtn;

    @FindBy(xpath = "//title[text()='Логин']")
    private WebElement title;

    public CrmStartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }

    @Step("Ввод логина")
    public CrmStartPage usernameFieldSendKeys (String a) {
        usernameField.sendKeys(a);
        return this;
    }

    @Step("Ввод пароля")
    public CrmStartPage passwordFieldSendKeys (String a) {
        passwordField.sendKeys(a);
        return this;
    }

    @Step("Вход")
    public CrmStartPage submitBtnClick () {
        submitBtn.click();
        return this;
    }
}
