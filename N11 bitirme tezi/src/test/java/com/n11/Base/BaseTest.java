package com.n11.Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    String baseUrl = "https://www.n11.com/";
    public WebDriver driver;
    WebDriverWait wait;
    protected String userName = "strawberry@gmail.com";
    protected String password = "gzv-89ZC7M?6NuB";
    protected String name = "Yıldız";
    protected String lastName ="Durmaz";
    protected String email ="strawberry@gmail.com" ;
    protected String phone = "5396367057";




    public BaseTest() {


    }


    @Before
    public void start() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(options);
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(05));
        driver.get(baseUrl);


    }

    @After
    public void finish() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


}
