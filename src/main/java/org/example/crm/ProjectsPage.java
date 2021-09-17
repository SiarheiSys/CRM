package org.example.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.*;

public class ProjectsPage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='/project/create/' and text()='Создать проект']")
    private WebElement createProjects;

    @FindBy(xpath = "//title[text()='Все - Мои проекты - Все проекты - Проекты']")
    private WebElement title;

    public ProjectsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getCreateProjects() {
        return createProjects;
    }

    @Step
    public ProjectsPage createProjectsClick() {
        createProjects.click();
        return this;
    }
}
