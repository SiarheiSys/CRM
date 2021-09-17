package org.example.dairy;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.*;

public class RegistrationPage {
    private WebDriver driver;

    @FindBy(id = "signupform-username")
    private WebElement username;

    @FindBy(id = "signupform-password")
    private WebElement password;

    @FindBy(id = "signupform-email")
    private WebElement email;

    @FindBy(id = "chk_box_user_confirm")
    private WebElement checkBox;

    @FindBy(id = "signup_btn")
    private WebElement signUpBtn;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getCheckBox() {
        return checkBox;
    }

    public WebElement getSignUpBtn() {
        return signUpBtn;
    }

    @Step
    public RegistrationPage username(String a) {
        username.sendKeys(a);
        return this;
    }

    @Step
    public RegistrationPage password(String a){
        password.clear();
        String str = "";
        Assertions.assertTrue(str.equals(password.getAttribute("value")));
        password.sendKeys(a);
        return this;
    }

    @Step
    public RegistrationPage email(String a) {
        email.sendKeys(a);
        return this;
    }

    @Step
    public RegistrationPage checkBox() {
        checkBox.click();
        return this;
    }

    @Step
    public RegistrationPage signUpBtn() {
        signUpBtn.click();
        return this;
    }
}
