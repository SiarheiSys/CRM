package org.example.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.*;

public class SearchResultPage {
    private WebDriver driver;

    @FindBy(xpath = "//title[text()='Гомель - Поиск в Google']")
    private WebElement title;

    @FindBy(xpath = "//img[@src='/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png']")
    private WebElement logo;

    public SearchResultPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitle() {
        return title;
    }

    @Step
    public SearchResultPage logo() {
        logo.click();
        return this;
    }
}
