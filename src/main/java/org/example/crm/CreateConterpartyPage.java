package org.example.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateConterpartyPage {
    private WebDriver driver;

    @FindBy(name = "crm_contact[lastName]")
    private WebElement lastName;

    @FindBy(name = "crm_contact[firstName]")
    private WebElement firstName;

    @FindBy(css = ".select2-arrow")
    private WebElement arrow;

    @FindBy(xpath = "//div[@class='select2-result-label' and text()='123test']")
    private WebElement result;

    @FindBy(name = "crm_contact[jobTitle]")
    private WebElement jobTitle;

    @FindBy(css = ".btn-group:nth-child(4) > .btn")
    private WebElement saveAndCloseBtn;

    @FindBy(xpath = "//title[text()='Создать контактное лицо - Контактные лица - Контрагенты']")
    private WebElement title;

    public CreateConterpartyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getResult() {
        return result;
    }

    public WebElement getJobTitle() {
        return jobTitle;
    }

    public WebElement getSaveAndCloseBtn() {
        return saveAndCloseBtn;
    }

    public CreateConterpartyPage lastNameSendKeys(String a) {
        lastName.sendKeys(a);
        return this;
    }

    public CreateConterpartyPage firstNameSendKeys(String a) {
        firstName.sendKeys(a);
        return this;
    }

    public CreateConterpartyPage arrowClick() {
        arrow.click();
        return this;
    }

    public CreateConterpartyPage resultClick() {
        result.click();
        return this;
    }

    public CreateConterpartyPage jobTitleSendKeys(String a) {
        jobTitle.sendKeys(a);
        return this;
    }

    public CreateConterpartyPage saveAndCloseBtnClick() {
        saveAndCloseBtn.click();
        return this;
    }
}
