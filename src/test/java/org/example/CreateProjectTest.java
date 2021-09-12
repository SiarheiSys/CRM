package org.example;
// Generated by Selenium IDE

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;



public class CreateProjectTest {
  private WebDriver driver;

  public void waiting(String str, int sec) {
    new WebDriverWait(driver, sec).until(ExpectedConditions.titleContains(str));
  }

  public void waitSimple(int sec) {
    new WebDriverWait(driver, sec);
  }

  @BeforeEach
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @DisplayName("Создание проекта")
  @Test
  public void createProject() {
    driver.manage().window().maximize();
    driver.get("https://crm.geekbrains.space/user/login");
    Assertions.assertNotNull(driver.findElement(By.xpath("//title[text()='Логин']")), "Нет заголовка окна");
    Assertions.assertEquals("Логин", driver.getTitle());
    driver.findElement(By.name("_username")).sendKeys("Applanatest1");
    Assertions.assertNotNull(driver.findElement(By.name("_username")), "Поле 'логин' не заполнено");
    Assertions.assertEquals("Applanatest1", driver.findElement(By.name("_username")).getAttribute("value"));
    driver.findElement(By.name("_password")).sendKeys("Student2020!");
    Assertions.assertNotNull(driver.findElement(By.name("_password")), "Поле 'пароль' не заполнено");
    Assertions.assertEquals("Student2020!", driver.findElement(By.name("_password")).getAttribute("value"));
    Assertions.assertEquals("Войти", driver.findElement(By.id("_submit")).getText());
    driver.findElement(By.id("_submit")).click();
    waiting("Панель инструментов", 30);
    Assertions.assertNotNull(driver.findElement(By.xpath("//title[text()='Панель инструментов']")), "Нет заголовка окна");
    Assertions.assertEquals("Панель инструментов", driver.getTitle());
    driver.findElement(By.xpath("//span[text()='Проекты']")).click();
    driver.findElement(By.xpath("//span[text()='Мои проекты']")).click();
    waiting("Все - Мои проекты - Все проекты - Проекты", 30);
    Assertions.assertNotNull(driver.findElement(By.xpath("//title[text()='Все - Мои проекты - Все проекты - Проекты']")), "Нет заголовка окна");
    Assertions.assertEquals("Все - Мои проекты - Все проекты - Проекты", driver.getTitle());
    Assertions.assertEquals("Создать проект", driver.findElement(By.xpath("//a[@href='/project/create/' and text()='Создать проект']")).getText());
    driver.findElement(By.xpath("//a[@href='/project/create/' and text()='Создать проект']")).click();
    waiting("Создать проект - Все проекты - Проекты", 30);
    Assertions.assertNotNull(driver.findElement(By.xpath("//title[text()='Создать проект - Все проекты - Проекты']")), "Нет заголовка окна");
    Assertions.assertEquals("Создать проект - Все проекты - Проекты", driver.getTitle());
    driver.findElement(By.name("crm_project[name]")).sendKeys("Обучение AQA");
    Assertions.assertNotNull(driver.findElement(By.name("crm_project[name]")), "Поле 'Название проекта' не заполнено");
    Assertions.assertEquals("Обучение AQA", driver.findElement(By.name("crm_project[name]")).getAttribute("value"));
    driver.findElement(By.xpath("//span[text()='Укажите организацию']/following-sibling::span")).click();
    waitSimple(30);
    Assertions.assertTrue(driver.findElement(By.xpath("//div[@class='select2-result-label' and text()='123test']")).isDisplayed());
    driver.findElement(By.xpath("//div[@class='select2-result-label' and text()='123test']")).click();
    driver.findElement(By.xpath("//div[@class='select2-container select2']")).click();
    waitSimple(30);
    Assertions.assertTrue(driver.findElement(By.xpath("//div[@class='select2-result-label' and text()='Brown Bob']")).isDisplayed());
    driver.findElement(By.xpath("//div[@class='select2-result-label' and text()='Brown Bob']")).click();
    driver.findElement(By.name("crm_project[businessUnit]")).click();
    waitSimple(30);
    Assertions.assertTrue(driver.findElement(By.xpath("//option[text()='Research & Development']")).isDisplayed());
    driver.findElement(By.xpath("//option[text()='Research & Development']")).click();
    driver.findElement(By.name("crm_project[curator]")).click();
    waitSimple(30);
    Assertions.assertTrue(driver.findElement(By.xpath("//select[@name='crm_project[curator]']/option[text()='Ким Юрий']")).isDisplayed());
    driver.findElement(By.xpath("//select[@name='crm_project[curator]']/option[text()='Ким Юрий']")).click();
    driver.findElement(By.name("crm_project[rp]")).click();
    waitSimple(30);
    Assertions.assertTrue(driver.findElement(By.xpath("//select[@name='crm_project[rp]']/option[text()='Катков Александр']")).isDisplayed());
    driver.findElement(By.xpath("//select[@name='crm_project[rp]']/option[text()='Катков Александр']")).click();
    driver.findElement(By.name("crm_project[administrator]")).click();
    waitSimple(30);
    Assertions.assertTrue(driver.findElement(By.xpath("//select[@name='crm_project[administrator]']/option[text()='Исаева Анастасия']")).isDisplayed());
    driver.findElement(By.xpath("//select[@name='crm_project[administrator]']/option[text()='Исаева Анастасия']")).click();
    driver.findElement(By.name("crm_project[manager]")).click();
    waitSimple(30);
    Assertions.assertTrue(driver.findElement(By.xpath("//select[@name='crm_project[manager]']/option[text()='Зайдуллин Рустам']")).isDisplayed());
    driver.findElement(By.xpath("//select[@name='crm_project[manager]']/option[text()='Зайдуллин Рустам']")).click();
    Assertions.assertEquals("Сохранить и закрыть", driver.findElement(By.xpath("//button[@class='btn btn-success action-button']")).getText());
    driver.findElement(By.xpath("//button[@class='btn btn-success action-button']")).click();
  }
}
