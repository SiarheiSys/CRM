package org.example;

import org.example.google.StartPageBel;
import org.example.google.StartPageRus;
import org.junit.jupiter.api.*;
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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @DisplayName("Смена языка")
    @Test
    public void changeLanguage() {
        driver.get("https://google.by");
        StartPageRus start = new StartPageRus(driver);
        Assertions.assertNotNull(start.getTitle(), "Нет заголовка окна");
        Assertions.assertEquals("Google", driver.getTitle());
        Assertions.assertEquals("Войти", start.getLogIn().getText());
        Assertions.assertEquals("Сервисы Google доступны на разных языках: Беларуская", start.getText().getText());
        Assertions.assertEquals("Всё о Google", start.getAboutGoogle().getText());
        Assertions.assertEquals("Реклама", start.getAd().getText());
        Assertions.assertEquals("Для бизнеса", start.getForBusiness().getText());
        Assertions.assertEquals("Как работает Google Поиск", start.getHowItWorks().getText());
        Assertions.assertEquals("Конфиденциальность", start.getConfidential().getText());
        Assertions.assertEquals("Условия", start.getTerms().getText());
        Assertions.assertEquals("Настройки", start.getSettings().getText());
        start.bel();
        StartPageBel startBel = new StartPageBel(driver);
        Assertions.assertNotNull(startBel.getTitle(), "Нет заголовка окна");
        Assertions.assertEquals("Google", driver.getTitle());
        Assertions.assertEquals("Увайсці", startBel.getLogIn().getText());
        Assertions.assertEquals("Даступная мова: русский", startBel.getText().getText());
        Assertions.assertEquals("Пра Google", startBel.getAboutGoogle().getText());
        Assertions.assertEquals("Рэклама", startBel.getAd().getText());
        Assertions.assertEquals("Бізнес", startBel.getForBusiness().getText());
        Assertions.assertEquals("Як працуе Пошук", startBel.getHowItWorks().getText());
        Assertions.assertEquals("Прыватнасць", startBel.getConfidential().getText());
        Assertions.assertEquals("Умовы", startBel.getTerms().getText());
        Assertions.assertEquals("Налады", startBel.getSettings().getText());
    }
}
