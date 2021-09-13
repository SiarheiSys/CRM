package org.example.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public CrmStartPage usernameFieldSendKeys (String a) {
        usernameField.sendKeys(a);
        return this;
    }

    public CrmStartPage passwordFieldSendKeys (String a) {
        passwordField.sendKeys(a);
        return this;
    }

    public CrmStartPage submitBtnClick () {
        submitBtn.click();
        return this;
    }
}
