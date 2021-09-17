package org.example;

import org.example.google.SearchResultPage;
import org.example.google.StartPageRus;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleReturnToStartPageTest {
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
        LogEntries browserLogs = driver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> allLogRows = browserLogs.getAll();
        if (allLogRows.size() > 0 ) {
            try (BufferedWriter out = new BufferedWriter(new FileWriter("logs.log", true))){
                out.write(String.valueOf(allLogRows));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }

    @DisplayName("Возврат на стартовую страницу")
    @Test
    public void returnToStartPage() {
        driver.get("https://google.by");
        StartPageRus start = new StartPageRus(driver);
        Assertions.assertNotNull(start.getTitle(), "Нет заголовка окна");
        Assertions.assertEquals("Google", driver.getTitle());
        start.search("Гомель");
        Assertions.assertNotNull(start.getSearch(), "Поле 'Поиск' не заполнено");
        Assertions.assertEquals("Гомель", start.getSearch().getAttribute("value"));
        start.searchBtn();
        waitSimple("Гомель - Поиск в Google", 5);
        SearchResultPage result = new SearchResultPage(driver);
        Assertions.assertNotNull(result.getTitle(), "Нет заголовка окна");
        Assertions.assertEquals("Гомель - Поиск в Google", driver.getTitle());
        result.logo();
        waitSimple("Google", 5);
        Assertions.assertNotNull(start.getTitle(), "Нет заголовка окна");
        Assertions.assertEquals("Google", driver.getTitle());
    }
}
