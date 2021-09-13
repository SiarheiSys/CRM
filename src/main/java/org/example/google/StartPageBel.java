package org.example.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPageBel {
    private WebDriver driver;

    @FindBy(xpath = "//title[text()='Google']")
    private WebElement title;

    @FindBy(xpath = "//a[text()='Увайсці']")
    private WebElement logIn;

    @FindBy(xpath = "//div[text()='Даступная мова:  ']")
    private WebElement text;

    @FindBy(xpath = "//a[text()='Пра Google']")
    private WebElement aboutGoogle;

    @FindBy(xpath = "//a[text()='Рэклама']")
    private WebElement ad;

    @FindBy(xpath = "//a[text()='Бізнес']")
    private WebElement forBusiness;

    @FindBy(xpath = "//a[text()='  Як працуе Пошук ']")
    private WebElement howItWorks;

    @FindBy(xpath = "//a[text()='Прыватнасць']")
    private WebElement confidential;

    @FindBy(xpath = "//a[text()='Умовы']")
    private WebElement terms;

    @FindBy(xpath = "//button[text()='Налады']")
    private WebElement settings;

    public StartPageBel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitle() {
        return title;
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
}
