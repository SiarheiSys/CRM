package org.example;
// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateContactPersonTest {
  private WebDriver driver;

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void createContactPerson() {
    driver.get("https://crm.geekbrains.space/user/login");
    driver.manage().window().setSize(new Dimension(1550, 838));
    driver.findElement(By.name("_username")).sendKeys("Applanatest1");
    driver.findElement(By.name("_password")).click();
    driver.findElement(By.name("_password")).sendKeys("Student2020!");
    driver.findElement(By.id("_submit")).click();
    new WebDriverWait(driver, 30).until(ExpectedConditions.titleContains("Панель инструментов"));
    driver.findElement(By.xpath("//span[@class='title' and text()='Контрагенты']")).click();
    driver.findElement(By.xpath("//span[@class='title' and text()='Контактные лица']")).click();
    new WebDriverWait(driver, 30).until(ExpectedConditions.titleContains("Все - Контактные лица - Контактные лица - Контрагенты"));
    driver.findElement(By.xpath("//a[@href='/contact/create' and text()='Создать контактное лицо']")).click();
    new WebDriverWait(driver, 30).until(ExpectedConditions.titleContains("Создать контактное лицо - Контактные лица - Контрагенты"));
    driver.findElement(By.name("crm_contact[lastName]")).click();
    driver.findElement(By.name("crm_contact[lastName]")).sendKeys("Сыс");
    driver.findElement(By.name("crm_contact[firstName]")).click();
    driver.findElement(By.name("crm_contact[firstName]")).sendKeys("Сергей");
    driver.findElement(By.cssSelector(".select2-arrow")).click();
    new WebDriverWait(driver, 30);
    driver.findElement(By.xpath("//div[@class='select2-result-label' and text()='123test']")).click();
    driver.findElement(By.name("crm_contact[jobTitle]")).click();
    driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys("Генеральный директор");
    driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn")).click();
  }
}
