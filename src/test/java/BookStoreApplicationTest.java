

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.logging.Logger;
import org.slf4j.LoggerFactory;

public class BookStoreApplicationTest {
    private WebDriver webDriver;

    public BookStoreApplicationTest() {

    }

    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        this.webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Test
    public void loginTest (){

        webDriver.get("https://demoqa.com/books");
        webDriver.findElement(By.id("login")).click();
        webDriver.findElement(By.id("userName")).sendKeys("string");
        webDriver.findElement(By.id("password")).sendKeys("string");
        webDriver.findElement(By.id("login")).click();

    }

    @Test
    public void BookListTest (){

    }
    @After
    public void close() {
        webDriver.quit();

    }
}

