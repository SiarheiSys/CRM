// Generated by Selenium IDE
package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AuthorizationTest {
    private WebDriver driver;

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

    @DisplayName("Авторизация")
    @Test
    public void authorization() {
        driver.get("https://diary.ru/");
        Assertions.assertNotNull(driver.findElement(By.xpath("//title[text()='Главная страница — @дневники: асоциальная сеть']")), "Нет заголовка окна");
        Assertions.assertEquals("Главная страница — @дневники: асоциальная сеть", driver.getTitle());
        driver.manage().window().maximize();
        Assertions.assertEquals("Вход", driver.findElement(By.xpath("//a[@href='https://diary.ru/user/login']")).getText());
        driver.findElement(By.xpath("//a[@href='https://diary.ru/user/login']")).click();
        driver.findElement(By.id("loginform-username")).click();
        driver.findElement(By.id("loginform-username")).sendKeys("sissergey");
        Assertions.assertNotNull(driver.findElement(By.id("loginform-username")), "Поле 'логин' не заполнено");
        Assertions.assertEquals("sissergey", driver.findElement(By.id("loginform-username")).getAttribute("value"));
        driver.findElement(By.id("loginform-password")).click();
        driver.findElement(By.id("loginform-password")).sendKeys("63623400");
        Assertions.assertNotNull(driver.findElement(By.id("loginform-password")), "Поле 'логин' не заполнено");
        Assertions.assertEquals("63623400", driver.findElement(By.id("loginform-password")).getAttribute("value"));
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
        new WebDriverWait(driver, 30);
        driver.switchTo().defaultContent();
        Assertions.assertEquals("Войти", driver.findElement(By.id("login_btn")).getText());
        driver.findElement(By.id("login_btn")).click();
    }
}
