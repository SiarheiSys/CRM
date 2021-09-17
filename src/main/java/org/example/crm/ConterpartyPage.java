package org.example.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.*;

public class ConterpartyPage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='/contact/create' and text()='Создать контактное лицо']")
    private WebElement createConterparty;

    @FindBy(xpath = "//title[text()='Все - Контактные лица - Контактные лица - Контрагенты']")
    private WebElement title;

    public ConterpartyPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitle() {
        return title;
    }

    @Step
    public ConterpartyPage createConterpartyClick() {
        createConterparty.click();
        return this;
    }
}
