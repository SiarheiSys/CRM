package org.example.dairy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {
    private WebDriver driver;

    @FindBy(id = "loginform-username")
    private WebElement login;

    @FindBy(id = "loginform-password")
    private WebElement password;

    @FindBy(css = ".recaptcha-checkbox-border")
    private WebElement recaptcha;

    @FindBy(id = "login_btn")
    private WebElement loginBtn;

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AuthorizationPage login(String a) {
        login.sendKeys(a);
        return this;
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public AuthorizationPage password(String a) {
        password.sendKeys(a);
        return this;
    }

    public AuthorizationPage recaptcha() {
        recaptcha.click();
        return this;
    }

    public AuthorizationPage loginBtn() {
        loginBtn.click();
        return this;
    }
}
