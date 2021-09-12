package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.Set;
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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @DisplayName("Возврат на стартовую страницу")
    @Test
    public void returnToStartPage() {
        driver.get("https://google.by");
        Assertions.assertNotNull(driver.findElement(By.xpath("//title[text()='Google']")), "Нет заголовка окна");
        Assertions.assertEquals("Google", driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@title='Поиск']")).click();
        driver.findElement(By.xpath("//input[@title='Поиск']")).sendKeys("Гомель");
        Assertions.assertNotNull(driver.findElement(By.xpath("//input[@title='Поиск']")), "Поле 'Поиск' не заполнено");
        Assertions.assertEquals("Гомель", driver.findElement(By.xpath("//input[@title='Поиск']")).getAttribute("value"));
        driver.findElement(By.xpath("//input[@value='Поиск в Google']")).click();
        waitSimple("Гомель - Поиск в Google", 5);
        Assertions.assertNotNull(driver.findElement(By.xpath("//title[text()='Гомель - Поиск в Google']")), "Нет заголовка окна");
        Assertions.assertEquals("Гомель - Поиск в Google", driver.getTitle());
        driver.findElement(By.xpath("//img[@src='/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png']")).click();
        waitSimple("Google", 5);
        Assertions.assertNotNull(driver.findElement(By.xpath("//title[text()='Google']")), "Нет заголовка окна");
        Assertions.assertEquals("Google", driver.getTitle());
    }
}
