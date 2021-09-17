package org.example.dairy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.*;

public class NewBlogPage {
    private WebDriver driver;

    @FindBy(id = "newblogform-title")
    private WebElement title;

    @FindBy(name = "new-blogs-button")
    private WebElement btn;

    public NewBlogPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getBtn() {
        return btn;
    }

    @Step
    public NewBlogPage title(String a) {
        title.sendKeys(a);
        return this;
    }

    @Step
    public NewBlogPage btn() {
        btn.click();
        return this;
    }
}
