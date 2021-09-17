package org.example.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.*;

public class StartPageRus {
    private WebDriver driver;

    @FindBy(xpath = "//title[text()='Google']")
    private WebElement title;

    @FindBy(xpath = "//input[@title='Поиск']")
    private WebElement search;

    @FindBy(xpath = "//input[@value='Поиск в Google']")
    private WebElement searchBtn;

    @FindBy(xpath = "//a[text()='Войти']")
    private WebElement logIn;

    @FindBy(xpath = "//div[text()='Сервисы Google доступны на разных языках:  ']")
    private WebElement text;

    @FindBy(xpath = "//a[text()='Всё о Google']")
    private WebElement aboutGoogle;

    @FindBy(xpath = "//a[text()='Реклама']")
    private WebElement ad;

    @FindBy(xpath = "//a[text()='Для бизнеса']")
    private WebElement forBusiness;

    @FindBy(xpath = "//a[text()='  Как работает Google Поиск ']")
    private WebElement howItWorks;

    @FindBy(xpath = "//a[text()='Конфиденциальность']")
    private WebElement confidential;

    @FindBy(xpath = "//a[text()='Условия']")
    private WebElement terms;

    @FindBy(xpath = "//button[text()='Настройки']")
    private WebElement settings;

    @FindBy(xpath = "//a[text()='Беларуская']")
    private WebElement bel;

    public StartPageRus(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getSearch() {
        return search;
    }

    public WebElement getLogIn() {
        return logIn;
    }

    public WebElement getText() {
        return text;
    }

    public WebElement getAboutGoogle() {
        return aboutGoogle;
    }

    public WebElement getAd() {
        return ad;
    }

    public WebElement getForBusiness() {
        return forBusiness;
    }

    public WebElement getHowItWorks() {
        return howItWorks;
    }

    public WebElement getConfidential() {
        return confidential;
    }

    public WebElement getTerms() {
        return terms;
    }

    public WebElement getSettings() {
        return settings;
    }

    @Step
    public StartPageRus search(String a) {
        search.sendKeys(a);
        return this;
    }

    @Step
    public StartPageRus searchBtn() {
        searchBtn.click();
        return this;
    }

    @Step
    public StartPageRus bel() {
        bel.click();
        return this;
    }
}
