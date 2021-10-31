package it.movie.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;

public class SuiteSecondAppTradizionale {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testSuiteSecondAppTradizionale_release_1_0() throws Exception {
    driver.get("http://localhost:8080/movie");
    driver.findElement(By.id("nome_film")).click();
    driver.findElement(By.id("nome_film")).clear();
    driver.findElement(By.id("nome_film")).sendKeys("Avatar");
    driver.findElement(By.id("nome_utente")).click();
    driver.findElement(By.id("nome_utente")).clear();
    driver.findElement(By.id("nome_utente")).sendKeys("Marco92");
    driver.findElement(By.id("valutazione")).click();
    driver.findElement(By.id("valutazione")).clear();
    driver.findElement(By.id("valutazione")).sendKeys("9");
    driver.findElement(By.name("sendMovieData")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Delete'])[5]/following::a[1]")).click();
    driver.findElement(By.xpath("//form[@id='datiMovie']")).click();
    driver.findElement(By.id("valutazione")).clear();
    driver.findElement(By.id("valutazione")).sendKeys("10");
    driver.findElement(By.name("sendMovieData")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Marco92'])[1]/following::a[1]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

