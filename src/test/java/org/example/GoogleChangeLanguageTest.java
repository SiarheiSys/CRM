package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GoogleChangeLanguageTest {
    private WebDriver driver;

    public void waitSimple(String str, int sec){
        new WebDriverWait(driver, sec).until(ExpectedConditions.titleContains(str));
    }

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @DisplayName("Смена языка")
    @Test
    public void changeLanguage() {
        driver.manage().window().maximize();
        driver.get("https://google.by");
        Assertions.assertNotNull(driver.findElement(By.xpath("//title[text()='Google']")), "Нет заголовка окна");
        Assertions.assertEquals("Google", driver.getTitle());
        Assertions.assertEquals("Войти", driver.findElement(By.xpath("//a[text()='Войти']")).getText());
        Assertions.assertEquals("Сервисы Google доступны на разных языках: Беларуская", driver.findElement(By.xpath("//div[text()='Сервисы Google доступны на разных языках:  ']")).getText());
        Assertions.assertEquals("Всё о Google", driver.findElement(By.xpath("//a[text()='Всё о Google']")).getText());
        Assertions.assertEquals("Реклама", driver.findElement(By.xpath("//a[text()='Реклама']")).getText());
        Assertions.assertEquals("Для бизнеса", driver.findElement(By.xpath("//a[text()='Для бизнеса']")).getText());
        Assertions.assertEquals("Как работает Google Поиск", driver.findElement(By.xpath("//a[text()='  Как работает Google Поиск ']")).getText());
        Assertions.assertEquals("Конфиденциальность", driver.findElement(By.xpath("//a[text()='Конфиденциальность']")).getText());
        Assertions.assertEquals("Условия", driver.findElement(By.xpath("//a[text()='Условия']")).getText());
        Assertions.assertEquals("Настройки", driver.findElement(By.xpath("//button[text()='Настройки']")).getText());
        driver.findElement(By.xpath("//a[text()='Беларуская']")).click();
        Assertions.assertNotNull(driver.findElement(By.xpath("//title[text()='Google']")), "Нет заголовка окна");
        Assertions.assertEquals("Google", driver.getTitle());
        Assertions.assertEquals("Увайсці", driver.findElement(By.xpath("//a[text()='Увайсці']")).getText());
        Assertions.assertEquals("Даступная мова: русский", driver.findElement(By.xpath("//div[text()='Даступная мова:  ']")).getText());
        Assertions.assertEquals("Пра Google", driver.findElement(By.xpath("//a[text()='Пра Google']")).getText());
        Assertions.assertEquals("Рэклама", driver.findElement(By.xpath("//a[text()='Рэклама']")).getText());
        Assertions.assertEquals("Бізнес", driver.findElement(By.xpath("//a[text()='Бізнес']")).getText());
        Assertions.assertEquals("Як працуе Пошук", driver.findElement(By.xpath("//a[text()='  Як працуе Пошук ']")).getText());
        Assertions.assertEquals("Прыватнасць", driver.findElement(By.xpath("//a[text()='Прыватнасць']")).getText());
        Assertions.assertEquals("Умовы", driver.findElement(By.xpath("//a[text()='Умовы']")).getText());
        Assertions.assertEquals("Налады", driver.findElement(By.xpath("//button[text()='Налады']")).getText());
    }
}
