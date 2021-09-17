package org.example.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.*;

public class CreateProjectPage {
    private WebDriver driver;

    @FindBy(name = "crm_project[name]")
    WebElement name;

    @FindBy(xpath = "//span[text()='Укажите организацию']/following-sibling::span")
    WebElement chooseOrganisation;

    @FindBy(xpath = "//div[@class='select2-result-label' and text()='123test']")
    private WebElement organisation;

    @FindBy(xpath = "//div[@class='select2-container select2']")
    private WebElement choosePerson;

    @FindBy(xpath = "//div[@class='select2-result-label' and text()='Brown Bob']")
    private WebElement person;

    @FindBy(name = "crm_project[businessUnit]")
    private WebElement chooseBusinessUnit;

    @FindBy(xpath = "//option[text()='Research & Development']")
    private WebElement businessUnit;

    @FindBy(name = "crm_project[curator]")
    private WebElement chooseCurator;

    @FindBy(xpath = "//select[@name='crm_project[curator]']/option[text()='Ким Юрий']")
    private WebElement curator;

    @FindBy(name = "crm_project[rp]")
    private WebElement chooseProjectHead;

    @FindBy(xpath = "//select[@name='crm_project[rp]']/option[text()='Катков Александр']")
    private WebElement projectHead;

    @FindBy(name = "crm_project[administrator]")
    private WebElement chooseAdministrator;

    @FindBy(xpath = "//select[@name='crm_project[administrator]']/option[text()='Исаева Анастасия']")
    private WebElement administrator;

    @FindBy(name = "crm_project[manager]")
    private WebElement chooseManager;

    @FindBy(xpath = "//select[@name='crm_project[manager]']/option[text()='Зайдуллин Рустам']")
    private WebElement manager;

    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    private WebElement saveAndCloseBtn;

    @FindBy(xpath = "//title[text()='Создать проект - Все проекты - Проекты']")
    private WebElement title;

    public CreateProjectPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getOrganisation() {
        return organisation;
    }

    public WebElement getPerson() {
        return person;
    }

    public WebElement getBusinessUnit() {
        return businessUnit;
    }

    public WebElement getCurator() {
        return curator;
    }

    public WebElement getProjectHead() {
        return projectHead;
    }

    public WebElement getAdministrator() {
        return administrator;
    }

    public WebElement getManager() {
        return manager;
    }

    public WebElement getSaveAndCloseBtn() {
        return saveAndCloseBtn;
    }

    @Step
    public CreateProjectPage nameSendKeys(String a) {
        name.sendKeys(a);
        return this;
    }

    @Step
    public CreateProjectPage chooseOrganisationClick() {
        chooseOrganisation.click();
        return this;
    }

    @Step
    public CreateProjectPage organisationClick() {
        organisation.click();
        return this;
    }

    @Step
    public CreateProjectPage choosePersonClick() {
        choosePerson.click();
        return this;
    }

    @Step
    public CreateProjectPage personClick() {
        person.click();
        return this;
    }

    @Step
    public CreateProjectPage chooseBusinessUnitClick() {
        chooseBusinessUnit.click();
        return this;
    }

    @Step
    public CreateProjectPage businessUnitClick() {
        businessUnit.click();
        return this;
    }

    @Step
    public CreateProjectPage chooseCuratorClick() {
        chooseCurator.click();
        return this;
    }

    @Step
    public CreateProjectPage curatorClick() {
        curator.click();
        return this;
    }

    @Step
    public CreateProjectPage chooseProjectHeadClick() {
        chooseProjectHead.click();
        return this;
    }

    @Step
    public CreateProjectPage projectHeadClick() {
        projectHead.click();
        return this;
    }

    @Step
    public CreateProjectPage chooseAdministratorClick() {
        chooseAdministrator.click();
        return this;
    }

    @Step
    public CreateProjectPage administratorClick() {
        administrator.click();
        return this;
    }

    @Step
    public CreateProjectPage chooseManagerClick() {
        chooseManager.click();
        return this;
    }

    @Step
    public CreateProjectPage managerClick() {
        manager.click();
        return this;
    }

    @Step
    public CreateProjectPage saveAndCloseBtnClick() {
        saveAndCloseBtn.click();
        return this;
    }
}
