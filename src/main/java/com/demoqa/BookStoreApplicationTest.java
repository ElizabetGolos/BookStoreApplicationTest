package com.demoqa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BookStoreApplicationTest {
    private WebDriver webDriver;

    public BookStoreApplicationTest() {

    }

    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        this.webDriver = new ChromeDriver();
    }
}