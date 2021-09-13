package org.example.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PanelControlPage {
    private WebDriver driver;

    @FindBy(xpath = "//span[@class='title' and text()='Контрагенты']")
    private WebElement counterparty;

    @FindBy(xpath = "//span[@class='title' and text()='Контактные лица']")
    private WebElement contactPersons;

    @FindBy(xpath = "//span[text()='Проекты']")
    private WebElement projects;

    @FindBy(xpath = "//span[text()='Мои проекты']")
    private WebElement myProjects;

    @FindBy(xpath = "//title[text()='Панель инструментов']")
    private WebElement title;

    public PanelControlPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitle() {
        return title;
    }

    public PanelControlPage counterpartyClick() {
        counterparty.click();
        return this;
    }

    public PanelControlPage contactPersonsClick() {
        contactPersons.click();
        return this;
    }

    public PanelControlPage projectsClick() {
        projects.click();
        return this;
    }

    public PanelControlPage myProjectsClick() {
        myProjects.click();
        return this;
    }
}
