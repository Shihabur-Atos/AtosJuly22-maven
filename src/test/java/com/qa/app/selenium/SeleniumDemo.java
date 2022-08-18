package com.qa.app.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class SeleniumDemo {

    private RemoteWebDriver driver;// driver class to handle every browser

//	@BeforeAll//beforeClass

    @BeforeEach // before
    // open a browser
    public void setup() {
        System.setProperty("webdriver.chrome.driver","src/test/java/com/qa/app/resources/chromedriver.exe");
        this.driver = new ChromeDriver();// linking our driver to chrome - expecting a Chrome browser
        this.driver.manage().window().maximize();// maximise the pop-up window

		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit wait
    }

    @Test
    public void basicTest() {
        driver.get("https://bing.com");
        assertEquals("Search", driver.getTitle());
    }

    @Test
    public void testGoogle() {
        this.driver.get("https://www.google.com/");
        WebElement agreeBtn = this.driver.findElement(By.id("L2AGLb"));// finds the "Accept all" button by its id
        agreeBtn.click();// Clicks the button
        WebElement searchBar = this.driver.findElement(By.name("q"));// finds the search bar
        searchBar.sendKeys("disney");// type in "disney" into the search bar
        searchBar.sendKeys(Keys.ENTER);// alternative: searchBar.submit(); - press enter
        WebElement text = this.driver.findElement(By.cssSelector("#kp-wp-tab-overview > div.TzHB6b.cLjAic.LMRCfc > div > div > div > div > div > div:nth-child(4)"));
        Assertions.assertTrue(text.getText().contains("16 October 1923"));
    }

    @Test
    public void testQA() {
        this.driver.get("https://www.google.com/");
    }

    @AfterEach //after
    public void closeBrowser() {
        this.driver.close();//close the pop-up page once the test is completed
    }

//	@AfterAll//afterClass

}